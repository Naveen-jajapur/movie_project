package com.cg.movie.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description       @ControllerAdvice : It is used to enable a single ExceptionHandler to be applied
 *          					 to multiple controllers.
 *          			      @ExceptionHandler : It uses Exception as argument and then all the exceptions thrown 
 *          					 by our request handler method will have handled by it.
 *                                       
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TheatreException.class)
	public @ResponseBody ResponseEntity<ErrorInfo>  handleException(TheatreException ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo>  re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);
		 return re;
	}
	
	
}
