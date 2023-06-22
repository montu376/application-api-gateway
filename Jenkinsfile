pipeline{
    agent any
    
    stages{
        stage('Building Image and dockerzing it'){
            agent {
                label 'docker-ubuntu'
            }
            steps {
                sh 'mvn package'
                sh 'docker build -t montud/application-api-gateway:latest .'
            }

            post{
                success{
                    archiveArtifacts artifacts: 'target/*.jar'
                    junit 'surefire-reports/*.xml'
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