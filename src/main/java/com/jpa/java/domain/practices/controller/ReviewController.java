package com.jpa.java.domain.practices.controller;

import com.jpa.java.domain.practices.dtos.requests.ReqPostReview;
import com.jpa.java.domain.practices.dtos.responses.ResReview;
import com.jpa.java.domain.practices.services.ReviewsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewsService reviewsService;

    public ReviewController(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    @GetMapping("/{bookId}")
    public List<ResReview> getReviews(@PathVariable("bookId") long bookId) {
        return reviewsService.getReviews();
    }

    @PostMapping
    public List<ResReview> postReview(@RequestBody @Valid ReqPostReview reqPostReview) {
        return reviewsService.postReview(reqPostReview);
    }

    @DeleteMapping
    public List<ResReview> deleteReviews() {
        return reviewsService.deleteReview();
    }

}
