package io.github.alexandre.clientes.rest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.github.alexandre.clientes.rest.exception.ApiErrors;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class InterceptarExceptions {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors validadorDeExceptionsErrors(MethodArgumentNotValidException ex) {
		BindingResult resultadosBinds = ex.getBindingResult();
		List<String> messages = resultadosBinds.getAllErrors()
			.stream()
			.map( objetoDeErros -> objetoDeErros.getDefaultMessage())
			.collect( Collectors.toList() );
		return new ApiErrors(messages);
	}
}
