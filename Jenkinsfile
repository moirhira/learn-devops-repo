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

        }
}
