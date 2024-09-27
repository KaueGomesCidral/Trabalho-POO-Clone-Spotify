package br.edu.univille.poo.tarefas.entity;

import br.edu.univille.poo.tarefas.entity.Usuario;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlaylist;
    private String nomePlaylist;
    private String fotoCapa;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name = "playlist_musica",
            joinColumns = @JoinColumn(name = "idPlaylist"),
            inverseJoinColumns = @JoinColumn(name = "idMusica"))
    private List<Musica> musicas;

}
