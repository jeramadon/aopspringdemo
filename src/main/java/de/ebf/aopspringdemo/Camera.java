/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

import de.ebf.aopspringdemo.utilities.Utilities;

/**
 *
 * @author jerryamadon
 */
public class Camera {
    
    public void snap() {
        Utilities.writeToConsole("snap!");
    }    
}