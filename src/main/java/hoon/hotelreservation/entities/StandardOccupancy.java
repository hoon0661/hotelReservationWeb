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
@Entity(name = "standardoccupancy")
public class StandardOccupancy {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    
    @Column
    private int occupancynumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOccupancynumber() {
        return occupancynumber;
    }

    public void setOccupancynumber(int occupancynumber) {
        this.occupancynumber = occupancynumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.occupancynumber;
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
        final StandardOccupancy other = (StandardOccupancy) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.occupancynumber != other.occupancynumber) {
            return false;
        }
        return true;
    }
    
    
}
