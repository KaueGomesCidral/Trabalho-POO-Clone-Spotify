package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class NivelAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNivel;
    private String tipo;

    @OneToMany(mappedBy = "nivelAcesso")
    private List<Compartilhamento> compartilhamentos;

}
