
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	
	//Open Constructor
	public Apartment() {
		// TODO Auto-generated constructor stub
	}
	//Preferred Constructor
	public Apartment(String projectName,String completeAddress,double totalSquareFeet,String occupencyGroup,String subGroup, int numBedrooms, int numBathrooms, boolean LaundryRoom,
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName,completeAddress,totalSquareFeet,occupencyGroup, subGroup, numBedrooms, numBathrooms, LaundryRoom);
		// TODO Auto-generated constructor stub
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}


	public void draw() {//draw method ??
	}
	
	public String toString(){
		
		
			char A;
			char B;
			
			if(laundryRoom == true )
				A = 'Y';
			else 
				A = 'N';
			if(parkingAvailable == true)
				B = 'Y';
			else
				B = 'N';
		
		
		
		StringBuilder apts = new StringBuilder(); //call the super class reportStructure method
		apts.append("Project Name: " + this.getProjectName()+"\n");
		apts.append("Address: " + this.getCompleteAddress()+"\n");
		apts.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
		apts.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
		apts.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
		apts.append("Number of Bedrooms: " + this.getNumBedrooms()+"\n");
		apts.append("Number of Bathrooms: " + this.getNumBathrooms()+"\n");
		apts.append("Laundry Room: " + this.isLaundryRoom()+ A + "\n");
		apts.append("Number of Rentable Units: " + this.getNumRentableUnits()+"\n");
		apts.append("Average Unit Size: " + this.getAvgUnitSize()+"\n");
		apts.append("Parking Availability: " + isParkingAvailable()+ B +"\n");
	
	
		return apts.toString();
	}
	
	public String displayData() {//CHANGED TO VOID FROM STRING
		return toString();
	}
	
	
	
	//Getters/Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	
}
