/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ebf.aopspringdemo.camera;

import de.ebf.aopspringdemo.utilities.Utilities;

/**
 *
 * @author jerryamadon
 */
public class CoreCamera implements ICoreCamera {

    @Override
    public void powerOn() {
        Utilities.writeToConsole("powering on...");
    }    
}
