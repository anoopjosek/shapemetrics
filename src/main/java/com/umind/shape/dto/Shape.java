package com.umind.shape.dto;

import java.util.concurrent.Callable;

public abstract class Shape implements Callable<Double>{           // This is the base shape object, must implement Callable for threading
	protected Double num;                                          // use the common variable num
	public abstract Double getArea();                              // all concrete children must implement getArea()
	
	@Override
	public Double call() throws Exception {                        // call() for threads
        return getArea();                                          // call the getArea()
	}                                                              // end
}