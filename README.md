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

### Add the jersey jars to the "WEB-INF/lib" folder.  

> * Choose the "File - Project Structure…" menu, 
> * select the jars as shown, 
> * right click, and 
> * choose the "Put into /WEB-INF/lib" option

![image](https://user-images.githubusercontent.com/22680176/27462084-7af9d234-577b-11e7-843d-a5d062422198.png)

### Add an Angular4 bundled project using the angular cli.

#### Get the path to our "src/main"

![image](https://user-images.githubusercontent.com/22680176/27462151-d7262396-577b-11e7-91fe-4ae7ccd63cf8.png)

#### And now from a bash shell, we create the new angular project.

> If you haven't done so already, install the following:
> * http://nodejs.org
> * On windows: git for windows: https://git-scm.com/download/win
> * On windows: ConEmu: https://conemu.github.io/

```bash
npm install -g @angular/cli
```

![image](https://user-images.githubusercontent.com/22680176/27462197-2abf46ae-577c-11e7-914c-352080767a0c.png)

#### View the results in the IDE

![image](https://user-images.githubusercontent.com/22680176/27462265-b8ecc87a-577c-11e7-9f96-8534ddd56250.png)

#### Build the Angular bundle

![image](https://user-images.githubusercontent.com/22680176/27462295-eecb3a1c-577c-11e7-9fdd-19bd70c722b3.png)

#### Notice the newly-created "dist" folder

![image](https://user-images.githubusercontent.com/22680176/27462307-0ebff01a-577d-11e7-95ad-dacb44387b91.png)

#### Now add the Angular bundle to the project output

![image](https://user-images.githubusercontent.com/22680176/27462329-35d01cde-577d-11e7-951c-032cd17ee448.png)

![image](https://user-images.githubusercontent.com/22680176/27462340-4e4fc926-577d-11e7-93f4-7acacc36caf8.png)

#### It works !!!!!!!!! :smile: :rabbit2: :tophat:

![image](https://user-images.githubusercontent.com/22680176/27462353-76d1cb56-577d-11e7-98bf-cbe84977f37f.png)

![image](https://user-images.githubusercontent.com/22680176/27462362-913474c6-577d-11e7-9412-7bb8dbda2347.png)

### Now to get the [Swagger core](https://github.com/swagger-api/swagger-core) stuff implemented

This will provide a URL in our web app that will return a `swagger.json` file describing our web api.  This file is generated using reflection over the project's resources.  This means if we add methods to a resource or change the POJOs returned from a method, those changes will automatically be picked up and reflected in the `swagger.json`.

#### The First step is to modify the "pom.xml" file to bring in the swagger core for jersey2

![image](https://user-images.githubusercontent.com/22680176/27502568-2300cc2e-5832-11e7-9557-e678a399ee08.png)

#### Modify the "web.xml" file to include the swagger listing package and to run the swagger bootstrap class that configures the swagger settings

![image](https://user-images.githubusercontent.com/22680176/27502590-5dbdb93a-5832-11e7-9a2f-8240d04b37cc.png)

#### Here is the swagger bootstrap servlet that configures the swagger settings:

![image](https://user-images.githubusercontent.com/22680176/27502628-b57ad270-5832-11e7-936c-9a6124d659cf.png)

#### Here is the filter set in the swagger bootstrap class.

In our simple case, we allow everything, but we can modify this class for fine-grained security control over our web api.

![image](https://user-images.githubusercontent.com/22680176/27502658-ee1c2b2e-5832-11e7-8861-b548c246663c.png)

#### Here is our sophisticated web api resource.  For fun, it has been switched to return JSON

![image](https://user-images.githubusercontent.com/22680176/27502674-1530690a-5833-11e7-97a6-900d10953f2b.png)

#### And the spectacular results of running it

![image](https://user-images.githubusercontent.com/22680176/27502689-391ea7a0-5833-11e7-8fc8-3f0c6a8edf3f.png)

![image](https://user-images.githubusercontent.com/22680176/27502695-4ded21b6-5833-11e7-8e97-08f4173088a0.png)

#### Now we can use [NSwag Studio](https://github.com/NSwag/NSwag/wiki/NSwagStudio) to generate a matching TypeScript Angular2+ Proxy for our web api

![image](https://user-images.githubusercontent.com/22680176/27502729-8b1badfa-5833-11e7-9394-8b345763165b.png)

