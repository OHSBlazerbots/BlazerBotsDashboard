/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.models;

import javax.persistence.CollectionTable;
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
@Table(name = "event_committment")
public class EventCommittment {
    @Id
    @GeneratedValue
    long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @CollectionTable(name = "user")
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @CollectionTable(name = "event")
    private Event event;

    public EventCommittment(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EventCommittment{" + "id=" + id + ", user=" + user + ", event=" + event + '}';
    }
    
    
}
