/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greisssolutions.model;

import com.greisssolutions.entities.Reading;
import java.util.ArrayList;

/**
 *
 * @author hany
 */
public class Readings {
    private ArrayList<Reading> _readings;

    /**
     * @return the _readings
     */
    public ArrayList<Reading> getReadings() {
        return _readings;
    }

    /**
     * @param _readings the _readings to set
     */
    public void setReadings(ArrayList<Reading> _readings) {
        this._readings = _readings;
    }
}
