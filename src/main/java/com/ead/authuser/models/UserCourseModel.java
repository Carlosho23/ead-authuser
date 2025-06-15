package com.ead.authuser.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter

@Table(name = "TB_USERS_COURSES")
public class UserCourseModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public UserCourseModel(UUID id, UUID courseId, UserModel user) {
        this.id = id;
        this.courseId = courseId;
        this.user = user;
    }

    public UserCourseModel() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private UUID courseId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UserModel user;

}
