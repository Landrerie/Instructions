package Instructions;

public class JumpIfZero extends Instructions{
	
	public int r;
	public int a;
	
	JumpIfZero(int inputregister, int instructie){
		this.r = inputregister;
		this.a = instructie;
	}
}
