pipeline {
  agent any
  stages {
    stage('Example') {
      steps {
        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
          // Your build steps go here
        }
      }
    }
  }
}
