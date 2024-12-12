package org.devops.cicd

class Deploy {
    static void deployApp(Map config) {
        println "Deploying application: ${config.appName} to ${config.environment}"
        sh "kubectl apply -f ${config.k8sDeploymentFile}"
    }
}
