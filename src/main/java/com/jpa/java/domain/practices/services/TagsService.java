package com.jpa.java.domain.practices.services;

import com.jpa.java.domain.practices.dtos.requests.ReqPostTag;
import com.jpa.java.domain.practices.dtos.responses.ResTag;
import com.jpa.java.domain.practices.entities.Tags;
import com.jpa.java.domain.practices.repositoies.TagsRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TagsService {

    private final TagsRepository tagsRepository;

    public TagsService(TagsRepository tagsRepository) {
        this.tagsRepository = tagsRepository;
    }

    public List<ResTag> getTags() {
        return tagsRepository.findAll(Sort.by(Sort.Direction.ASC, Tags.COL_NAME)).stream()
            .map(ResTag::new)
            .collect(Collectors.toList());
    }

    public List<ResTag> postTag(ReqPostTag reqPostTag) {
        tagsRepository.save(reqPostTag.toEntity());
        return this.getTags();
    }

    public List<ResTag> deleteTags() {
        tagsRepository.deleteAll();
        return new ArrayList<>();
    }
}
