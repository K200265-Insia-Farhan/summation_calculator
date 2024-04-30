pipeline:
  agent: any
  
  environment:
    SONAR_TOKEN: ${SONARQUBE_TOKEN}

  stages:
    - stage: Checkout
      steps:
        - name: Checkout Code
          uses: actions/checkout@v2
          with:
            repository: YourGitHubUsername/YourRepositoryName
            ref: main  # or specify the branch name you want to checkout
      
    - stage: Build_and_Test
      steps:
        - name: Set up JDK 11
          uses: actions/setup-java@v2
          with:
            distribution: 'adopt'
            java-version: '11'
      
        - name: Build with Maven
          run: mvn clean install
      
        - name: Run Tests
          run: mvn test
          
    - stage: SonarQube_Analysis
      steps:
        - name: SonarQube Scan
          uses: SonarSource/sonarcloud-github-action@master
          env:
            GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
            SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
  
  post:
    success:
      - name: Upload Test Results
        uses: actions/upload-artifact@v2
        with:
          name: test-results
          path: target/surefire-reports/
  
    failure:
      - name: Upload Test Results
        uses: actions/upload-artifact@v2
        with:
          name: test-results
          path: target/surefire-reports/
