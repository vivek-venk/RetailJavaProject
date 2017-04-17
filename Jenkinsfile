pipeline {
  agent any
  stages {
    stage('GitCheckout') {
      steps {
        git(url: 'https://github.com/SudhirG85/Retail-Webapp.git', branch: 'master', poll: true)
      }
    }
    stage('build job') {
      steps {
        build 'buildjob'
      }
    }
  }
}