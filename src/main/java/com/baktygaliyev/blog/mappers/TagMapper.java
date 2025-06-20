package com.baktygaliyev.blog.mappers;

import com.baktygaliyev.blog.domain.PostStatus;
import com.baktygaliyev.blog.domain.dtos.TagDto;
import com.baktygaliyev.blog.domain.entities.Post;
import com.baktygaliyev.blog.domain.entities.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper {

    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatePostCount")
    TagDto toTagResponse(Tag tag);

    @Named("calculatePostCount")
    default Integer calculatePostCount(Set<Post> posts) {
        if (posts == null) return 0;

        return (int) posts.stream()
                .filter(post -> post.getStatus().equals(PostStatus.PUBLISHED))
                .count();
    }

}
