/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.models;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sam
 */
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue
    long id;
    @Column
    String title;
    @Column
    String text;
    @ManyToOne(fetch = FetchType.EAGER)
    @CollectionTable(name = "user")
    User created_by;
    @Column
    String createdOn;
    @Column
    String send_time;

    public Notification(String title, String text, User created_by, String createdOn, String send_time) {
        this.title = title;
        this.text = text;
        this.created_by = created_by;
        this.createdOn = createdOn;
        this.send_time = send_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Notification{" + "id=" + id + ", title=" + title + ", text=" + text + ", created_by=" + created_by + ", createdOn=" + createdOn + ", send_time=" + send_time + '}';
    }
}
