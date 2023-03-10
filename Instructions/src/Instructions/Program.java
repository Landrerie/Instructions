package Instructions;

public class Program {
	public static void execute(int[] registers, Instructions[] instructions) {
		
		int pc = 0;
		
		while(pc < instructions.length) {
			
			System.out.println(pc);
			
			if(instructions[pc] instanceof LoadConstant loadconstant) {
				registers[loadconstant.r] = loadconstant.c;
				pc++;
			}
			
			if(instructions[pc] instanceof Decrement decrement) {
				registers[decrement.r]--;
				pc++;
			}
			
			if(instructions[pc] instanceof Multiply multiply) {
				registers[multiply.r1] = registers[multiply.r1] * registers[multiply.r2];
				pc++;
			}
			
			if(instructions[pc] instanceof JumpIfZero jumpifzero) {
				if(registers[jumpifzero.r] == 0) {
					pc = jumpifzero.a;
				}
				else {
					pc++;
				}
			}
			
			if(instructions[pc] instanceof Jump jump) {
				pc = jump.a;
			}
			
			if(instructions[pc] instanceof Halt halt) {
				pc = instructions.length;
			}
			
		}
	}
}
