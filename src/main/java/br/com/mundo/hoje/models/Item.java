package br.com.mundo.hoje.models;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item implements Serializable {
    private int id;
    private String tipo;
    private String titulo;
    private String introducao;
    private String data_publicacao;
    private int produto_id;
    private String produtos;
    private String editorias;
    private String imagens;
    private String produtos_relacionados;
    private boolean destaque;
    private String link;
    private Photo photos;
    private Article article;
}
