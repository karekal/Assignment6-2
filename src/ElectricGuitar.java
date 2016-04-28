
public class ElectricGuitar extends StringInstruments{
	public ElectricGuitar(){
		super();
		this.name="guitar";
		this.numberOfStrings=6;
	}
	public ElectricGuitar(int numberOfStrings){
		super();
		this.name="guitar";
		this.numberOfStrings=numberOfStrings;
	}
	public void play(){
		System.out.println("guitar with"+numberOfStrings+"is rocking");
	}

}
