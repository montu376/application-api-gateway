pipeline{

    agent any


    stages{
        stage('Printing msg'){
            steps {
                sh 'echo "hello world"'
            }
        }

        stage('docker test'){
            agent {
                label 'docker'
            }
            steps {
                sh 'docker images'
            }
        }
    }


}