package Tetra.Inhabitant;

import Tetra.Inhabitant.Vehicle.TFlier;


public class THeroWithTFlier extends TRovers {
	
	//
	private THero thero = null;
	
	//
	private TFlier tflier = null;
	
	public THeroWithTFlier (THero thero , TFlier tflier){
		this.thero = thero;
		this.tflier = tflier;
	}
	

	public void move(){
		
	}
	
	/**
	 * This is a decorated method.
	 */
	@Override
	public String getType() {
		return thero.getType() + "WithTFlier";
	}
	
	@Override
	public String getImageFilePath() {
		int endIndex = super.getImageFilePath().indexOf(".jpg");
		return super.getImageFilePath().substring(0, endIndex) + "WithTFlier.jpg";
	}
}
