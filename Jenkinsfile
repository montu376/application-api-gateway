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

            post{
                success{
                    archiveArtifacts artifacts: 'target/*.jar'
                    junit 'build/reports/**/*.xml'
                }        
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