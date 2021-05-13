/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoon.hotelreservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hoon0
 */
@Entity(name = "ada") //"ada" is the name of table in database
public class ADA {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for autoincrement of id number
    @Id
    private int id;
    
    @Column //for columns other than primary key
    private boolean access;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + (this.access ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ADA other = (ADA) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.access != other.access) {
            return false;
        }
        return true;
    }
    
    
}
