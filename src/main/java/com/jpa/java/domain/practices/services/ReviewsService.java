package com.jpa.java.domain.practices.services;

import com.jpa.java.domain.practices.dtos.requests.ReqPostReview;
import com.jpa.java.domain.practices.dtos.responses.ResReview;
import com.jpa.java.domain.practices.repositoies.ReviewsRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public ReviewsService(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Transactional(readOnly = true)
    public List<ResReview> getReviews() {
        return this.reviewsRepository.findAll().stream()
            .map(ResReview::new)
            .collect(Collectors.toList());
    }

    @Transactional
    public List<ResReview> postReview(ReqPostReview reqPostReview) {
        this.reviewsRepository.save(reqPostReview.toEntity());
        return this.getReviews();
    }

    public List<ResReview> deleteReview() {
        this.reviewsRepository.deleteAll();
        return new ArrayList<>();
    }
}
