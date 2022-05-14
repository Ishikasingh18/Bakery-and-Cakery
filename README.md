<h1 align="center"> Bakery & Cakery (CDAC Project) </h1>
<br>
<p  align="center"> Created By : Ishika Singh &#128525; &#128525; &#128525;</p>
<p> This repositry has a online bakery website to assist a user to avail bakery products 
  <br>
  and purchase them through registration and verification using Google Authentication.
  <br> 
  The Admin can maintain Database by adding, updating, and deleting categories and products.
  </p>
  <b> Technology Used :  Spring Boot ,Thymeleaf , HTML, CSS, Bootstrap, MySQL </b>

<br>

## Database Configuration

In its default configuration, Bakery & Cakery uses  a persistent database configuration which gets populated at startup with data.<br>
To run  Bakery & Cakery locally using persistent database, it is needed to change profile defined in application.properties file.

For MySQL database,
would be good to check properties defined in application-mysql.properties file.

```
spring.datasource.url=jdbc:mysql://localhost:3306/test?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.name=test
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```      

## Working with Bakery & Cakery in your IDE

### Prerequisites:
The following items should be installed in your system:
* Java 11 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE 
  * [Eclipse IDE] (https://www.eclipse.org/m2e/)
  * [Spring Tools Suite](https://spring.io/tools) (STS)
  * [VS Code](https://code.visualstudio.com)

### Steps:

1) On the command line
    ```
    Clone the application
    git clonehttps://github.com/Ishikasingh18/Bakery-and-Cakery.git
    ```
2) Inside Eclipse or STS
    ```
    File -> Import -> Maven -> Existing Maven project
    ```
    Then either build on the command line `./mvnw generate-resources` or using the Eclipse launcher
    (right click on project and `Run As -> Maven install`) to generate the css. 
    Run the application main method by right clicking on it and choosing `Run As -> Java Application`.

3) Navigate to Bakery & Cakery 

    Visit [http://localhost:8080](http://localhost:8080) in your browser.






