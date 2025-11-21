pipeline {
        agent any 
        tools {
                nodejs 'nodejs-22.20'
        }
        stages {
                stage('Install Dependencies'){
                        steps{
                                echo "Installing dependencies..."
                                sh 'npm install'
                        }
                }
                stage('Build The Artifact'){
                        steps{
                                echo "Building the artifact..."
                                sh "npm run build"
                        }
                }
                stage('Build The image'){
                        steps{
                                echo "Building the image..."
                                withCredentials([usernamePassword(
                                        credentialsId: 'github-token',
                                        passwordVariable: 'PASS',
                                        usernameVariable: 'USER')])
                                        {
                                                sh 'docker build -t mohamed2003/pipe-repo:1.2'
                                                sh "echo $PASS | docker login -u ${USER} --password-stdin"
                                                sh 'docker push mohamed2003/pipe-repo:1.2'
                                        }
                                

                        }
                }

        }
}
