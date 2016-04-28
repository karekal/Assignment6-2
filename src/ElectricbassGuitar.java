
public class ElectricbassGuitar extends StringInstruments {
    public ElectricbassGuitar(){
    	super();
    	this.name="electricbassguitar";
    	this.numberOfStrings=4;
    }
   public ElectricbassGuitar(int numberOfStrings){
	   super();
	   this.name="electricbassguitar";
	   this.numberOfStrings=numberOfStrings;
   }
   public void play(){
	   System.out.println("guitar" + numberOfStrings +"-strings"+name+"is rocking");
   }
}
