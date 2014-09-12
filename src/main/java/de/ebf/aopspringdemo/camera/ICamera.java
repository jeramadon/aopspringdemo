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
//  for aspects when interface needed to instantiate bean
public interface ICamera {

    void snap();

    void snap(int exposure);
    
    void snap(double fstop, int exposure);

    String snap(String photoName);

    void snapNight();

    public void migrateCamera(OldCamera oldCamera);
    
}
