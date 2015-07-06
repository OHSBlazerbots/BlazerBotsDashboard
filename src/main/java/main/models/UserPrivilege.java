/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.models;

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
@Table(name = "user_privilege")
public class UserPrivilege {
    @Id
    @GeneratedValue
    long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @Column
    String user_role;

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserPrivilege(User user, String user_role) {
        this.user = user;
        this.user_role = user_role;
    }

    @Override
    public String toString() {
        return "UserPrivilege{" + "id=" + id + ", user=" + user + ", user_role=" + user_role + '}';
    }
}
