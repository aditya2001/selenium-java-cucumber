import groovy.json.JsonOutput

pipeline {
    //The agent section specifies where the entire Pipeline, or a specific stage,
    //will execute in the Jenkins environment depending on where the agent section is placed.
    agent any

    triggers {
        cron('TZ=America/New_York\n30 0 * * *')
    }

    options {
        ansiColor('xterm')
    }

    stages {
        stage('Building'){
           steps {
             echo "Building the application"
             }
          }
        stage('Testing'){
          steps{
            bat "mvn test"
          }
        }
        stage('Deploying'){
        steps{
          echo "Deploying"
        }
      }
     }

        post {
             always {
                 archiveArtifacts artifacts: "test output/PdfReport/ExtentPdf.pdf", onlyIfSuccessful: false
                 publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: true, reportDir: 'test output/PdfReport', reportFiles: 'ExtentPdf.pdf', reportName: 'PDF Report', reportTitles: ''])
             }
         }
 }
