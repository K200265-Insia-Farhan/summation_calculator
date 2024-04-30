pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git branch: 'main', url: 'https://github.com/K200265-Insia-Farhan/summation_calculator'
            }
        }
        
        stage('Build and Test') {
            steps {
                // Build the Java project using Maven
                bat 'mvn clean package'
                
                // Run JUnit tests
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Static Code Analysis') {
            steps {
                // Run SonarQube analysis
                withSonarQubeEnv('sonar') {
                    //bat 'mvn sonar:sonar'
                    bat 'mvn sonar:sonar -Dsonar.login=squ_8d6286548f7dc51c20c766e32b03c38250d5fd5c'
                }
            }
        }  
    }

    post {
        always {
            // Publish SonarQube analysis results to Jenkins interface
            publishIssues issues:[sonarConsole()], enabledForFailure: true
        }
    }
}
