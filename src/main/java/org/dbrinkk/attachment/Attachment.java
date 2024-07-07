package org.dbrinkk.attachment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.dbrinkk.todo.Todo;

import java.util.Date;

@Entity
@Table(name = "ATTACHMENT")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String type;

    @NotNull
    private String storageUrl;

    @NotNull
    private Date createdOn;

    @ManyToOne
    @JoinColumn(name = "todoId", nullable = false)
    private Todo todo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }
}
