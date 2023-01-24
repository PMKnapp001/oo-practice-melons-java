public class Melon {

	public static void main(String[] args) {
		System.out.println("melon defined");
	}

    MelonType melonType;
    int shapeRating;
    int colorRating;
    int field;
    String harvester;

	public Melon (MelonType melonType,
		   int shapeRating,
		   int colorRating,
		   int field,
		   String harvester) {
		this.melonType = melonType;
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;
		this.harvester = harvester;
	}

	// All melons can be categorized as sellable or not sellable. 
	// A melon is able to be sold if both its shape and color ratings are greater than 5, 
	// and it didn’t come from field 3

	public boolean isSellable() {
		if (this.colorRating > 5 && this.shapeRating > 5  && this.field != 3) {
			return true;
		}
		else {
			return false;
		}
	}
}

