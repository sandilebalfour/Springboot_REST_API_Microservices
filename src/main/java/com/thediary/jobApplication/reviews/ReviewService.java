package com.thediary.jobApplication.reviews;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    void createReview(Review review);
    boolean deleteReviewById(Long id);
    boolean updateReviewById(Long id);
}
