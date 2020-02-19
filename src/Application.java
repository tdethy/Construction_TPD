
public class Application {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------");
		System.out.println("Building");
		System.out.println("--------------------------------------");
		

		Building build = new Building("White House","1600 Pennsylvania Ave NW, Washington, DC 20500",55000,"Residential","R1");
		System.out.println("\n" + build.displayData() + "\n");
		build.draw();
		System.out.println();
		
		build.setProjectName("The Building");
		System.out.println(build.getProjectName());
	
		build.setCompleteAddress("1600 Pennsylvania Ave NW, Washington, DC 20500");
		System.out.println(build.getCompleteAddress());
		build.setTotalSquareFeet(55000);
		
		System.out.println(build.getTotalSquareFeet());
		build.setOccupencyGroup("Residential");
		System.out.println(build.getOccupencyGroup());
		build.setSubGroup("R1");
		
		System.out.println(build.getSubGroup());
		System.out.println();
		System.out.println(build.toString());
		
		
		System.out.println("--------------------------------------");
		System.out.println("Business");
		System.out.println("--------------------------------------");
		
		
		Business B = new Business("Royalty PowerWash", "11523 Valley Forge", 800, "Business", "Group B", 1);
		B.setNumRentableUnits(1);
		System.out.println("\n\n" + B.getNumRentableUnits());
		System.out.println(B.toString() + "\n\n");
		
		System.out.println("--------------------------------------");
		System.out.println("Residential");
		System.out.println("--------------------------------------");
		
		
		Residential R = new Residential("Nelk House", "420 Nelk Dr", 6969.69, "Residential", "Groups R-1 to R-4", 3, 6, true);
		R.setNumBathrooms(3);
		R.setNumBedrooms(6);
		R.setLaundryRoom(true);
		System.out.println("\n\n" + R.getNumBedrooms() + " " + R.getNumBathrooms() + " " + R.isLaundryRoom());
		System.out.println(R.toString() + "\n\n");
		
		System.out.println("--------------------------------------");
		System.out.println("Mall");
		System.out.println("--------------------------------------");
		Mall M = new Mall();
		System.out.println(M.displayData());
		
		Mall m = new Mall("GreenTree Mall", "757 E Lewis and Clark Pkwy, Clarksville, IN 47129", 795382, "Business", "Group B",
				81, 78, 9000, 2500);
		System.out.println("\n" + m.displayData() + "\n");
		m.draw();
		m.setNumRentedUnits(78);
		m.setMedianUnitSize(9000);
		m.setNumParkingSpaces(2500);
		System.out.println("\n" + m.getNumRentedUnits() + " " + m.getMedianUnitSize() + " " + m.getNumParkingSpaces());
		System.out.println(m.toString());
		
		System.out.println("--------------------------------------");
		System.out.println("Apartment");
		System.out.println("--------------------------------------");
		
		Apartment A = new Apartment("Devils Inn Apartment Complex", "666 Hell Way, Todos Cantos, California 757575 ", 200000, "Residential", "R-3", 3, 1, true, 40, 800, true);
		System.out.println("\n" + A.displayData() + "\n");
		A.draw();
		
		A.setNumRentableUnits(40);
		A.setAvgUnitSize(800);
		A.setParkingAvailable(true);
		
		System.out.println("\n" + A.getNumRentableUnits() + " " + A.getAvgUnitSize() + " " + A.isParkingAvailable());
		System.out.println(A.displayData());
		
		System.out.println("--------------------------------------");
		System.out.println("SingleFamilyHome");
		System.out.println("--------------------------------------");
		
		SingleFamilyHome D = new SingleFamilyHome();
		System.out.println(D.displayData());
		
		SingleFamilyHome single = new SingleFamilyHome("Trenton's House", "11523 Valley Frg Sellersburg, Indiana 47172", 2000, "Residential", "R-3", 5, 3, true, true);
		System.out.println("\n" + single.displayData() + "\n");
		single.draw();
		single.setGarage(false);
		System.out.println(single.isGarage());
		
		System.out.println(single.toString());
		System.out.println("--------------------------------------");

	}

}//end class
