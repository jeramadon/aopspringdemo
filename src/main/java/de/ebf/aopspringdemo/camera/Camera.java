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
public class Camera {
    
    public void snap() {
        Utilities.writeToConsole("snap!");
    }    
    
    public void snap(int exposure) {
        Utilities.writeToConsole("snap! exposure = " + exposure);
    }    
    
    public void snapNight() {
        Utilities.writeToConsole("snap! (night)");
    }    
    
    public String snap(String photoName) {
        Utilities.writeToConsole("snap! name = " + photoName);
        return photoName;
    }    
}
