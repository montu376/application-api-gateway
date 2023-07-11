pipeline{
    agent any
    
    stages{
        stage('Building Image and dockerzing it'){

            agent{
                label 'montuUbuntu'
            }
            steps {
                sh 'mvn package' 
                sh 'docker build -t montud/application-api-gateway:latest .'
            }

        } 

        stage('docker push'){
            steps {
                sh 'docker push montud/application-api-gateway:latest'
            }
        }


        stage('Kubernates deploy'){
            steps {
                bat 'C:\\Users\\coolm\\kubectl.exe apply -f deploy.yml'
            }
        }
    }
    


}