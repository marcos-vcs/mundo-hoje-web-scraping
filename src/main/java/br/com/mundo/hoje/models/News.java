package br.com.mundo.hoje.models;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class News {

    private int count;
    private int page;
    private int totalPages;
    private int nextPage;
    private int previousPage;
    private int showingFrom;
    private int showingTo;
    private List<Item> items;

}
