//contains the binding i.e which type is bound to which concrete implementation
package com.drawingapp.module;

import com.DrawingApp2.services.DrawShape;
import com.DrawingApp2.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule 
{		
		@Override
		protected void configure()
		{
			bind(DrawShape.class).to(DrawSquare.class);
		}
}
