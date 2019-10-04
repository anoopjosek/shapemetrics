package com.umind.shape.service.impl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.stereotype.Service;

import com.umind.shape.dto.Circle;
import com.umind.shape.dto.Square;
import com.umind.shape.dto.Triangle;
import com.umind.shape.service.TestShapeService;
import com.umind.shape.utils.Constants;

@Service
public class TestShapeServiceImpl implements TestShapeService{
	
	public String testSquare(Double l){                        // implementation for testSquare
		Square sq = new Square(l);                             // create object
		return sq.toString();                                  // return toString
	}

	public String testCircle(Double r){                        // implementation for testCircle
		Circle ci = new Circle(r);                             // create object
		return ci.toString();                                  // return toString
	}
	
	public String testTriangle(Double l){                      // implementation for testTriangle
		Triangle tr = new Triangle(l);                         // create object
		return tr.toString();                                  // return toString
	}
	
	public String testAll(Double u){                           // implementation for testAll
		Circle ci = new Circle(u);                             // create object
		Square sq = new Square(u);                             // create object
		Triangle tr = new Triangle(u);                         // create object

		return sq.toString() + " ---- " +                      // return toString
				ci.toString() + " ---- " + 
				tr.toString();
	}

	public String testAllAsync(Double u){                      // implementation for testAllAsync
		ExecutorService executor = Executors.newFixedThreadPool(300);   // create executor
		Future<Double> circleTask = executor.submit(new Circle(u));     // create task for circle
		Future<Double> squareTask = executor.submit(new Square(u));     // create task for square
		Future<Double> triangleTask = executor.submit(new Triangle(u)); // create task for triangle
		Double circleArea = 0.0;                                        // variable for circle area
		Double squareArea = 0.0;                                        // variable for square area
		Double triangleArea = 0.0;                                      // variable for triangle area
		try {
			circleArea = circleTask.get();                              // run the task n get output
			squareArea = squareTask.get();                              // run the task n get output
			triangleArea = triangleTask.get();                          // run the task n get output
			return new String("Circle -> Len = " + u + " Area = " + circleArea + // return the output
							  " Square -> Len = " + u + " Area = " + squareArea + 
							  " Triangle -> Len = " + u + " Area = " + triangleArea + 
							  " Total :" + Double.valueOf(Constants.FORMAT_OUTPUT.format(circleArea+ squareArea + triangleArea)));

		} catch (InterruptedException e) {
			e.printStackTrace();
			return "error";
		} catch (ExecutionException e) {
			e.printStackTrace();
			return "error";
		}
	}
}