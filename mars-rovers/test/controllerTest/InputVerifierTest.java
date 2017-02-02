package controllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.InputVerifier;

public class InputVerifierTest {

	@Test
	public void emptyPlateauTest() {
		String verify = InputVerifier.verifyPlateauDimensions(null);
		assertEquals("Error message is not correct", "Plateau dimensions not specified", verify);
		verify = InputVerifier.verifyPlateauDimensions("");
		assertEquals("Error message is not correct", "Plateau dimensions not specified", verify);
	}

	@Test
	public void malformedPlateauTest() {
		String verify = InputVerifier.verifyPlateauDimensions("5");
		assertEquals("Error message is not correct", "Incorrect plateau dimensions instructions format", verify);
		verify = InputVerifier.verifyPlateauDimensions("555");
		assertEquals("Error message is not correct", "Incorrect plateau dimensions instructions format", verify);
	}

	@Test
	public void notNaturalNumberPlateauTest() {
		String verify = InputVerifier.verifyPlateauDimensions("A 7");
		assertEquals("Error message is not correct", "Plateau width is not a natural number", verify);
		verify = InputVerifier.verifyPlateauDimensions("0 7");
		assertEquals("Error message is not correct", "Plateau width is not a natural number", verify);
		verify = InputVerifier.verifyPlateauDimensions("7 A");
		assertEquals("Error message is not correct", "Plateau hight is not a natural number", verify);
		verify = InputVerifier.verifyPlateauDimensions("7 0");
		assertEquals("Error message is not correct", "Plateau hight is not a natural number", verify);
	}

	@Test
	public void PlateauTest() {
		String verify = InputVerifier.verifyPlateauDimensions("8 7");
		assertEquals("Error message is not correct", "Ok", verify);
	}

	@Test
	public void RoverTest() {
		String verify = InputVerifier.verifyRoverInitialPosition("4 5 N", 10, 10);
		assertEquals("Error message is not correct", "Ok", verify);
	}

	@Test
	public void invalidPlateauDimensionsTest() {
		String verify = InputVerifier.verifyRoverInitialPosition("4 5 N", -10, 10);
		assertEquals("Error message is not correct", "Plateau dimensions are not natural numbers", verify);
		verify = InputVerifier.verifyRoverInitialPosition("4 5 N", 10, 0);
		assertEquals("Error message is not correct", "Plateau dimensions are not natural numbers", verify);
	}

	@Test
	public void emptyRoverTest() {
		String verify = InputVerifier.verifyRoverInitialPosition(null, 10, 10);
		assertEquals("Error message is not correct", "Rover initial position not specified", verify);
		verify = InputVerifier.verifyRoverInitialPosition("", 10, 10);
		assertEquals("Error message is not correct", "Rover initial position not specified", verify);
	}

	@Test
	public void malformedRoverTest() {
		String verify = InputVerifier.verifyRoverInitialPosition("5 8 NN", 10, 10);
		assertEquals("Error message is not correct", "Incorrect inicial rover position instructions format", verify);
		verify = InputVerifier.verifyRoverInitialPosition("58 NN", 10, 10);
		assertEquals("Error message is not correct", "Incorrect inicial rover position instructions format", verify);
		verify = InputVerifier.verifyRoverInitialPosition("5 8NN", 10, 10);
		assertEquals("Error message is not correct", "Incorrect inicial rover position instructions format", verify);
	}

	@Test
	public void incorrectDirectionRoverTest() {
		String verify = InputVerifier.verifyRoverInitialPosition("5 8 D", 10, 10);
		assertEquals("Error message is not correct", "Invalid inicial rover direction", verify);
	}

	@Test
	public void notNumberPositionRoverTest() {
		String verify = InputVerifier.verifyRoverInitialPosition("A 8 N", 10, 10);
		assertEquals("Error message is not correct", "Rover x position is not a natural number", verify);
		verify = InputVerifier.verifyRoverInitialPosition("A 0 N", 10, 10);
		assertEquals("Error message is not correct", "Rover x position is not a natural number", verify);
		verify = InputVerifier.verifyRoverInitialPosition("8 A N", 10, 10);
		assertEquals("Error message is not correct", "Rover y position is not a natural number", verify);
		verify = InputVerifier.verifyRoverInitialPosition("8 0 N", 10, 10);
		assertEquals("Error message is not correct", "Rover y position is not a natural number", verify);
	}

	@Test
	public void roverMovementTest() {
		String verify = InputVerifier.verifyRoverMovementInstructions("LMLMLMLMM", 5, 5, 1, 2, 'N');
		assertEquals("Error message is not correct", "Ok", verify);
	}

	@Test
	public void invalidInicialRoverMovementPositionTest() {
		String verify = InputVerifier.verifyRoverMovementInstructions("LMLMLMLMM", 5, 5, -1, 2, 'N');
		assertEquals("Error message is not correct", "Invalid inicial rover position", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("LMLMLMLMM", 5, 5, 1, -2, 'N');
		assertEquals("Error message is not correct", "Invalid inicial rover position", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("LMLMLMLMM", 5, 5, 6, 2, 'N');
		assertEquals("Error message is not correct", "Invalid inicial rover position", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("LMLMLMLMM", 5, 5, 1, 6, 'N');
		assertEquals("Error message is not correct", "Invalid inicial rover position", verify);
	}

	@Test
	public void invalidRoverMovementInstructionTest() {
		String verify = InputVerifier.verifyRoverMovementInstructions("WRONG", 5, 5, 1, 2, 'N');
		assertEquals("Error message is not correct", "Malformed movement instruction", verify);
	}

	@Test
	public void outOfBorderRoverMovementInstructionTest() {
		String verify = InputVerifier.verifyRoverMovementInstructions("MMMMMMM", 5, 5, 1, 2, 'N');
		assertEquals("Error message is not correct", "Movement instructions will send Rover out of borders", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("MMMMMMM", 5, 5, 1, 2, 'S');
		assertEquals("Error message is not correct", "Movement instructions will send Rover out of borders", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("MMMMMMM", 5, 5, 1, 2, 'E');
		assertEquals("Error message is not correct", "Movement instructions will send Rover out of borders", verify);
		verify = InputVerifier.verifyRoverMovementInstructions("MMMMMMM", 5, 5, 1, 2, 'W');
		assertEquals("Error message is not correct", "Movement instructions will send Rover out of borders", verify);
	}

}
