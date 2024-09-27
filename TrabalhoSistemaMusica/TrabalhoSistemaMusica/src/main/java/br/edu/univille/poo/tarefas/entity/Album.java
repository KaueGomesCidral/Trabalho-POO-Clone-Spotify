package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlbum;
    private String nomeAlbum;
    private String dataLancamento;
    private String capaAlbum;

    @OneToMany(mappedBy = "album")
    private List<Musica> musicas;

    @ManyToOne
    @JoinColumn(name = "idArtista")
    private Artista artista;

}
