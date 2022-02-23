package com.drawingapp.main;

import com.DrawingApp2.services.DrawShape;

public class SquareRequest {

DrawShape d;
	
	public SquareRequest(DrawShape d)
	{
		this.d=d;
	}
	public void makeRequest()
	{
		d.draw();
	}
	
}
