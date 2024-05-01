# Jenkins CI Pipeline With Junit Testing And Static Code Analysis Using SonarQube
Dependencies Installation Document Link: [https://drive.google.com/file/d/1HgUzP4LO1VxKRDjtGr1XM6xZH1x95JYT/view?usp=sharing] 
## Task Description :
The task was to develop a CI pipeline using Jenkins for automated build and testing. Every time the pipeline is triggered, JUnit test cases are automatically executed to validate code functionality across diverse input scenarios. SonarQube was attached to assess code quality, identifying and rectifying any issues. 
## 1. Configure JDK, Git and Maven:
###  a. Install JDK, Git and Maven on Local Machine:
First install  JDK, Git and Maven on local machine and set syytem enviroment variables.
###  b. Configure JDK, Git and Maven as tools in Jenkins:
![1](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/6789f8ea-4e78-45e4-ae9a-fd511038b7f2)
![2](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/00a8ac2a-6c3b-450e-8001-e51d7addab90)
![3](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/1076625d-16b6-4f54-b27f-a376b295ac15)
![4](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/4df49481-5f9e-478e-a646-6dfdbc007268)
## 2. Sonarcube Plugin Download:
![5](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/8b889767-98e6-43ea-a71b-e86f67afa33b)
![6](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/6420c96a-54c2-4990-9eb1-04f3283607be)
![7](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/cee4e270-0578-43a1-b9ea-99a24b0685aa)
## 3. Sonarqube Installation On Windows:
![8](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/9a0864ad-2368-47cc-bc89-2d033e2cdc12)
![9](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/62a207b7-d35c-4232-8033-40c87fb8ce79)
![10](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/f8e75006-6bdf-4438-85d7-946ddefeaf31)
![11](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/1b60ddc0-3ed5-447f-82fd-de77497b0701)
![12](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/18d8b2b9-ce5e-4147-9161-c7952be1a52a)
## 4. Start SonarQube Service:
![13](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/c270de41-db0f-48ac-be29-85a136d5f170)
## 5. Convert SonarQube Service into a Windows Service:
![14](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/94528a56-7fc5-4d0e-82e2-b9cf92bc7a93)
## 6. Configure SonarQube on Jenkins For Static Code Analysis:
![15](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/550c92e4-3177-4868-83b2-fbad7d33a0f5)
![16](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/d9a5fc51-838b-4d88-8be5-822ce15f0dae)
![17](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/9c12a184-0558-4402-b293-a99f5a43ab4f)
![18](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/84a646d7-7b45-46b0-baee-edfbb918c946)
![19](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/87f5baeb-bfc4-4088-8071-8347b02a191a)
##### sonarqubeEnv should be same as name of sonar config on Jenkins, in this case, its sonar.
## 7. Github Repository:
[https://github.com/K200265-Insia-Farhan/summation_calculator.git]
![1](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/3e6b8041-dff6-4527-bf3e-2d7a5d67aed1)
### a. JenkinsFile Inside Github Repository: 
![2](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/648491f0-b500-42fe-9d55-327fd358105a)
## 8. Building Jenkins CI/CD Pipeline:
###  a. Jenkins Dashboard:
![3](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/de208c11-29a4-40fb-be31-726ef69cf8b9)
###  b. Creating Jenkins Pipeline:
![4](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/0ccbaf70-fac8-425d-a191-e252c62099a8)
###  c. Pipeline Script from SCM:
![5](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/78444d50-5378-4cfb-a301-13b49fa576ce)
![6](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/83e89e84-8229-4cb0-91c3-283f777dd5bf)
![7](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/fc65f156-b013-4461-8d6a-b6a6664fb0e8)
![8](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/c9b054da-c806-442d-b95b-c708a648a5af)
##### Click on Apply and then Save to successfully build a Jenkins Pipeline.
## 9. Start SonarQube Service For Code Quality Analysis:
#### If SonarQube Service was stopped start it again before building the pipeline.
![9](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/0a2619cc-204e-4447-a471-ec4ab33a954b)
![10](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/358de7ae-c75a-4ad4-bd07-d75a72fbcc65)
## 10. Running Pipeline Build:
###  a. Results After Running Build:
![Screenshot 2024-05-01 005925](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/5b58d056-8148-4cef-b684-1949f362a6f3)
![12](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/5a4db2d0-e7ab-4119-9750-c5bf5d190604)
###  b. Console Output of Build:
![13](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/64331aee-533a-40e3-8aef-55b6cfae8353)
![14](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/00319705-e179-4184-9979-2fdd0e1dc818)
![15](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/44a33644-9e91-435f-9790-a717498b60e9)
###  c. Test Results Of Build:
![16](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/7d9c96c8-a888-45bd-a2d3-5a1336ec652b)
![17](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/dae35c72-8763-492a-ae32-8379ea633d98)
###  d. Different Categories Of Test Cases For Coverage of Each Case Required As Per Task Description:
![18](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/fda27bb2-e344-4e24-8b40-6925571af09b)
###  e. Results Of Each Test Case:
![21](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/3d1b7f17-a757-4141-920c-bc5bc0cff8c3)
![22](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/f0787248-891e-40bd-be4f-9375897de03b)
![23](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/0f23c6ce-2140-4aa9-a47c-7d5ec921ee57)
![24](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/d92ed139-3b98-43cd-ab9d-c5897819a619)
## 11. Code Quality Analysis Using SonarQube:
###  a. Code Quality Test Result:
![25](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/36c2e9db-a3bb-4530-96c8-40ed846abbf5)
###  b. Code Quality Test Results of Multiple Builds:
![26](https://github.com/K200265-Insia-Farhan/summation_calculator/assets/145255205/8019662e-f7e7-4210-8d2a-1929d7a92c89)
