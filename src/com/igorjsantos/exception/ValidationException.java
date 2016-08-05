package com.igorjsantos.exception;

/**
 * @author igorjsantos
 *
 */
public class ValidationException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		super(message);
	}
}