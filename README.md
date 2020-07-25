# spring-boot-docker 
 Dockerizing a Sample Spring Boot Project

### Step1 - Build the project<br>
<i>> mvn clean install</i><br>

### Step2 - Build docker image<br>
<i>> docker build -t spring-boot-docker .</i><br>

### Step3 - To run at port 8085<br>
<i>> docker run -d -p 8085:8081 spring-boot-docker </i><br>
The Above command will run container in background<br>

### Step4 - Open <http://localhost:8085/> in your Browser

*****

### Some other important commands

To Add image to DockerHub<br>
<i>> docker push image_name <br>

To Stop Container<br>
<i>> docker stop container_id <br

To Remove Container <br>
<i>> docker rm container_id <br>
  
To Remove Image <br>
<i>> docker rmi image_name <br>
  
