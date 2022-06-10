def call(String repoUrl) {
  pipeline {
       agent any
       tools {
         maven "Maven3"
       }
     stage("Checkout Code") {
               steps {
                   git branch: 'master'
               }
     }
       stage("Build") {
               steps {
                   sh "mvn clean install"
               }
           }
  }
}
