package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect
{
    @Pointcut("within(com.aop..*)")
    public void authenticatingPointcut(){
//authenticate whole com.aop package
    }

    @Pointcut("within(com.aop..*)")
    public void authorizePointCut(){
//authorize ShoppingCart's
    }

    @Before("authenticatingPointcut() && authorizePointCut()")
    public void authenticate(){
        System.out.println("Authenticating...");
    }
}
