package com.g5.tms.repository;

import java.util.List;

import com.g5.tms.entities.Route;
import com.g5.tms.exceptions.RouteNotFoundException;

public interface IRouteRepository {
	
	
	public  Route  addRoute(Route route);
	public  Route  updateRoute(Route route) throws RouteNotFoundException;
	public  Route   removeRoute(int routeId) throws RouteNotFoundException;
	public  Route    searchRoute(int routeId) throws RouteNotFoundException;
	public  List<Route> viewRouteList();
	
	
	
	

}
