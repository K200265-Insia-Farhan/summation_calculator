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
                bat 'mvn clean compile'
                
                // Run JUnit tests
                junit '*/target/surefire-reports/.xml'
            }
        }
        
        
}
