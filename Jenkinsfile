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
                stage('Deploy to vercel...'){
                        steps {
                                echo 'Deploying to vercel...'
                                withCredentials([string(credentialsId: 'VERCEL_TOKEN', variable: 'VERCEL_TOKEN')]){
                                        sh      '''
                                                npm install -g vercel
                                                vercel --prod --token \$VERCEL_TOKEN --confirm
                                                '''
                                }
                        }
                }
        }
}