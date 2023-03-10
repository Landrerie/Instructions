package Instructions;

public class Program {
	
		
		int[] registers;
		Instructions[] instructions;
		int pc = 0;
		
		Program(int[] registers, Instructions[] instructions){
			this.registers = registers;
			this.instructions = instructions;
		}
		
		void run() {
		
			while(pc < instructions.length) {
				
				Instructions i = instructions[pc];
				i.execute(this);
				
				}
		}
		
}
