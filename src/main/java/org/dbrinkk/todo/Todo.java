package org.dbrinkk.todo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.dbrinkk.agendaTodo.AgendaTodo;
import org.dbrinkk.attachment.Attachment;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TODO")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String title;

    @Null
    private String description;

    @Null
    private Date dueDate;

    @NotNull
    private String status;

    @NotNull
    private Date createdOn;

    @OneToMany(mappedBy = "todo")
    private List<Attachment> attachments;

    @OneToMany(mappedBy = "todo")
    private List<AgendaTodo> agendaTodos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<AgendaTodo> getAgendaTodos() {
        return agendaTodos;
    }

    public void setAgendaTodos(List<AgendaTodo> agendaTodos) {
        this.agendaTodos = agendaTodos;
    }
}
