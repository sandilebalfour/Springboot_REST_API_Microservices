# Springboot_REST_API_Microservices
Learning how to create a REST API using Spring Boot. This covers creating data models, establishing controller endpoints, and managing job data.

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

## Get : localhost:/jobs/{id}
-- Gets a specific job using an id..

## Delete : localhost:/jobs/{id}
-- Deletes a specific Job using an ID..

## Post : localhost:/jobs{id}
-- Updates a specific Job using an ID and updates the job. 