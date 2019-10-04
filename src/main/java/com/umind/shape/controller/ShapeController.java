package com.umind.shape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umind.shape.service.impl.TestShapeServiceImpl;
import com.umind.shape.utils.Constants;

@RestController
public class ShapeController {                                            // controller - entry point
	
	@Autowired
	private TestShapeServiceImpl testShapeService;                        // Autowire the service object
	
	@RequestMapping(method=RequestMethod.GET, 
					value=Constants.GET_SQUARE_AREA)                      // to get the area of square alone
	public String testSquare(@PathVariable("len") Double len){            // get length
		return testShapeService.testSquare(len);                          // call the service
	}                                                                     // end

	@RequestMapping(method=RequestMethod.GET, 
					value=Constants.GET_CIRCLE_AREA)                      // to get the area of circle
	public String testCircle(@PathVariable("rad") Double rad){            // get the radius
		return testShapeService.testCircle(rad);                          // call service
	}                                                                     // end

	@RequestMapping(method=RequestMethod.GET, 
					value=Constants.GET_TRIANGLE_AREA)                    // to get the area of triangle
	public String testTriangle(@PathVariable("len") Double len){          // get the length
		return testShapeService.testTriangle(len);                        // call service
	}                                                                     // end

	@RequestMapping(method=RequestMethod.GET, 
					value=Constants.GET_ALL_AREA)                         // get area of ALL synchronously
	public String testAll(@PathVariable("unit") Double unit){             // get the length
		return testShapeService.testAll(unit);                            // call service
	}                                                                     // end

	@RequestMapping(method=RequestMethod.GET, 
					value=Constants.GET_ALL_AREA_ASYNC)                   // get area of ALL asynchronously
	public String testAllAsync(@PathVariable("unit") Double unit){        // get the length
		return testShapeService.testAllAsync(unit);                       // call service
	}                                                                     // end
}