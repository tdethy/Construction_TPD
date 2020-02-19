
public class Business extends Building {

	
	protected int numRentableUnits;
	
//Open constructor
	public Business() {
		super();
		numRentableUnits = 0;
	}

//Preferred Constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupencyGroup, subGroup);
		// TODO Auto-generated constructor stub
		this.numRentableUnits = numRentableUnits;
	}
	
	
	public String toString() {
		StringBuilder buss = new StringBuilder();//calls a new object string
		buss.append("Project Name: " + this.getProjectName()+"\n");
		buss.append("Address: " + this.getCompleteAddress()+"\n");
		buss.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
		buss.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
		buss.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
		buss.append("Number of Rentable Units: " + this.getNumRentableUnits()+"\n");
		
		return buss.toString();
	}
	
	
//Getters/Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

}
