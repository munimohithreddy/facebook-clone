package com.FinalProject.facebookclone.model;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private String id;
    private String post;
    private String name;
    private String email;
    private String image;
    private String profilepic;
    private String timestamp;
    private String file;
}
