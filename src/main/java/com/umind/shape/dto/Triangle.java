package com.umind.shape.dto;

import com.umind.shape.utils.Constants;

public class Triangle extends Shape{                                 // Class for Triangle Circle
	
	public Triangle(Double l){                                       // overloaded constructor
		num = l;                                                     // set radius
	}                                                                // end
	
	@Override
	public Double getArea() {                                        // Circle specific implementation of getArea()
		Double area = (Math.pow(num, 2)) * (Math.sqrt(3) / 4);       // math
		return Double.
				valueOf(Constants.FORMAT_OUTPUT.format(area));       // math
	}                                                                // end

	@Override
	public String toString(){                                        // overriding the toString()
		return "Triangle Length:" + num + " --> Area:" + getArea();  // return String format
	}                                                                // end
}
