def call(Map pipelineConfig) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script {
                        org.devops.cicd.Build.buildApp(pipelineConfig)
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        org.devops.cicd.Test.runTests(pipelineConfig)
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        org.devops.cicd.Deploy.deployApp(pipelineConfig)
                    }
                }
            }
        }
    }
}
