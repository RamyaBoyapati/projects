package com.infinite;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class InfiniteHelloWorld
 */
@Stateless
@Remote(InfiniteHelloWorldRemote.class)
public class InfiniteHelloWorld implements InfiniteHelloWorldRemote {

    /**
     * Default constructor. 
     */
    public InfiniteHelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String Hello() {
		// TODO Auto-generated method stub
		return "Welcome Ramya";
	}

	

}
