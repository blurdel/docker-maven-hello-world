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
        stage('Install') {
            steps {
                sh 'mvn clean install'
            }
        }
    }

}