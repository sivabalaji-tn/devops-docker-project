pipeline {
    agent any

    stages {
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t java-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run --rm java-app'
            }
        }
    }
}
