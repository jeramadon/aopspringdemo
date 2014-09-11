/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

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
    }   
}
