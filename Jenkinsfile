pipeline{
        agent any 
        tools{
                nodejs 'NodeJS 22.20.0'
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