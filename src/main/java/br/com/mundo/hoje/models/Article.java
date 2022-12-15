package br.com.mundo.hoje.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Article {

    private String title;
    private String subtitle;
    private String metadata;
    private String text;

}
