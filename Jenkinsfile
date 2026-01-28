pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test (Main)') {
            when {
                branch 'main'
            }
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test Only (Feature)') {
            when {
                branch pattern: "feature/.*", comparator: "REGEXP"
            }
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Test & Scan (Release)') {
            when {
                branch pattern: "release/.*", comparator: "REGEXP"
            }
            steps {
                bat 'mvn clean test'
                echo 'Security scan simulated'
            }
        }
    }
}
