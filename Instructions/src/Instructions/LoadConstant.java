package Instructions;

public class LoadConstant extends Instructions{
	
	public int r;
	public int c;
	
	LoadConstant(int inputregister, int inputconstant){
		this.r = inputregister;
		this.c = inputconstant;
	}
	
}
