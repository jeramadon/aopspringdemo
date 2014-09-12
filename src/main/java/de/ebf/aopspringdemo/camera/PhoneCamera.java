/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo.camera;

import de.ebf.aopspringdemo.utilities.Utilities;
import org.springframework.stereotype.Component;

/**
 *
 * @author jerryamadon
 */
@Component
public class PhoneCamera implements ICamera {
    
    @Override
    public void snap() {
        Utilities.writeToConsole("snap! (phone)");
    }    
    
    @Override
    public void snap(int exposure) {
        Utilities.writeToConsole("snap! exposure = " + exposure);
    }    
    
    @Override
    public void snap(double fstop, int exposure) {
        Utilities.writeToConsole("snap! fstop = " + fstop +  " exposure = " + exposure);
    }    
    
    @Override
    public void snapNight() {
        Utilities.writeToConsole("snap! (night)");
    }    
    
    @Override
    public String snap(String photoName) {
        Utilities.writeToConsole("snap! name = " + photoName);
        return photoName;
    }    

    @Override
    public void migrateCamera(OldCamera oldCamera) {        
        Utilities.writeToConsole("migrating camera!");
    }
}
