package Instructions;

public class Jump extends Instructions{
	
	public int a;
	
	Jump(int instructie) {
		this.a = instructie;
	}
	
	public void execute(Program p) {
		p.pc = a;
	}
}
