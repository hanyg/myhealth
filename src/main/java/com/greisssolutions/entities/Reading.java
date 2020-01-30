/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greisssolutions.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.apache.tapestry5.beaneditor.NonVisual;
import javax.persistence.Id;
/**
 *
 * @author hany
 */
@Entity
public class Reading {

    @Id
    @GeneratedValue
    @NonVisual
    public Long id;
    public int systolic;
    public int diastolic;
    public int heartRate;
}
