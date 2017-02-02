package controllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.PositionController;
import domain.Plateau;
import domain.Rover;

public class PositionControllerTest {

	@Test
	public void createPositionControllerTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		Plateau plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 4, rover.getY());
		assertEquals("Rover direction is not right", 'N', rover.getDirection());
	}

	@Test
	public void setPlateauTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		Plateau plateau = new Plateau(8, 7);
		ps.setPlateau(plateau);
		plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 8, plateau.getWidth());
		assertEquals("Plateau height is not right", 7, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 4, rover.getY());
		assertEquals("Rover direction is not right", 'N', rover.getDirection());
	}

	@Test
	public void setRoverTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		Plateau plateau = ps.getPlateau();
		Rover rover = new Rover(8, 9, 'S');
		ps.setRover(rover);
		rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 8, rover.getX());
		assertEquals("Rover y position is not right", 9, rover.getY());
		assertEquals("Rover direction is not right", 'S', rover.getDirection());
	}

	@Test
	public void moveRoverTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		ps.sendInstruction('M');
		Plateau plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 5, rover.getY());
		assertEquals("Rover direction is not right", 'N', rover.getDirection());
	}

	@Test
	public void rotateLeftRoverTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		ps.sendInstruction('L');
		Plateau plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 4, rover.getY());
		assertEquals("Rover direction is not right", 'W', rover.getDirection());
	}

	@Test
	public void rotateRighttRoverTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		ps.sendInstruction('R');
		Plateau plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 4, rover.getY());
		assertEquals("Rover direction is not right", 'E', rover.getDirection());
	}

	@Test
	public void invalidInstructionTest() {
		PositionController ps = new PositionController(10, 9, 3, 4, 'N');
		ps.sendInstruction('D');
		Plateau plateau = ps.getPlateau();
		Rover rover = ps.getRover();
		assertEquals("Plateau width is not right", 10, plateau.getWidth());
		assertEquals("Plateau height is not right", 9, plateau.getHeight());
		assertEquals("Rover x position is not right", 3, rover.getX());
		assertEquals("Rover y position is not right", 4, rover.getY());
		assertEquals("Rover direction is not right", 'N', rover.getDirection());
	}

}
