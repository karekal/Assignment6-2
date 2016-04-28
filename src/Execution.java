
public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricbassGuitar ebg=new ElectricbassGuitar();
		ElectricGuitar eg=new ElectricGuitar();
		
		ebg.play();
		eg.play();
		ebg=new ElectricbassGuitar(8);
		eg=new ElectricGuitar(2);
		ebg.play();
		eg.play();

	}

}
