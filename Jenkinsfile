pipeline{
    agent any
    
    stages{
        stage('Printing msg'){
            agent {
                label 'montuUbuntu'
            }
            steps {
                sh 'mvn package'
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
    post{
        agent {
            label 'montuUbuntu'
        }
        always{
            archiveArtifacts artifacts: 'target/*.jar'
            junit 'build/reports/**/*.xml'
        }
            
    }


}