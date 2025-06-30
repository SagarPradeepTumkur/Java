```markdown
# Welcome Web App

A simple Spring Boot web application that displays a welcome message.

## Prerequisites
- Java 17
- Maven 3.6+
- Git

## Setup and Run
1. Clone the repository:
```bash
git clone <your-github-repo-url>
cd welcome-web-app
```

2. Build the project:
```bash
mvn clean package
```

3. Run the application:
```bash
java -jar target/welcome-web-app-0.0.1-SNAPSHOT.jar
```

4. Access the welcome message:
Open a browser and navigate to `http://localhost:8080/welcome`

## Deployment on AWS Linux Server
1. Ensure Java 17 and Maven are installed on your AWS Linux server:
```bash
sudo yum install -y java-17-amazon-corretto
sudo yum install -y maven
```

2. Clone the repository:
```bash
git clone <your-github-repo-url>
cd welcome-web-app
```

3. Build the package:
```bash
mvn clean package
```

4. Run the application:
```bash
java -jar target/welcome-web-app-0.0.1-SNAPSHOT.jar
```

5. Access the application:
- If running on AWS, ensure the security group allows inbound traffic on port 8080.
- Use the server's public IP: `http://<aws-public-ip>:8080/welcome`

## Project Structure
- `src/main/java/com/example/welcomeapp/`: Contains the main application and controller.
- `src/main/resources/`: Configuration files.
- `pom.xml`: Maven configuration file.
```