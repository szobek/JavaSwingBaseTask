package frame;

public class Tanulo {
	private String name;
	private byte irodalom;
	private byte matek;
	public Tanulo(String name, byte irodalom, byte matek) {
		super();
		this.name = name;
		this.irodalom = irodalom;
		this.matek = matek;
	}
	public String getName() {
		return name;
	}
	public byte getIrodalom() {
		return irodalom;
	}
	public byte getMatek() {
		return matek;
	}
	@Override
	public String toString() {
		return name + ", irodalom: " + irodalom + ", matek: " + matek;
	}

}
