package com.jhipster.demo.web.rest.mapper;

import com.jhipster.demo.domain.*;
import com.jhipster.demo.web.rest.dto.AuthorDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Author and its DTO AuthorDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuthorMapper {

    AuthorDTO authorToAuthorDTO(Author author);

    @Mapping(target = "bookss", ignore = true)
    Author authorDTOToAuthor(AuthorDTO authorDTO);
}
