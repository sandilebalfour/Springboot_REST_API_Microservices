package com.thediary.jobApplication.reviews;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long id);
    Review getReviewById(Long companyId, Long reviewId);
    boolean addReview(Long companyId,Review review);
    boolean deleteReviewById(Long companyId, Long reviewId);
    boolean updateReviewById(Long companyId, Long reviewId, Review review);
}
