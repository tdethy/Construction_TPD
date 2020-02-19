
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	//Open Constructor
	public SingleFamilyHome() {
		// TODO Auto-generated constructor stub
	}
	
	//Preferred Constructor
public SingleFamilyHome(String projectName,String completeAddress,double totalSquareFeet,String occupencyGroup,String subGroup,int numBedrooms,
		int numBathrooms, boolean LaundryRoom, boolean garage) {
		super(projectName,completeAddress,totalSquareFeet,occupencyGroup,subGroup, numBedrooms, numBathrooms,LaundryRoom);
		this.garage = garage;
	
	}


public void draw() {//draw method ??
}



public String toString() {
	
	char C;
	char D;
	
	if(laundryRoom == true )
		C = 'Y';
	else 
		C = 'N';
	if(garage == true)
		D = 'Y';
	else
		D = 'N';
	
	StringBuilder homes = new StringBuilder(); //call the super class reportStructure method
	homes.append("Project Name: " + this.getProjectName()+"\n");
	homes.append("Address: " + this.getCompleteAddress()+"\n");
	homes.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
	homes.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
	homes.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
	homes.append("Number of Bedrooms: " + this.getNumBedrooms()+"\n");
	homes.append("Number of Bathrooms: " + this.getNumBathrooms()+"\n");
	homes.append("Laundry Room: " + this.isLaundryRoom()+ C + "\n");
	homes.append("Garage: " + isGarage()+ D + "\n");
	


	return homes.toString();
}

public String displayData() {//CHANGED TO VOID FROM STRING
	return toString();
}


	//Setters/Getters
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	
	
}
