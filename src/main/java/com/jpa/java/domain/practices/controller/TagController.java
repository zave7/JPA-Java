package com.jpa.java.domain.practices.controller;

import com.jpa.java.domain.practices.dtos.requests.ReqPostTag;
import com.jpa.java.domain.practices.dtos.responses.ResTag;
import com.jpa.java.domain.practices.services.TagsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {

    private final TagsService tagsService;

    public TagController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @GetMapping
    public List<ResTag> getTags() {
        return tagsService.getTags();
    }

    @PostMapping
    public List<ResTag> postTag(@RequestBody @Valid ReqPostTag reqPostTag) {
        return tagsService.postTag(reqPostTag);
    }

    @DeleteMapping
    public List<ResTag> deleteTags() {
        return tagsService.deleteTags();
    }
}
