pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
      // Build steps
      }
    }
    stage('SonarQube Analysis') {
      steps {
        script {
          def scannerHome = tool 'SonarQube Scanner'
          withSonarQubeEnv('SonarQube') {
            sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=my-project -Dsonar.sources=src"
          }
        }
      }
    }
    stage('Quality Gate') {
      steps {
        timeout(time: 1, unit: 'HOURS') {
          waitForQualityGate abortPipeline: true
        }
      }
    }
  }
}