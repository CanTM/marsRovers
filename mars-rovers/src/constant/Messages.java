package constant;

public class Messages {
	public static final String VERIFICATION_OK = "Ok";

	public static final String ERROR_DEFAULT_MESSAGE = "Malformed instruction";

	public static final String ERROR_PLATEAU_NOT_SPECIFIED = "Plateau dimensions not specified";
	public static final String ERROR_PLATEAU_INSTRUCTION = "Incorrect plateau dimensions instructions format";
	public static final String ERROR_PLATEAU_WIDTH = "Plateau width is not a natural number";
	public static final String ERROR_PLATEAU_HEIGHT = "Plateau hight is not a natural number";
	public static final String ERROR_PLATEAU_DIMENSIONS = "Plateau dimensions are not natural numbers";

	public static final String ERROR_ROVER_NOT_SPECIFIED = "Rover initial position not specified";
	public static final String ERROR_ROVER_POSITION = "Incorrect inicial rover position instructions format";
	public static final String ERROR_ROVER_INVALID_POSITION = "Invalid inicial rover position";
	public static final String ERROR_ROVER_DIRECTION = "Invalid inicial rover direction";
	public static final String ERROR_ROVER_X = "Rover x position is not a natural number";
	public static final String ERROR_ROVER_Y = "Rover y position is not a natural number";

	public static final String ERROR_MOVEMENT_INSTRUCTION = "Malformed movement instruction";
	public static final String ERROR_MOVEMENT_OUT_OF_BORDER = "Movement instructions will send Rover out of borders";
}
