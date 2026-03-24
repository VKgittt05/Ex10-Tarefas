package com.Gerenciamento_Tarefas.Tarefas.models;

import jakarta.persistence.*;
        import java.time.LocalDate;

@Entity(name = "Tarefa")
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo_tarefa", nullable = false)
    private String titulo;

    @Column(name = "descr_atividade")
    private String descricao;

    @Column(name = "dt_limite")
    private LocalDate dataPrazo;

    private String status;

    // Construtor Padrão
    public Tarefa() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

