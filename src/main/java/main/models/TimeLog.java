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
@Table(name = "time_log")
public class TimeLog {
    @Id
    @GeneratedValue
    long id;
    @Column
    String start;
    @Column
    String end;
    @ManyToOne(fetch = FetchType.EAGER)
    @CollectionTable(name = "user")
    User added_by;

    @Override
    public String toString() {
        return "TimeLog{" + "id=" + id + ", start=" + start + ", end=" + end + ", added_by=" + added_by + '}';
    }

    public long getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public User getAdded_by() {
        return added_by;
    }

    public void setAdded_by(User added_by) {
        this.added_by = added_by;
    }

    public TimeLog(String start, String end, User added_by) {
        this.start = start;
        this.end = end;
        this.added_by = added_by;
    }
}
