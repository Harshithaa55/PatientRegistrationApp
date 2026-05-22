pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/Harshithaa55/PatientRegistrationApp.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t simplemavenproject .'
            }
        }

    }

    post {

        success {
            mail to: 'hsharshitha46@gmail.com',
            subject: 'BUILD SUCCESS',
            body: 'Simple Maven Project Build Successful'
        }

        failure {
            mail to: 'hsharshitha46@gmail.com',
            subject: 'BUILD FAILED',
            body: 'Simple Maven Project Build Failed'
        }

    }
}
