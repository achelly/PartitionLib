package fr.adneom.exception;

/**
 * 
 * @author achelly
 *
 */
public class InvalidTaille extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Thrown to indicate that a method has been passed an illegal or inappropriate
	 * argument.
	 * 
	 * @param message error message
	 */
	public InvalidTaille(String message) {
		super(message);
	}
}
