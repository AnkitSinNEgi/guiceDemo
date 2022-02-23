package com.drawingapp.main;

//import com.DrawingApp.requests.SquareRequest;
import com.DrawingApp2.services.DrawShape;
import com.DrawingApp2.services.DrawSquare;

public class GuiceDemo {
	
	private static final String SQUARE_REQ ="SQUARE";
	
	private static void sendRequest(String squareReq)
	{
		if(squareReq.equals(SQUARE_REQ))
		{
			DrawShape d = new DrawSquare();
			SquareRequest request = new SquareRequest(d);
			request.makeRequest();
		}
	
		
	}

	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);

	}

}
