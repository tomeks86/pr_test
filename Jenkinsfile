pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args '-v /home/tomasz/.m2'
    }

  }
  stages {
    stage('initialization') {
      steps {
        sh 'echo PATH = ${PATH}; echo M2_HOME = ${M2_HOME}; mvn clean'
      }
    }
    stage('build') {
      steps {
        sh 'mvn  -Dmaven.test.failure.ignore=true install'
      }
    }
    stage('report') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
        archiveArtifacts 'target/*.jar'
      }
    }
  }
}