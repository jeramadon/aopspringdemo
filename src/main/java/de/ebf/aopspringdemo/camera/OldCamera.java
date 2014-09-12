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
@Deprecated
public class OldCamera {
    
    @Deprecated
    public void snap() {
        Utilities.writeToConsole("snap! (old)");
    }        
}
