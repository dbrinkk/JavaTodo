package org.dbrinkk.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.dbrinkk.agenda.Agenda;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TODOUSER")
public class TodoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private Date createdOn;

    @OneToMany(mappedBy = "todoUser")
    private List<Agenda> agendas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<Agenda> agendas) {
        this.agendas = agendas;
    }
}
