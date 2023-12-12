pipeline{
    agent any

    tools{
        jdk 'jdk17'
        maven 'maven_3.9.4'
    }

    triggers{
        pollSCM('* * * * *')
    }

    stages{
        stage("compile stage"){
            steps{
                sh 'mvn clean compile'
            }
        }
    stage("package stage"){
                steps{
                    sh 'mvn clean package -DskipTests'
                }
            }
    stage("Docker Image Build stage"){
                steps{
                    sh 'sudo -S docker image build -t api-gateway .'
                }
            }
    stage("Docker Tag Image stage"){
                    steps{
                        sh 'sudo docker tag api-gateway ashish142/api-gateway:1.0.0'
                    }
                }
    }
}