package org.dbrinkk.agendaTodo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.dbrinkk.agenda.Agenda;
import org.dbrinkk.todo.Todo;

import java.util.Date;

@Entity
@Table(name = "AgendaTodo")
public class AgendaTodo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer agendaId;

    @NotNull
    private Integer todoId;

    @NotNull
    private Integer priority;

    @NotNull
    private Date createdOn;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    public Agenda agenda;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    public Todo todo;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(Integer agendaId) {
        this.agendaId = agendaId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }
}
