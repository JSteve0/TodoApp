package dev.theCheeseSticks.TodoApp.documents;

import java.util.Date;
import java.util.Objects;

public class Todo {

    private String title;
    private String description;
    private String category;
    private Date addedDate;
    private Date completedDate;
    private Date dueDate;
    private Boolean completedStatus;

    public Todo(String title, String description, String category, Date addedDate, Date completedDate, Date dueDate, Boolean completedStatus) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.addedDate = addedDate;
        this.completedDate = completedDate;
        this.dueDate = dueDate;
        this.completedStatus = completedStatus;
    }

    public Todo() {
        this.title = null;
        this.description = null;
        this.category = null;
        this.addedDate = null;
        this.completedDate = null;
        this.dueDate = null;
        this.completedStatus = null;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", addedDate=" + addedDate +
                ", completedDate=" + completedDate +
                ", dueDate=" + dueDate +
                ", completedStatus=" + completedStatus +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, category, addedDate, completedDate, dueDate, completedStatus);
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getCompletedStatus() {
        return completedStatus;
    }

    public void setCompletedStatus(Boolean completedStatus) {
        this.completedStatus = completedStatus;
    }

}
