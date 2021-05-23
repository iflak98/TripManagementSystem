package com.g5.tms.service;

import java.util.List;

import com.g5.tms.entities.Travels;
import com.g5.tms.exceptions.TravelsNotFoundException;

public interface ITravelsService {
	
		
			public Travels  addTravels(Travels travels);
			public Travels  updateTravels(Travels travels) throws TravelsNotFoundException;
			public Travels  removeTravels(int travelsId) throws TravelsNotFoundException;
			public Travels searchTravels(int travelsId) throws TravelsNotFoundException;
			public  List<Travels>  viewTravels();
	
	

}
