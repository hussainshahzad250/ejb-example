package com.ejb.helloworld;

import javax.ejb.Remote;

@Remote
public interface Hello {
 
    public String sayHello();
}