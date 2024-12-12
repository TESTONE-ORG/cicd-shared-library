package org.devops.cicd

class Build {
    static void buildApp(Map config) {
        println "Building application: ${config.appName}"
        sh "mvn clean package -DskipTests=true"
    }
}
