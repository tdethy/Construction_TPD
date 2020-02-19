//Building class

public class Building {
	
	//variables
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupencyGroup;
	protected String subGroup;
	
	//empty constructor
	public Building() {
		super();
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupencyGroup = "";
		this.subGroup = " ";
	}


	//preferred constructor
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup) {
		super();//not sure this is needed
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupencyGroup = occupencyGroup;
		this.subGroup = subGroup;
	}
	

	public void draw() {//draw method not going to be used
	
	}
	
	
	//toString
	public String toString() {
		StringBuilder sb1 = new StringBuilder();//calls a new object string
		sb1.append("Project Name: " + this.getProjectName()+"\n");
		sb1.append("Address: " + this.getCompleteAddress()+"\n");
		sb1.append("Square Feet: " + this.getTotalSquareFeet()+"\n");
		sb1.append("OccupencyGroup: " + this.getOccupencyGroup()+"\n");
		sb1.append("Occupency Subgroup: " + this.getSubGroup()+"\n");
		
		return sb1.toString();
	}
	
	public String displayData() {
		return toString();
	 
		
	}// end of displayData

	
	//Getters/Setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupencyGroup() {
		return occupencyGroup;
	}

	public void setOccupencyGroup(String occupencyGroup) {
		this.occupencyGroup = occupencyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	
	
	
	
}
