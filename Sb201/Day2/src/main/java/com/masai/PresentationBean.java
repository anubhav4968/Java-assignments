package com.masai;

public class PresentationBean {
	
	private ServiceBean service;


	public void setService(ServiceBean service) {
		this.service = service;
	}
	public void result()
	{
		service.sum();
		service.subtraction();
		service.multiplication();
	}
	
}
