package com.umind.shape.utils;

import java.text.DecimalFormat;

public interface Constants {
	static final String GET_SQUARE_AREA = "/square/{len}";                           // for area of square
	static final String GET_CIRCLE_AREA = "/circle/{rad}";                           // for area of circle
	static final String GET_TRIANGLE_AREA = "/triangle/{len}";                       // for area of triangle
	static final String GET_ALL_AREA = "/all/{unit}";                                // total area
	static final String GET_ALL_AREA_ASYNC = "/allAsync/{unit}";                     // total area in threads
	static final DecimalFormat FORMAT_OUTPUT = new DecimalFormat("0.00");            // format specifier
}
