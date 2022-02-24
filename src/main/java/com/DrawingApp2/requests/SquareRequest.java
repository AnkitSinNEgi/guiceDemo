package com.DrawingApp2.requests;

import com.DrawingApp2.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
	
	DrawShape d;
	@Inject
	public SquareRequest(DrawShape d)
	{
		this.d=d;
	}
	public void makeRequest()
	{
		d.draw();
	}

}
