def gv = null

pipeline {
        agent any 
        tools {
                nodejs 'nodejs-22.20'
        }
        stages {
                stage ('init') {
                        steps {
                                script {
                                        gv = load "script.groovy"
                                }
                        }
                }
                stage('Install Dependencies'){
                        steps{
                                script {
                                        gv.installDependencies()
                                }
                        }
                }
                stage('Build The Artifact'){
                        when {
                                expression {
                                                BRANCH_NAME == 'main'
                                }
                        }
                        steps{
                                script {
                                        gv.buildArtifact()
                                }
                        }
                }
                stage('Build The image'){
                        when {
                                expression {
                                                BRANCH_NAME == 'main'
                                }
                        }
                        steps{
                                script {
                                        gv.buildAndDeployImage()
                                }
                        }
                }
        }
}
