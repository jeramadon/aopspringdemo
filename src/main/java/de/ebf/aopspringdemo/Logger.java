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
    public void phoneCameraAllWithin() {        
    }
    
    @Pointcut("target(de.ebf.aopspringdemo.camera.PhoneCamera)")
    public void phoneCameraAllTarget() {        
    }
    
    @Pointcut("this(de.ebf.aopspringdemo.camera.ICamera)")
    public void phoneCameraAllThis() {        
    }
    
    @Pointcut("within(@Deprecated de.ebf.aopspringdemo.camera..*)")
    public void deprecatedCameraAction() {        
    }
    
    @Pointcut("@target(org.springframework.stereotype.Component)")
    public void atTargetComponentAction() {        
    }
    
    @Pointcut("@annotation(java.lang.Deprecated)")
    public void deprecatedAction() {        
    }
    
    @Pointcut("@args(org.springframework.stereotype.Component)")
    public void componentArgumentAction() {        
    }
    
    @Pointcut("@args(java.lang.Deprecated)")
    public void deprecatedArgumentAction() {        
    }
    
    @Pointcut("bean(*Camera)")
    public void cameraBeanAction() {        
    }
    
    @Pointcut("args()")
    public void noArgumentAction() {        
    }
    
    @Pointcut("args(Double, ..)")
    public void doubleArgumentAction() {        
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
    
    @Before("phoneCameraAllWithin()")
    public void onPhoneCameraActionWithin() {
        Utilities.writeToConsole("phone camera action within...");
    }    
    
    @Before("phoneCameraAllTarget()")
    public void onPhoneCameraActionTarget() {
        Utilities.writeToConsole("phone camera action target...");
    }    
    
    @Before("phoneCameraAllThis()")
    public void onPhoneCameraActionThis() {
        Utilities.writeToConsole("phone camera action this...");
    }    
    
    @Before("cameraRelatedAction()")
    public void onWillDoCameraRelatedAction() {
        Utilities.writeToConsole("camera action activated...");
    } 
    
    @Before("deprecatedCameraAction()")
    public void onDeprecatedCameraAction() {
        Utilities.writeToConsole("deprecated camera action...");
    } 
    
    @Before("atTargetComponentAction()")
    public void onAtTargetComponentAction() {
        Utilities.writeToConsole("component action...");
    } 
    
    @Before("deprecatedAction()")
    public void onDeprecatedAction() {
        Utilities.writeToConsole("deprecated action...");
    } 
    
    @Before("componentArgumentAction()")
    public void onComponentArgumentAction() {
        Utilities.writeToConsole("component argument action...");
    } 
    
    @Before("deprecatedArgumentAction()")
    public void onDeprectedArgumentAction() {
        Utilities.writeToConsole("deprecated argument action...");
    } 
    
    @Before("cameraBeanAction()")
    public void onCameraBeanAction() {
        Utilities.writeToConsole("camera bean action...");
    } 
    
    @Before("noArgumentAction()")
    public void onNoArgumentAction() {
        Utilities.writeToConsole("no argument action...");
    } 
    
    @Before("doubleArgumentAction()")
    public void onDoubleArgumentAction() {
        Utilities.writeToConsole("double argument action...");
    } 
}
