package com.flashyy.aopDemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
   // @Before("execution(public void addAccount())")
    //@Before("execution(public void add*(com.flashyy.aopDemo.Account.Account))")
   @Before("execution(public void addAccount(..))")
    public void beforeAdvice(){
        System.out.print("\nthis should come before the getClass statement \n");

    }
}
