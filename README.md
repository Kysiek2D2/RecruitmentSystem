# What is this app?
That app helps to conduct interviews for Java Software Developer roles.
It includes:
* Set of theory questions
* Spring application with:
  * H2 SQL database setup
  * Tests
* Practical tasks with solutions (Java and SQL)
* Main.java class to quickly test code

# Folder structure
src -> main -> java -> com.recruitment.recruitmentsystem contains:
* simlme.main -> Main.java
  * can be run to test code manually. Just reference function there.
* Tasks
  * tasks to complete
* Solutions to tasks
  * solutions to above tasks

# How to run it.
### Get dependencies and build
In terminal: mvn clean install

Maven will handle dependencies.

### Start app
Run RecruitmentSystemApplication. 
It's needed to run H2 database.
** Still you can use Main.java file and run it separatelly.

### Enter H2 Database
H2 console in browser (http://localhost:8080/h2-console)
JDBC URL: jdbc:h2:file:./data/recruitment_db
User: sa
password: (empty)
JDBC is in the 'file' mode. You can find database file in the data folder.

