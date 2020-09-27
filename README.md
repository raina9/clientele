# very-simple-animals
a very simple java app to get an animal name and image with an url hosted with it.

# setting up the project

* make sure jdk 1.8 or above installed on local machine.
* install eclipse 
* download project as .zip
* choose open project from file system using file option
* select archive and let eclipse setup the project

# Run
 localhost:8080/

# create .war file 
* add packaging as war in pom.xml `<packaging>war</packaging>`
* click on project 
* run as : `maven build...`
* `clean package` as goal 
* a war file will be generated in target folder.

# Deploy on AWS
we will use **_ELasticBeanStalk_**  
* [create-applications](https://us-west-1.console.aws.amazon.com/elasticbeanstalk/home?region=us-west-1#/applications
)
* choose Application name : `AnimalsApi`
* choose platform : `Tomcat`
* choose platform branch : `Tomcat with java` latest verison
* upload application code from *local machine/S3 url.*
* click on `create Application` 

# Run 
After successful creation of Application for first time a url is generated that can be later used to open the app.
that url can be used later to run the `AnimalsApi.`