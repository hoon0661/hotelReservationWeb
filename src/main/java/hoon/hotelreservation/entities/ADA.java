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
}
