package com.drawingapp.main;

import com.DrawingApp2.requests.SquareRequest;
//import com.DrawingApp.requests.SquareRequest;
import com.DrawingApp2.services.DrawShape;
import com.DrawingApp2.services.DrawSquare;
import com.drawingapp.module.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQUARE_REQ ="SQUARE";
	
	private static void sendRequest(String squareReq)
	{
		if(squareReq.equals(SQUARE_REQ))
		{
			//DrawShape d = new DrawSquare();
			
			
		
//			Injector injector = Guice.createInjector(new AppModule());
//			DrawShape d = injector.getInstance(DrawShape.class);
//			SquareRequest request = new SquareRequest(d);
		//	request.makeRequest();
			
			Injector injector =Guice.createInjector(new AppModule());
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
		}
	}

	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);

	}

}
