# Java Jersey REST Swagger Angular4+ Recipe

### Visit the JetBrains Website and [Download IntelliJ IDEA Eval - for windows in my case](https://www.jetbrains.com/idea/download/#section=windows)

![image](https://user-images.githubusercontent.com/22680176/27458859-65b38d74-5768-11e7-8803-4aff595c5610.png)

### Visit the Tomcat Website [tomcat.apache.org](https://tomcat.apache.org/) and Download Tomcat 8

![image](https://user-images.githubusercontent.com/22680176/27458521-b686c5d8-5766-11e7-8d62-cf9ca5e6eaa7.png)

#### I chose the 64 bit Windows Zip

![image](https://user-images.githubusercontent.com/22680176/27458965-17374784-5769-11e7-880f-98a2f2374e7e.png)

#### Unzip Tomcat to c:\dev\tools

### Visit the [Maven Website](http://maven.apache.org/download.cgi) and Download Maven

![image](https://user-images.githubusercontent.com/22680176/27459513-dbf897a6-576b-11e7-8778-9b5942e23166.png)

#### Unzip Maven to c:\dev\tools

### Visit the [Oracle Java SE JDK Website](http://www.oracle.com/technetwork/java/javase/downloads/index.html) and Download Java SE JDK 8

![image](https://user-images.githubusercontent.com/22680176/27460614-57518f7e-5772-11e7-8a23-3df2506e6250.png)

#### The install placed the files here (for me): `C:\Program Files\Java\jdk1.8.0_131`

### Add Maven bin and JDK bin folders to the Path environment variable

![image](https://user-images.githubusercontent.com/22680176/27460905-1fefe29a-5774-11e7-9178-84ae2f5888df.png)

### Open IntelliJ IDEA and Choose "File - New Project"

When creating the project (you'll only have to do this the first time), create a new application server and choose Tomcat Server, then enter the unzipped folder location (C:\dev\tools\apache-tomcat-8.5.15)

![image](https://user-images.githubusercontent.com/22680176/27461694-c80c9cf8-5778-11e7-8bf4-efe5c70aaa87.png)

#### In the "New Project" dialog, Choose Java Enterprise and check Web Application and Restful Web Service

![image](https://user-images.githubusercontent.com/22680176/27461753-3572f292-5779-11e7-993d-c83dc590cdea.png)

#### Give the project a fun and creative name

![image](https://user-images.githubusercontent.com/22680176/27461788-64cae860-5779-11e7-87f5-3e3239d14965.png)

### Add support for Maven

Right click the project and choose "Add Framework Support…", then choose "Maven" in the dialog and click "Ok".  Then in the small popup in the lower right,  choose "Enable Auto Import".

![image](https://user-images.githubusercontent.com/22680176/27461813-9c6fcf74-5779-11e7-8f07-6669baf85949.png)

![image](https://user-images.githubusercontent.com/22680176/27461865-e8cc2336-5779-11e7-9591-e56d592300f1.png)

![image](https://user-images.githubusercontent.com/22680176/27461879-009eb44c-577a-11e7-8782-2322fc217a02.png)

### Edit the "pom.xml" file: set the groupId and add the Jersey dependencies

![image](https://user-images.githubusercontent.com/22680176/27461909-3d43d2a6-577a-11e7-8de1-69ecf4cf4460.png)

![image](https://user-images.githubusercontent.com/22680176/27461935-59cb331a-577a-11e7-8f86-01bb39952848.png)

### Add "com.technicalmedia" package and "MyResource.java" class:

> * Right click "src/main/java", 
> * choose add package, 
> * enter "com.technicalmedia", 
> * then right click the "src/main/java/com.technicalmedia" and 
> * choose "Add - Java Class" and 
> * enter "MyResource" (edit this file as follows):

![image](https://user-images.githubusercontent.com/22680176/27461975-a0d6d660-577a-11e7-9694-e41aeeb2c346.png)

### Modify the "index.jsp" file in the "web" folder to link to the REST API.

![image](https://user-images.githubusercontent.com/22680176/27461998-c9b5502a-577a-11e7-9302-7cd5a0fe21fb.png)

### Modify the "web.xml" file in "web/WEB-INF" folder.

![image](https://user-images.githubusercontent.com/22680176/27462011-ec696b74-577a-11e7-85fb-ea4e2e7b7790.png)

