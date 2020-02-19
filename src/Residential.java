
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	
	
//Open constructor
	public Residential() {
		// TODO Auto-generated constructor stub
	}
//Preferred constructor
	public Residential(String projectName,String completeAddress,double totalSquareFeet,String occupencyGroup,String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom ) {
		super(projectName,completeAddress,totalSquareFeet,occupencyGroup,subGroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}

	
	public String toString() {
		StringBuilder ress = new StringBuilder();//calls a new object string
		ress.append("Project Name: " + this.getProjectName()+"\n");
		ress.append("Address: " + this.getCompleteAddress()+"\n");
		ress.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
		ress.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
		ress.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
		ress.append("Number of Bedrooms: " + this.getNumBedrooms()+"\n");
		ress.append("Number of Bathrooms: " + this.getNumBathrooms()+"\n");
		ress.append("Laundry Room: " + this.isLaundryRoom()+"\n");
		
		return ress.toString();
	}
	
	
//Getters/Setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	
	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}


	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	
}
