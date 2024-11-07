pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Here you can add the commands to build your project, e.g., `mvn package`
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Here you can add the commands to test your project, e.g., `mvn test`
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Here you can add the commands to deploy your project
            }
        }
    }
}