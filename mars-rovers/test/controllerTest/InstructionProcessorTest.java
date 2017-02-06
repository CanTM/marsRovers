package controllerTest;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import controller.InstructionsProcessor;

public class InstructionProcessorTest {

	@Test
	public void executeInstructionsTest() throws IOException {
		String[] args = { "test\\resources\\input1.txt" };
		InstructionsProcessor.main(args);
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));
		assertEquals("First rover output is not right", "1 3 N", br.readLine());
		assertEquals("Second rover output is not right", "5 1 E", br.readLine());
		br.close();
		File fileToDelete = new File("output.txt");
		fileToDelete.delete();
	}

	@Test
	public void executeInvalidPlateauInstructionsTest() throws IOException {
		String[] args = { "test\\resources\\input2.txt" };
		InstructionsProcessor.main(args);
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));
		assertEquals("Error message is not right", true,
				br.readLine().contains("Incorrect plateau dimensions instructions format"));
		br.close();
		File fileToDelete = new File("output.txt");
		fileToDelete.delete();
	}

}
