package Instructions;

public class JumpIfZero extends Instructions{
	
	public int r;
	public int a;
	
	JumpIfZero(int inputregister, int instructie){
		this.r = inputregister;
		this.a = instructie;
	}
	
	public void execute(Program p) {
		if(p.registers[r] == 0) {
			p.pc = a;
		}
		else {
			p.pc++;
		}
	}
}
