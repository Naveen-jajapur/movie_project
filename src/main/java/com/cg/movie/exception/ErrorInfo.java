package com.cg.movie.exception;
import java.time.LocalDateTime;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description      It is an Error Info class and the structure of 
 *          					error message is defined here.
 *                                       
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/
public class ErrorInfo {
	private LocalDateTime timestamp;
	private String errorMessage;
	private String details;
	
	public ErrorInfo(LocalDateTime timestamp, String errorMessage, String details) {
		super();
		this.timestamp = timestamp;
		this.errorMessage = errorMessage;
		this.details = details;
	}
	public ErrorInfo() {
		super();
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
