package com.umind.shape.service;

public interface TestShapeService {                 // service inerface
	public String testSquare(Double l);             // method to test Square
	public String testCircle(Double r);             // method to test Circle
	public String testTriangle(Double l);           // method to test Triangle
	public String testAll(Double u);                // method to test All synchronously
	public String testAllAsync(Double u);           // method to test All asynchronously
}
