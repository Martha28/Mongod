package com.stackroute.muzixapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Document(collection = "Tracks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    @Id
    private int id;
    private String name;
    private String comment;

}
