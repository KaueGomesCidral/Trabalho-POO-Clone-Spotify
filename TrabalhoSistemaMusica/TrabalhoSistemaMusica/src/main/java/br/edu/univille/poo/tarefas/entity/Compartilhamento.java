package br.edu.univille.poo.tarefas.entity;

import br.edu.univille.poo.tarefas.entity.NivelAcesso;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Compartilhamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompartilhamento;
    private String dataCompartilhamento;

    @ManyToOne
    @JoinColumn(name = "idNivelAcesso")
    private NivelAcesso nivelAcesso;

    @ManyToMany
    @JoinTable(name = "compartilhamento_playlist",
            joinColumns = @JoinColumn(name = "idCompartilhamento"),
            inverseJoinColumns = @JoinColumn(name = "idPlaylist"))
    private List<Playlist> playlists;
}
