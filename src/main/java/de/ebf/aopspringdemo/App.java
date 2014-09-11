/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

import de.ebf.aopspringdemo.accessories.Lens;
import de.ebf.aopspringdemo.camera.Camera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jerryamadon
 */
public class App {
    
    public static void main(String[] args) {        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Camera camera = (Camera)appContext.getBean("camera");
        camera.snap();
        camera.snap(1000);
        camera.snap("Mosel");
        camera.snapNight();
        Lens lens = (Lens)appContext.getBean("lens");
        lens.zoom(5);
    }   
}
