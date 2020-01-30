package com.greisssolutions.pages;

import com.greisssolutions.entities.Reading;
import com.greisssolutions.model.Readings;
import java.util.ArrayList;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.HttpError;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.slf4j.Logger;

import java.util.Date;
import org.apache.tapestry5.annotations.SessionState;

/**
 * Start page of application myhealth.
 */
public class Home {

    @SessionState
    private Readings readings;

    public void setupRender() {
    }

    Object onCreate() {
        return "create";
    }
    
    public int getSystolicAvg() {
        if (readings.getReadings().isEmpty()) {
            return 0;
        }
        
        int total = 0;
        for (Reading r : readings.getReadings()) {
            total += r.systolic;
        }
        
        return total/readings.getReadings().size();
    }

    public int getDiastolicAvg() {
        if (readings.getReadings().isEmpty()) {
            return 0;
        }
        
        int total = 0;
        for (Reading r : readings.getReadings()) {
            total += r.diastolic;
        }
        
        return total/readings.getReadings().size();
    }

    public int getHeartRateAvg() {
        if (readings.getReadings().isEmpty()) {
            return 0;
        }
        
        int total = 0;
        for (Reading r : readings.getReadings()) {
            total += r.heartRate;
        }
        
        return total/readings.getReadings().size();
    }

    public ArrayList<Reading> getReadings() {
        return readings.getReadings();
    }
}
