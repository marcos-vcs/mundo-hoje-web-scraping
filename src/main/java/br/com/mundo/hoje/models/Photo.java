package br.com.mundo.hoje.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Photo implements Serializable {
    private String image_intro;
    private String image_fulltext;
}
