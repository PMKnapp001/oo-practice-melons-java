public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

		MelonType muskMelonType = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType casabaType = new MelonType("cas", "Casaba", 2003, "orange", false, false);
		MelonType crenshawMelonType = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yellowWatermelonType = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);

		MelonType[] melonTypeArray = {muskMelonType, casabaType, crenshawMelonType, yellowWatermelonType};

		// System.out.println("Melon Types: ");
		// for (MelonType item : melonTypeArray) {
		// 	System.out.println(item.code);
		// }
		// System.out.println("****************************************************");

		Melon melon1 = new Melon(yellowWatermelonType, 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(yellowWatermelonType, 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(casabaType, 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(crenshawMelonType, 8, 9, 35, "Michael");
		Melon melon5 = new Melon(crenshawMelonType, 8, 2, 35, "Michael");
		Melon melon6 = new Melon(muskMelonType, 6, 7, 4, "Michael");
		Melon melon7 = new Melon(yellowWatermelonType, 7, 10, 3, "Sheila");

		Melon[] melonArray = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		// System.out.println("Melons: ");
		// for (Melon item : melonArray) {
		// 	System.out.println(item.melonType.name);
		// }

		System.out.println(melon1.isSellable());
		System.out.println(melon2.isSellable());

		getSellabilityReport(melonArray);

		
	}

	public static void getSellabilityReport(Melon[] melonArray){
		for (Melon melon:melonArray){

			String sellStatus;
			if (melon.isSellable()){
				sellStatus = " (CAN BE SOLD)";
			}
			else {
				sellStatus = " (NOT SELLABLE)";
			}

			System.out.println("Harvested by " + melon.harvester + " from Field " + melon.field + sellStatus);
		}
	}

	//Harvested by Sheila from Field 2 (CAN BE SOLD)
	
}
