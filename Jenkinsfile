pipeline{
    agent any
    
    tools{
        git 'git'
    }

    
    stages{
        stage('Building Image and dockerzing it'){

            tools{
                git 'linuxgit'
            }

            agent{
                label 'montuUbuntu'
            }
            steps {
                sh 'mvn package -DskipTests' 
                sh 'docker build -t montud/application-api-gateway:latest .'
            }

        } 

        stage('docker push'){
            tools{
                git 'linuxgit'
            }

            agent{
                label 'montuUbuntu'
            }
            steps {
                sh 'docker push montud/application-api-gateway:latest'
            }
        }


        stage('Kubernates deploy'){
            tools{
                git 'linuxgit'
            }

            agent{
                label 'microkube'
            }
            steps {
                sh 'microk8s kubectl apply -f deploy.yml'
            }
        }
    }
    


}