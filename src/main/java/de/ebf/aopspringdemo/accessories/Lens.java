/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo.accessories;

import de.ebf.aopspringdemo.utilities.Utilities;
import org.springframework.stereotype.Component;

/**
 *
 * @author jerryamadon
 */
@Component
public class Lens {
    
    public void zoom(int zoomFactor) {
        Utilities.writeToConsole("zooming x" + zoomFactor);
    }    
}
