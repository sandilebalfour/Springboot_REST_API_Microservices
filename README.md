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
