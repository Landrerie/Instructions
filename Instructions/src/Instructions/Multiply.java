package Instructions;

public class Multiply extends Instructions{
	
	public int r1;
	public int r2;
	
	Multiply(int inputregister1, int inputregister2) {
		this.r1 = inputregister1;
		this.r2 = inputregister2;
	}
	
	public void execute(Program p) {
		p.registers[r1] = p.registers[r1] * p.registers[r2];
		p.pc++; 
	}
}
