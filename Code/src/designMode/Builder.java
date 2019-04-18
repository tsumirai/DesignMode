package designMode;

//产品类
class Computer {
	private String band;
	private String screen;
	private String host;

	public void getBand() {
		System.out.println(band);
	}

	public void setBand(String band) {
		this.band = band;
	}

	public void getScreen() {
		System.out.println(screen);
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void getHost() {
		System.out.println(host);
	}

	public void setHost(String host) {
		this.host = host;
	}
}

//建造类
public abstract class Builder {
	abstract void buildBand();

	abstract void buildScreen();

	abstract void buildHost();

	abstract Computer buildComputer();
}

//具体建造类
class DellComputer extends Builder {
	private Computer computer = new Computer();

	@Override
	void buildBand() {
		computer.setBand("Dell Band");
	}

	@Override
	void buildScreen() {
		computer.setScreen("Dell Screen");
	}

	@Override
	void buildHost() {
		computer.setHost("Dell Host");
	}

	@Override
	Computer buildComputer() {
		return computer;
	}
}

class AcerComputer extends Builder {
	Computer computer = new Computer();

	@Override
	void buildBand() {
		computer.setBand("Acer Band");
	}

	@Override
	void buildScreen() {
		computer.setScreen("Acer Screen");
	}

	@Override
	void buildHost() {
		computer.setHost("Acer Host");
	}

	@Override
	Computer buildComputer() {
		return computer;
	}
}

//指挥者
class Director {
	private Builder builder = null;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Computer construct() {
		builder.buildBand();
		builder.buildScreen();
		builder.buildHost();
		return builder.buildComputer();
	}
}
