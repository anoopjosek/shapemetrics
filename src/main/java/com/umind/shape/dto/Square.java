package com.umind.shape.dto;

import com.umind.shape.utils.Constants;

public class Square extends Shape{                                  // class for Shape Square
	
	public Square(Double l){                                        // overloaded constructor
		num = l;                                                    // set length
	}                                                               // end
	
	@Override
	public Double getArea() {                                       // Square specific implementation of getArea()
		Double area = Math.pow(num, 2);                             // math
		return Double.
				valueOf(Constants.FORMAT_OUTPUT.format(area));      // math
	}                                                               // end

	@Override
	public String toString(){                                       // overriding the toString()
		return "Square Length:" + num + " --> Area:" + getArea();   // return String format
	}                                                               // end
}