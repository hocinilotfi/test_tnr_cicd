pipeline{
    agent{
        docker{
            image 'maven:3.9.11-eclipse-temurin-24'
        }
    }
    stages{
        stage("Clean and Compile"){
            steps{
                sh "mvn clean compile"
            }
        }
        stage("Run Tests"){
            steps{
                sh 'mvn test'
            }
            
        }
    }
    post {
        always {
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}