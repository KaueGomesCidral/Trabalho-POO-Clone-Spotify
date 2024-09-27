package br.edu.univille.poo.tarefas.entity;

import br.edu.univille.poo.tarefas.entity.Usuario;
import jakarta.persistence.*;

@Entity
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssinatura;
    private String tipoAssinatura;
    private Double custoMensal;
    private String beneficios;

    @OneToOne(mappedBy = "assinatura")
    private Usuario usuario;

}
