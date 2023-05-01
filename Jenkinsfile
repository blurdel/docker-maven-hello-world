pipeline {
    agent {
        docker { image 'maven:3.6.3-jdk-11-slim' }
    }

    stages {
        stage('Versions') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
    }

}
