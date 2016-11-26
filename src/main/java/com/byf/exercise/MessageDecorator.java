package com.byf.exercise;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by yunfeng on 2016/11/14.
 */
public class MessageDecorator implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.print("Hello ");
        Object retVal = methodInvocation.proceed();
        System.out.println("!");
        return retVal;
    }

}
