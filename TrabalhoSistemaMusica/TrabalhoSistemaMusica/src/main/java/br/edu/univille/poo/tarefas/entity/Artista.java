package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtista;
    private String nomeArtista;
    private String genero;

    @ManyToMany(mappedBy = "artista")
    private List<Album> albuns;

}
