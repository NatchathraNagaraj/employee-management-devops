pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('Docker Version') {
            steps {
                bat 'docker --version'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t employee-management .'
            }
        }
    }

    post {
        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}