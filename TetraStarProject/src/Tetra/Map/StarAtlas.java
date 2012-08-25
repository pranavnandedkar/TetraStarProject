package Tetra.Map;

import java.util.ArrayList;
import java.util.Iterator;

import Tetra.Position;
import Tetra.StarSignal;


public class StarAtlas extends Map {

	private ArrayList<StarMap> mapList = null;
	private StarMap starMap = null;
	private boolean mapAlreadyPresent = false;
	private int mapCount = 0;

	public StarAtlas(Position currentPosition, String mapId){
		super(currentPosition, mapId);
		mapList = new ArrayList<StarMap>();
	}

	/*
	 * This methods add the StarMap instance in the StarAtlas instance but before adding, it checks whether 
	 * this StarMap instance is already present in the StarAtlas instance or not. If not, it will add the 
	 * StarMap instance.
	 */
	public void addStarMap(StarMap starMap){
		Iterator<StarMap> iterator = mapList.iterator();
		while(iterator.hasNext()){
			starMap = iterator.next(); 
			if(this.starMap.getMapId() == starMap.getMapId()){
				mapAlreadyPresent = true;	
			}
		}

		if(mapAlreadyPresent){
			return;
		}

		starMap.setPosition(super.getPosition());
		mapList.add(starMap);
		mapCount = super.getItemCount() + 1;
		super.setItemCount(mapCount);


	}

	public ArrayList<StarMap> getStarMapList(){
		return mapList;
	}

	public String getType(){
		return "StarAtlas";
	}


	@Override
	public void setDirection(String direction) {

	}

	@Override
	public String getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTHeroId(String tHeroId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTHeroId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncryptionDate(String encryptionDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncryptionDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRestorationCounter(int restorationCounter) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRestorationCounter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSymbol(String symbol) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEncrypted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEncrypted(boolean encrypted) {
		// TODO Auto-generated method stub

	}


}
