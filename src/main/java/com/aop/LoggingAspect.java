package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
    @Before("execution(* com.aop.ShoppingCart.checkout(..))")
    public void logging(JoinPoint jp){
        System.out.println("Signature: "+jp.getSignature());
        System.out.println("Arg: "+jp.getArgs()[0]);
        System.out.println("Before Logger method");
    }

    @After("execution(* com.aop.ShoppingCart.checkout(..))")
    public void afterLogging(){
        System.out.println("After logger method");
    }

    @Pointcut("execution(* com.aop.ShoppingCart.quantity(..))")
    public void afterReturningPointcut(){

    }

    @AfterReturning(pointcut = "afterReturningPointcut()",returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("Quantity: "+retVal);
    }
}
