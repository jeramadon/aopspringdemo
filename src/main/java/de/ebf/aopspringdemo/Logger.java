/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.ebf.aopspringdemo;

import de.ebf.aopspringdemo.utilities.Utilities;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
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

    // reusable pointcut, otherwise put pointcut execution line direct in @Before
    @Pointcut("execution(void de.ebf.aopspringdemo.camera.Camera.*(..))")
    public void cameraSnap() {        
    }
    
    @Pointcut("execution(* de.ebf.aopspringdemo.camera.Camera.snap(String))")
    public void cameraSnapWithName() {        
    }
    
    @Pointcut("execution(* *.*(..))")
    public void cameraRelatedAction() {        
    }
    
    @Pointcut("execution(void de.ebf.aopspringdemo.camera.PhoneCamera.snap())")
    public void phoneCameraSnap() {        
    }
    
    @Pointcut("within(de.ebf.aopspringdemo.camera.PhoneCamera)")
    public void phoneCameraAll() {        
    }
    
    @Before("cameraSnap()")
    public void onWillTakePhoto() {
        Utilities.writeToConsole("photo will be taken...");
    }    
    
    @Before("cameraSnapWithName()")
    public void onWillTakePhotoWithName() {
        Utilities.writeToConsole("photo will be taken with name...");
    }    
    
    @Before("phoneCameraSnap()")
    public void onWillTakePhonePhoto() {
        Utilities.writeToConsole("phone photo will be taken...");
    }    
    
    @After("phoneCameraSnap()")
    public void onDidTakePhonePhoto() {
        Utilities.writeToConsole("phone photo taken.");
    }    
    
    @Around("phoneCameraSnap()")
    public void onWillAndDidTakePhonePhoto(ProceedingJoinPoint proceedingJoinPoint) {
        Utilities.writeToConsole("phone photo will be taken (around)...");
        try {
            proceedingJoinPoint.proceed();
        } catch(Throwable e) {            
        }
        Utilities.writeToConsole("phone photo taken (around).");
    }    
    
    @Before("phoneCameraAll()")
    public void onPhoneCameraAction() {
        Utilities.writeToConsole("phone camera action...");
    }    
    
  /*    
    @Before("cameraRelatedAction()")
    public void onWillDoCameraRelatedAction() {
        Utilities.writeToConsole("camera action activated...");
    } 
//  */    
}
