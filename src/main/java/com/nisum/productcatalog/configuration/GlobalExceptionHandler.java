package com.nisum.productcatalog.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nisum.productcatalog.exception.CustomeException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value= {CustomeException.class})
	public ResponseEntity handleCustomException(Exception ex, WebRequest req) {
		logger.error("some error");
		
		return handleExceptionInternal(ex, "some thiong wrong", null, HttpStatus.BAD_REQUEST, req);
		
	}

}
