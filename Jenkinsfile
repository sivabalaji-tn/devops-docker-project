pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo "Cloning happens automatically"
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t java-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run --rm java-app'
            }
        }
    }
}
