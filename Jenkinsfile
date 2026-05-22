pipeline {

    agent any

    tools {
        maven 'Maven'
    }

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
                sh 'sudo docker build -t patientregistrationapp .'
            }
        }

    }

    post {

        success {
            mail to: 'hsharshitha46@gmail.com',
            subject: 'BUILD SUCCESS',
            body: 'Patient Registration App Build Successful'
        }

        failure {
            mail to: 'hsharshitha46@gmail.com',
            subject: 'BUILD FAILED',
            body: 'Patient Registration App Build Failed'
        }

    }
}
