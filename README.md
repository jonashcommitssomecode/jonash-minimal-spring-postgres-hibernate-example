# jonash-minimal-spring-postgres-hibernate-example

## Set up postgres db
* Set up Postgres DB, e.g. with docker
* docker run -p 5432:5432 --name some-postgres -e POSTGRES_PASSWORD=postgres -d postgres
* Login with psql, e.g. "psql -U postgres"
* psql> create database mydb;
* psql> create user mydb with encrypted password 'mydb';
* psql> GRANT ALL PRIVILEGES ON DATABASE mydb TO mydb;
* Und then logout from psql and relogin wiht postgres user but explicitly to the newly created "mydb" database
* "psql -U postgres -d mydb"
* psql> GRANT ALL ON SCHEMA public TO mydb;

## Set up application
* Clone project
* Build / Run
* Server should be accessible at http://localhost:8080
* And a table based on hibernate and the employee entity ./src/main/java/jonash/group/EmployeeEntity should be created
