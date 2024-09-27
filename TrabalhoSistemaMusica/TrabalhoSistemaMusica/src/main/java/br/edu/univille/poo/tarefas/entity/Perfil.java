package br.edu.univille.poo.tarefas.entity;

import br.edu.univille.poo.tarefas.entity.Usuario;
import jakarta.persistence.*;

@Entity
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    private String nomeUsuario;
    private String foto;
    private String musicasCurtidas;
    private String configTema;

    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

}
