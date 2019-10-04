package com.umind.shape.dto;

import com.umind.shape.utils.*;

public class Circle extends Shape {                                // Class for Shape Circle

	public Circle(Double r){                                       // overloaded constructor
		num = r;                                                   // set radius
	}                                                              // end
	
	@Override
	public Double getArea() {                                      // Circle specific implementation of getArea()
		Double area=Math.pow(num, 2) * Math.PI;                    // math
		return Double.
				valueOf(Constants.FORMAT_OUTPUT.format(area));     // math
	}                                                              // end

	@Override
	public String toString(){                                      // overriding the toString()
		return "Circle radius:" + num + " --> Area:" + getArea();  // return String format
	}                                                              // end
}