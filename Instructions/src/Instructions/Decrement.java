package Instructions;

public class Decrement extends Instructions {
	
	public int r;
	
	Decrement(int inputregister) {
		this.r = inputregister;
	}
	
	public void execute(Program p) {
		p.registers[r]--;
		p.pc++;
	}
}


