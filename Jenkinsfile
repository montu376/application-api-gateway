pipeline{
    agent any
    
    stages{
        stage('Printing msg'){
            agent {
                label 'montuUbuntu'
            }
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }
       
        stage('docker test'){
            agent {
                label 'docker-ubuntu'
            }
            steps {
                sh 'docker images'
            }
        }
    }


}