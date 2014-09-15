/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ebf.aopspringdemo.camera;

import de.ebf.aopspringdemo.utilities.Utilities;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 *
 * @author jerryamadon
 */
@Component
@Aspect
public class CameraAspect_90 {
    
    @DeclareParents(value="de.ebf.aopspringdemo.camera.*", defaultImpl=de.ebf.aopspringdemo.camera.CoreCamera.class)
    private ICoreCamera coreCamera;
    
    @Around("within(de.ebf.aopspringdemo.camera.*)")
    public void onWithinCameraPackageAround(ProceedingJoinPoint proceedingJoinPoint) {
        Utilities.writeToConsole("within camera package, before...");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            Utilities.writeToConsole(throwable.getMessage());
        }
        Utilities.writeToConsole("within camera package, after...");
    }
}
