package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;
    private String nomeGenero;

    @OneToMany(mappedBy = "genero")
    private List<Musica> musicas;

}
