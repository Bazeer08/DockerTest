pipeline {
    agent any
  //triggers {pollSCM('* * * * *')}
  stages {
    stage('Checkout') {
      steps {
        // Get some code from a GitHub repository
        git branch: "master", url:'https://github.com/Bazeer08/DockerTest.git'
      }
    }
        stage('Build') {
      steps {
        //sh 'chmod a+x mvnw'
       // bat 'chmod a+x mvnw'
        bat './mvnw clean package -DskipTests=true'
      }

          post {
        always {
          archiveArtifacts 'target/*.jar'
        }
          }
        }
      /*  stage('DockerBuild') {
      steps {
        sh 'docker build -t jasdhir/emp-rest:latest .'
      }
        }*/

  }
}
