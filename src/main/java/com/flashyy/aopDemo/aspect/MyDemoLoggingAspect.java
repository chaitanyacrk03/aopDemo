package com.flashyy.aopDemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

   // @Before("execution(public void addAccount())")
    //@Before("execution(public void add*(com.flashyy.aopDemo.Account.Account))")
   //@Before("execution(public void addAccount(..))")
    //we can use a @Pointcut and define a method name for that and by that we can reuse a pointcut exp.
    @Pointcut("execution(public void addAccount(..))")//instead of @Before we use @Pointcut
    private void forDaoPackage(){}//the name of function now can be used as a pointcut exp to the advice

    //we can also use logical operators for pointcut expressions
    //for example if we want advice for all method except getters and setters
    //we can create another pointcut method with expression get*
    // and put the method name in logical operation
    @Pointcut("execution(public void get*())")
    private void getter(){}
    @Pointcut("execution(public void set*")
    private void setter(){}
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void finalExpression(){}
    @Before("forDaoPackage()")//using the method name as pointcut in this advice
    public void beforeAdvice(){
        System.out.print("\nthis should come before the getClass statement \n");

    }
    @Before("finalExpression()")
    public void formApiAnalytics(){
        System.out.print("\n this is the 2nd advice sing pointcut expressions\n");
    }
}
