package com.byf.exercise;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yunfeng on 2016/11/14.
 */
public class HelloWorldWeaver {
    public static void main(String[] args){
        MessageWriter target = new MessageWriter();

        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.addAdvice(new MessageDecorator());
        proxyFactory.setTarget(target);

        MessageWriter proxy = (MessageWriter) proxyFactory.getProxy();

        target.writeMessage();
        System.out.println("");
        proxy.writeMessage();
    }
}
