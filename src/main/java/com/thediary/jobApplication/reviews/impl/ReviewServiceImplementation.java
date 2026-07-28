package com.thediary.jobApplication.reviews.impl;

import com.thediary.jobApplication.reviews.Review;
import com.thediary.jobApplication.reviews.ReviewRepository;
import com.thediary.jobApplication.reviews.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService {

    ReviewRepository reviewRepository;

    public ReviewServiceImplementation(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public void createReview(Review review) {
        reviewRepository.save(review);
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
