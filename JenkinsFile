pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                bat 'mvn  clean install' 
            }
        }
stage('Cucumber') {
          steps {
            cucumber '**/*.json'
          }
        }
    }
}
