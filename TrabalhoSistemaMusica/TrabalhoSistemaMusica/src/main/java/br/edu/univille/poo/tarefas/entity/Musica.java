package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMusica;
    private String tituloMusica;
    private String duracao;

    @ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists;

    @ManyToOne
    @JoinColumn(name = "idAlbum")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "idGenero")
    private Genero genero;

}
