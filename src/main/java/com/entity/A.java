package com.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A
{
    private B b;
    public A()
    {
        System.out.println("A Object Is Created!!!");
    }
    public void display()
    {
        b.display();
    }

    public B getB()
    {
        return b;
    }

    public void setB(B b)
    {
        this.b = b;
    }
}
