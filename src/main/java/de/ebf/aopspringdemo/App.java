/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

import de.ebf.aopspringdemo.accessories.Lens;
import de.ebf.aopspringdemo.camera.Camera;
import de.ebf.aopspringdemo.camera.ICamera;
import de.ebf.aopspringdemo.camera.ICoreCamera;
import de.ebf.aopspringdemo.camera.OldCamera;
import de.ebf.aopspringdemo.camera.PhoneCamera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jerryamadon
 */
public class App {
    
    private static ApplicationContext appContext;
    
    public static void main(String[] args) {        
        appContext = new ClassPathXmlApplicationContext("beans.xml");
        cameraActions_Tutorial_80();
    }
    
    private static void cameraActions_Tutorial_80() {
        OldCamera oldCamera = (OldCamera)appContext.getBean("oldCamera");
        oldCamera.snap();
        
        ICamera phoneCamera = (ICamera)appContext.getBean("phoneCamera");        
        phoneCamera.migrateCamera(oldCamera);
        phoneCamera.snap();
        phoneCamera.snap("Mosel");
        phoneCamera.snap(1000);        
        phoneCamera.snap(1.8, 2000);
        
        ((ICoreCamera)phoneCamera).powerOn();
    }
    
    private static void cameraActions_Tutorial_79() {
        ICamera camera = (ICamera)appContext.getBean("camera");
        camera.snap();
        camera.snap(1000);
        camera.snap("Mosel");
        camera.snapNight();
        Lens lens = (Lens)appContext.getBean("lens");
        lens.zoom(5);
    }
}
