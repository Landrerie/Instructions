package Instructions;

public class Halt extends Instructions{
	
	Halt(){}
	
	public void execute(Program p) {
		p.pc = p.instructions.length;
	}
	
}
