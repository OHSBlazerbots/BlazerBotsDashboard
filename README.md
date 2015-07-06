# BlazerBotsDashboard
This application will be built in NetBeans, running on Spring Boot. The database will be MySQL. Planning pages can be found in the shared [Google Drive folder].

## Setup

  - First, install Maven
   - [Windows instructions]
   - [Mac instructions]
  - Install [NetBeans]
  - Install [MySQL]
  - Setup MySQL based upon database structure (not currently defined)
  - Clone this project in Netbeans
  - All done

## Running the program

  - There are two files in the folder that are run by double clicking on them:
   - package.bat: This stuffs the server and program into a simple .jar file, located in the /target folder
   - run.bat: This runs the .jar file that package.bat creates
  - Always run package.bat first if you have made any changes, then run run.bat
  - Both will open up command prompt windows
   - package.bat will close the window when it is done
   - run.bat will keep the window open until you close the server
    - To kill the server, press 'ctrl+c', then 'y', then 'enter'
  - While run.bat is open, you may access web pages at http://localhost:8080/***

## Program structure
The main pieces of a Spring Boot Web Application are:
  - Controllers: receive and respond to requests from a user
  - Entities: map a database object
  - Repositories: serve to perform operations on a database, specific to individual object types
  - Templates: html documents that have 'blank' spots that controllers fill in

## Resources
  - [How to make repositories and entities][Resource data]
  - [How to write access methods in repositories][Methods in repositories] 

## Examples
## How to save objects:
```
Carrier carrier = new Carrier("Test", "test1");

carrierRepository.save(carrier);
carrier = carrierRepository.findByName("Test").get(0);
       
User user1 = new User("user1", cpe.encodePassword("pass",""));
User user2 = new User("user2", cpe.encodePassword("pass",""));
       
user1.setCarrier(carrier);
user2.setCarrier(carrier);
        
userRepository.save(user1);
userRepository.save(user2);
```

[Windows instructions]: https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=0CCgQFjAC&url=http%3A%2F%2Fwww.mkyong.com%2Fmaven%2Fhow-to-install-maven-in-windows%2F&ei=aTdnVfzYLcHZoATf9YPYBA&usg=AFQjCNGrEu-bkS6la8GWg_PbcW5uVNrxuA

[Mac instructions]: https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=2&cad=rja&uact=8&ved=0CCIQFjAB&url=http%3A%2F%2Fwiki.openiam.com%2Fdisplay%2FIAMSUITEV3%2FInstalling%2BApache%2BMaven%2Bon%2BMac&ei=vTdnVdAp1buiBN24gJgH&usg=AFQjCNGj68ZKFkibQ3dhznJz_1XsBupllg

[Google Drive folder]: https://drive.google.com/drive/u/0/folders/0B6T2VHWS7cKLT1JVV1JpUHAtNWM/0B6T2VHWS7cKLfmhwY1dxNllSODU0dEpHNGIyWW5wUURCM1JfckFjS01KeUNZSzdHMTNvN3M

[MySQL]: https://dev.mysql.com/downloads/mysql/

[NetBeans]: https://netbeans.org/downloads/index.html

[Resource data]: https://spring.io/guides/gs/accessing-data-jpa/

[Methods in repositories]: http://docs.spring.io/spring-data/jpa/docs/1.9.0.M1/reference/html/#jpa.entity-persistence
