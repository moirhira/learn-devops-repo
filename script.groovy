def installDependencies() {
        echo "Installing dependencies..."
        sh 'npm install'
}

def buildArtifact() {
        echo "Building the artifact..."
        sh "npm run build"
}

def buildAndDeployImage() {
        echo "Building the image for new branch..."
        withCredentials([usernamePassword(
                credentialsId: 'docket-repo-key',
                passwordVariable: 'PASS',
                usernameVariable: 'USER')])
                {
                        sh 'docker build -t mohamed2003/pipe-repo:1.2 . '
                        sh "docker login -u ${USER} -p ${PASS}"
                        sh 'docker push mohamed2003/pipe-repo:1.2'
                }
}

return this