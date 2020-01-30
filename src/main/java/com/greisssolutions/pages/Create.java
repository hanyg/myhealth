/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greisssolutions.pages;

import com.greisssolutions.entities.Reading;
import com.greisssolutions.model.Readings;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 *
 * @author hany
 */
public class Create {
    
    @Inject
    private Session session;
    
    @SessionState
    private Readings readings;
    
    @Property
    private Reading reading;
    
    void onPrepareForSubmit() throws Exception {
        reading = new Reading();
    }
    
    @CommitAfter
    Object onSuccess() { 
        session.persist(reading);
        readings.getReadings().add(reading);
        return "home";
    }
}
