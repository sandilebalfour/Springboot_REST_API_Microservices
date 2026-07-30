package com.thediary.jobApplication.reviews.impl;

import com.thediary.jobApplication.company.Company;
import com.thediary.jobApplication.company.CompanyService;
import com.thediary.jobApplication.reviews.Review;
import com.thediary.jobApplication.reviews.ReviewRepository;
import com.thediary.jobApplication.reviews.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService {

    ReviewRepository reviewRepository;
    CompanyService companyService;

    public ReviewServiceImplementation(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompany(companyId);
        if (company != null){
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        }
        return false;

    }

    @Override
    public boolean deleteReviewById(Long id) {
        if (reviewRepository.existsById(id)){
            reviewRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean updateReviewById(Long id) {

        return false;
    }
}
