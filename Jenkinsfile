pipeline{
        agent any 
        tools{
                nodejs 'Node22'
        }
        stages{
                stage('Install Dependencies'){
                        steps{
                                echo 'Install Dependencies...'
                                sh 'npm install'
                        }
                }
                stage('Build Project'){
                        steps{
                                echo "Build project..."
                                sh 'npm run build'
                        }
                }
        }
}