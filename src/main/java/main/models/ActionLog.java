/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sam
 */
@Entity
@Table(name = "action_log")
public class ActionLog {
    @Id
    @GeneratedValue
    long id;
    @Column
    String text;
    @Column
    String datetime;

    @Override
    public String toString() {
        return "ActionLog{" + "id=" + id + ", text=" + text + ", datetime=" + datetime + '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public long getId() {
        return id;
    }

    public ActionLog(String text, String datetime) {
        this.text = text;
        this.datetime = datetime;
    }
}
