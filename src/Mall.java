
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	//open constructor
	public Mall() {
		// TODO Auto-generated constructor stub
		
	}
	//preferred constructor
	public Mall(String projectName,String completeAddress,double totalSquareFeet,String occupencyGroup,String subGroup, int numRentableUnits, 
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName,completeAddress, totalSquareFeet, occupencyGroup, subGroup, numRentableUnits);
		// TODO Auto-generated constructor stub
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}
	
	
	public void draw() {//draw method ??
	}
	
	//toString Method
	public String toString() {
		StringBuilder sb2 = new StringBuilder(); //call the super class reportStructure method
		sb2.append("Project Name: " + this.getProjectName()+"\n");
		sb2.append("Address: " + this.getCompleteAddress()+"\n");
		sb2.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
		sb2.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
		sb2.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
		sb2.append("Number of Rentable Units: " + this.getNumRentableUnits()+"\n");
		sb2.append("Number of Rentable Units: " + this.getNumRentedUnits()+"\n");
		sb2.append("Median Unit Size: " + this.getMedianUnitSize()+"\n");
		sb2.append("Number of Parking Spaces: " + this.getNumParkingSpaces()+"\n");
		

		return sb2.toString();
	}
		
		
	public String displayData() {//CHANGED TO VOID FROM STRING
		return toString();
	}
	
	
	//Getters/Setters
	
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	
	
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	
	
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	
	
}
