package com.thediary.jobApplication.reviews;

import com.thediary.jobApplication.company.Company;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    private Long id;
    private String rating;

    @ManyToOne
    private Company company;

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setName(String name) {
        this.rating = name;
    }
}
