package br.edu.ifspcjo.ads.web2.escalareuniao.domain.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "reuniao_familiar")
public class ReuniaoFamiliar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @NotNull
    @Column(name = "dia_semana")
    private String diaSemana;

    @NotNull
    @Column(name = "irmao_responsavel")
    private String irmaoResponsavel;

    @NotNull
    private String endereco;

    @NotNull
    private String horario;

    @NotNull
    private String atendente;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }

    public String getIrmaoResponsavel() { return irmaoResponsavel; }
    public void setIrmaoResponsavel(String irmaoResponsavel) { this.irmaoResponsavel = irmaoResponsavel; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getAtendente() { return atendente; }
    public void setAtendente(String atendente) { this.atendente = atendente; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ReuniaoFamiliar other = (ReuniaoFamiliar) obj;
        return Objects.equals(id, other.id);
    }
}
