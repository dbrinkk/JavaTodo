package org.dbrinkk.agenda;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.dbrinkk.agendaTodo.AgendaTodo;
import org.dbrinkk.todoUser.TodoUser;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AGENDA")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Null
    private String title;

    @NotNull
    private String createdBy;

    @NotNull
    private Date createdOn;

    @OneToMany(mappedBy = "agenda")
    private List<AgendaTodo> agendaTodos;

    @ManyToOne()
    @JoinColumn(name = "userId", nullable = false)
    private TodoUser todoUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<AgendaTodo> getAgendaTodos() {
        return agendaTodos;
    }

    public void setAgendaTodos(List<AgendaTodo> agendaTodos) {
        this.agendaTodos = agendaTodos;
    }

    public TodoUser getUser() {
        return todoUser;
    }

    public void setUser(TodoUser user) {
        this.todoUser = user;
    }
}
