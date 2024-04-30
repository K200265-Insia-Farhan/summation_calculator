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
                junit '*/target/surefire-reports/.xml'
            }
        }
        
        //stage('Static Code Analysis') {
            //steps {
                // Run SonarQube analysis
                //withSonarQubeEnv('sonar') {
                    //bat 'mvn sonar:sonar'
                //}
            //}
        //}
    }
    
    post {
        always {
            // Archive artifacts for future reference
            archiveArtifacts artifacts: '*/target/.jar', fingerprint: true
            
            // Publish JUnit test results
            //junit 'target/surefire-reports/*.xml'
            
            // Publish SonarQube analysis results
            //sonarQualityGate() //- Uncomment this line if 'sonarQualityGate' is a valid step
        }
    }
}
