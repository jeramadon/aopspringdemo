/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo.camera;

/**
 *
 * @author jerryamadon
 */
public interface ICamera {
    //  for aspects when interface needed

    void snap();

    void snap(int exposure);

    String snap(String photoName);

    void snapNight();
    
}
