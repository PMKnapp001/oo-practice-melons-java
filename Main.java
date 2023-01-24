public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

		MelonType muskMelonType = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType casabaType = new MelonType("cas", "Casaba", 2003, "orange", false, false);
		MelonType crenshawMelonType = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yellowWatermelonType = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);

		MelonType[] melonTypeArray = {muskMelonType, casabaType, crenshawMelonType, yellowWatermelonType};

		// for (MelonType item : melonTypeArray) {
		// 	System.out.println(item.code);
		// }

		
	}
	
}
