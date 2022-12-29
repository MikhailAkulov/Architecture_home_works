package ru.geekbrains.home_work_6.notes.core.domain;

import java.util.Date;

public class Note {

    private int userId;
    private int id;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Note(int id, int userId, String title, String details, Date creationDate){
        this.id = id;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return String.format("[%d] - [%s] - [%s]", id, title, details);
    }
}
