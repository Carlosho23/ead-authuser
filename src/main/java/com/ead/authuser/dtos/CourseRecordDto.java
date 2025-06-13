package com.ead.authuser.dtos;

import com.ead.authuser.enums.CourseLevel;
import com.ead.authuser.enums.CourseStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true) // Quando tiver valores desconhecidos ele vai ignorar
@JsonInclude(JsonInclude.Include.NON_NULL) // inclue valores que não sejam nulos
public record CourseRecordDto(UUID courseId,
                              String name,
                              String description,
                              String imageUrl,
                              CourseStatus courseStatus,
                              UUID userInstructor,
                              CourseLevel courseLevel) {
}
