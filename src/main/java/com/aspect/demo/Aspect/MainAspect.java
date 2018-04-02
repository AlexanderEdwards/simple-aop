package com.aspect.demo.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MainAspect {

    @Pointcut("execution(* com.aspect.demo.Controller.AspectController.*(..))")
    public void controllerMethods(){
        System.out.println("it ran.");
    }

    @Before("controllerMethods()")
    public void printAspect(final JoinPoint joinPoint){
        joinPoint.getSignature().getName();
    }

}
