package com.thediary.jobApplication.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thediary.jobApplication.job.Job;
import com.thediary.jobApplication.reviews.Review;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String companyName;
    private String description;

    //One-to-many; every company has a list of jobs
    //This describes the relationship between company entity & Job Entity
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;

    public Company(){}

    public Long getCompanyId() {
        return Id;
    }

    public void setCompanyId(Long companyId) {
        this.Id = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

}
