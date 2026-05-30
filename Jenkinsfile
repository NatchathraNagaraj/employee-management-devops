pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning source code'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}