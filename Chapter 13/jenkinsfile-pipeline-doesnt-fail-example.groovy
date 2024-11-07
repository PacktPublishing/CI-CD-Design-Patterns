pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          try {
            sh '''
              echo "Building..."
              exit 1
            '''
          } catch(Exception e) {
            echo "Build failed with error: ${e.getMessage()}"
          }
        }
      }
    }
  }
}