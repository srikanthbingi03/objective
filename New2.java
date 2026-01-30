pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git branch: 'abranch',
                    url: 'https://github.com/srikanthbingi03/objective.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac New2.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java New2'
            }
        }
    }
}
