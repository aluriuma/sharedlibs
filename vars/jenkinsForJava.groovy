def call(String repoUrl) {
  pipeline {
       agent any
       tools {
         maven "Maven3"
       }
    stages {
     stage("Checkout Code") {
               steps {
                   git branch: 'main',
                 url: "${repoUrl}"
               }
     }
       stage("Build") {
               steps {
                   sh "mvn clean install"
               }
           }
    }
  }
}
