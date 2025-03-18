pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/DeynesA/Uebung_Maven_demo_17_03_25.git'
            }
        }
        stage('Build') {
            steps {
                    sh '''cd ./my-app/
                    mvn clean package'''
            }
        }
        stage('7Zip') {
            steps {
                    sh "7z a maven-demo.7z ./my-app/target/*.jar"
            }
        }
        stage('Deploy Message') {
            steps {
                    echo 'Jar file Deployed'
            }
        }
    }
}