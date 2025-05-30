public class Lemon extends Fruit {

	public String getColor() {
		return "yellow";
	}

	public String getColor(boolean ripe) {
		if (ripe) {
			return getColor();
		}

		return "brown";
	}

	public boolean isSweet() {
		return false;
	}

}