/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

import de.ebf.aopspringdemo.utilities.Utilities;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author jerryamadon
 */
@Component
@Aspect
public class Logger {

    // reusable pointcut, otherwise put the pointcut execution line direct in @Before
    @Pointcut("execution(void de.ebf.aopspringdemo.Camera.snap())")
    public void cameraSnap() {        
    }
    
    @Before("cameraSnap()")
    public void onWillTakePhoto() {
        Utilities.writeToConsole("photo will be taken...");
    }    
}
