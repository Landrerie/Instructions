package Instructions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTest {

	@Test
	void test() {
		Instructions[] instructions = new Instructions[] 
				{new LoadConstant(2, 1), new JumpIfZero(1, 5), new Multiply(2, 0), new Decrement(1), new Jump(1), new Halt()};
		int[] registers = new int[] {2, 4, 0};
		Program.execute(registers, instructions);
		assertArrayEquals(new int[] {2, 0, 16}, registers);
	}

}
