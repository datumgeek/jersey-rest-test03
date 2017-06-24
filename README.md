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

Pretty amazing - we can use tooling to generate our TypeScript proxy classes when consuming our web api in Angular2+.  

### Next we'll take a look at how we use this proxy for our web api from the Angular2+ client.

To facilitate a tight modify-view-debug loop, we'll first ***implement CORS support*** in our web api.  This will allow us to run the angular client separately so we don't have to redeploy to Tomcat every time we make a change.  In fact, our changes will be picked up live in the browser when we use the angular cli "serve" command to run our angular2+ web app.

CORS allows a web app served from one URL to access a web service at another URL.  The required support is implemented in the web service.

#### We'll create a servlet filter as shown here.

This filter adds headers to all responses allowing callers from different origins to call our web api

![image](https://user-images.githubusercontent.com/22680176/27502836-4ee14074-5834-11e7-999c-f293192a131a.png)

#### Next, we'll add the above filter to the "web.xml"

![image](https://user-images.githubusercontent.com/22680176/27502866-79a81576-5834-11e7-893b-b723d3143583.png)

With CORS support in place for our web api, we are ready to start accessing the web service from the angular client served up by the angular cli.  

#### We grab the path to the angular client folder in our web app.

Right click the "spa" folder and copy its path.

![image](https://user-images.githubusercontent.com/22680176/27502893-affe106c-5834-11e7-8f29-101fdc30640f.png)

#### Bring up a bash shell, change to the folder, and start the angular cli web server using the angular cli "serve" command

![image](https://user-images.githubusercontent.com/22680176/27507127-259fca30-5886-11e7-8e5f-9d050b3a4f67.png)

#### Point the browser at http://localhost:4200 (the URL shown when running `ng serve`)

We see the default angular application created by the angular cli "new" command, but this time it is served by the angular cli instead of our web service.  The advantage of this approach is we can instantly see our angular client code changes updated live in the browser.

![image](https://user-images.githubusercontent.com/22680176/27507153-ab70a9cc-5886-11e7-8536-cf23d8cc3113.png)

#### Now run NSwag Studio, pointing it at our swagger.json URL

From the (way) above NSwag Studio work, we modified the project settings to generate the Angular client code and place it in the "./spa/src/app" folder.  Here are those settings in NSwag Studio:

![image](https://user-images.githubusercontent.com/22680176/27507172-078182f4-5887-11e7-9bb4-838aefda55f1.png)

Now we can use the generated TypeScript web api proxy.  We will modify the angular web app to call our web api and show the results.

#### Here is the project structure showing the generated "api-client.ts" file

![image](https://user-images.githubusercontent.com/22680176/27507185-3f71e92e-5887-11e7-9aa1-a70793461cc6.png)

#### Register the "Client" class (from the "api-client.ts" file) as a "provider" with our "app.module".

This will allow us to use angular2+ dependency injection to create an instance of the generated TypeScript proxy class ("Client") for our web api.

![image](https://user-images.githubusercontent.com/22680176/27507221-c6188a28-5887-11e7-8901-4cb592c28422.png)

#### Now we modify our app's view model (the "app.component" class)

In the constructor, we create a private member variable in our view model class that points to the injected Client proxy class.

Then we use the proxy to invoke an asynchronous call to our web api "getIt" method.  The proxy returns an [RxJS observable](http://reactivex.io/rxjs/manual/overview.html#subscribing-to-observables) which we subscribe to, passing a lambda function that will be called with the result of the method.  This result is the data returned by our web api.  All of the underlying http call mechanism and the JSON to TypeScript deserialization is encapsulated in the generated proxy class.  Pretty sweet :)

![image](https://user-images.githubusercontent.com/22680176/27507225-df775602-5887-11e7-901a-c8493d41a229.png)

#### And then we modify the app's view (html template)

In the HTML we are using angular2+ binding syntax to display the JSON data that was returned by our web api.  We are using the angular2+ JSON pipe to convert the JSON object to HTML for display.

![image](https://user-images.githubusercontent.com/22680176/27507292-1ad4aeba-5889-11e7-80a6-cb535a875614.png)

#### In the browser we can see the results.

![image](https://user-images.githubusercontent.com/22680176/27507299-607c5e86-5889-11e7-8a2f-a6cd7359078d.png)

#### We can setup our work environment, splitting the screen

This way, when we save the angular app's files, we can see the browser automatically refresh.

![image](https://user-images.githubusercontent.com/22680176/27507567-29601e50-588f-11e7-999d-2aeb2df6768d.png)

### Fantastic progress !!  Now let's turn our attention to the Swagger UI

Swagger UI is a web app that works from a swagger.json file (this file is already being generated by our web app at http://localhost:8080/rest/swagger.json)

#### The Swagger UI will look like this (when we've complete the steps below)

![image](https://user-images.githubusercontent.com/22680176/27507641-3f91939c-5890-11e7-81c3-38ee7c77125e.png)

Let's get our Swagger UI implemented:

#### First, Obtain the Swagger UI (static) web files 

Obtain the files from this URL: https://github.com/swagger-api/swagger-ui/tree/master/dist

Copy them to the `src/main/swagger` folder.

![image](https://user-images.githubusercontent.com/22680176/27507653-aa7c4c9c-5890-11e7-9c71-d7a068e0dc1b.png)

#### Edit the Swagger UI "index.html" page to point at our "swagger.json" file

![image](https://user-images.githubusercontent.com/22680176/27507671-0675198e-5891-11e7-935f-68244916fc51.png)

#### Add the swagger UI web files in our project artifacts (File - Project Structure)

![image](https://user-images.githubusercontent.com/22680176/27507685-5eed70a2-5891-11e7-9dbd-1ccdfe09d694.png)



