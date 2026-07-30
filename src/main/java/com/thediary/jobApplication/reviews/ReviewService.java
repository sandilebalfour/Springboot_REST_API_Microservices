package com.thediary.jobApplication.reviews;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long id);
    Review getReviewById(Long id);
    boolean addReview(Long companyId,Review review);
    boolean deleteReviewById(Long id);
    boolean updateReviewById(Long id);
}
