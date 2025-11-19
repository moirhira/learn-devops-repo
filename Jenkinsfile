pipeline {
        agent any 
        tools {
                nodejs 'Node22'
        }
        stages {
                stage('Install Dependencies'){
                        steps{
                                echo "Installing dependencies..."
                                sh 'npm install'
                        }
                }
                stage('Run Tests'){
                        steps{
                                echo "Testing..."
                                sh 'npm test'
                        }
                }

        }
}