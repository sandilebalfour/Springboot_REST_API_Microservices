# Springboot_REST_API_Microservices
Learning how to create a REST APIs using Spring Boot. This covers creating data models, establishing controller endpoints, and managing job data.
The application is almost like linkedIn where a company sends/post their jobs or openings. The company has reviews of how good it is, in order to trust the company.

## Post : localhost:8080/jobs
-- Create a job.
```{
"id" : 1,
"title": "software engineer needed",
"description": "Test Descrption",
"minSalary": "1000",
"maxSalary": "2000",
"location": "Sandton"
}
```

## Get : localhost:/jobs
-- Get all jobs. Returns all jobs in a list.

## Get : localhost:8080/jobs/{id}
-- Gets a specific job using an id..

## Delete : localhost:8080/jobs/{id}
-- Deletes a specific Job using an ID..

## PUT : localhost:8080/jobs{id}
-- Updates a specific Job using an ID and updates the job. 


# COMPANIES

## GET :  localhost:8080/companies

## GET :  localhost:8080/companies/{id}

## PUT :  localhost:8080/companies/{id}

## POST :  localhost:8080/companies
 
## DELETE :  localhost:8080/companies/{id}


# REVIEWS

## GET :  localhost:8080/companies/{companyId}/reviews

## GET :  localhost:8080/companies/{companyId}/reviews/{reviewId}

## PUT :  localhost:8080/companies/{companyId}/reviews/{reviewId}

## POST :  localhost:8080/companies/{companyId}/reviews

## DELETE :  localhost:8080/companies/{companyId}/reviews/{reviewId}

## Actuator
-- A spring boot actuator is a built-in ready feature to monitor & manage your application.
-- It gives you insight about your running application e.g. A dashboard in your car showing speed you are traveling in, temperature of you engine and fuel left.
-- The benefit you get is that you can manage & monitor your app. 

## PostgreSQL
-- docker run -d --name database -e POSTGRES_PASSWORD=secret postgres
-- docker run -d --name pgadmin -e PGADMIN_DEFAULT_EMAIL=admin@admin.com -e PGADMIN_DEFAULT_PASSWORD=secret dpage/pgadmin4
-- docker exec -it pgadmin ping db
