package org.devops.cicd

class Test {
    static void runTests(Map config) {
        println "Running tests for: ${config.appName}"
        sh "mvn test"
    }
}
