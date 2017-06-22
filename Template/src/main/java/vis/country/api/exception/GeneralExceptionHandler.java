package vis.country.api.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@EnableWebMvc
public class GeneralExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
//	@ResponseBody
//	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
//		String bodyOfResponse = "This should be application specific";
//		BusinessException exception = new BusinessException();
//		exception.setMessage(bodyOfResponse);
//		return handleExceptionInternal(ex, exception, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
//	}

	// @ExceptionHandler(ConcurrencyFailureException.class)
	// @ResponseStatus(HttpStatus.CONFLICT)
	// @ResponseBody
	// public ErrorVM processConcurencyError(ConcurrencyFailureException ex) {
	// return new ErrorVM(ErrorConstants.ERR_CONCURRENCY_FAILURE);
	// }
	//
	// @ExceptionHandler(MethodArgumentNotValidException.class)
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ResponseBody
	// public ErrorVM processValidationError(MethodArgumentNotValidException ex)
	// {
	// BindingResult result = ex.getBindingResult();
	// List<FieldError> fieldErrors = result.getFieldErrors();
	// return processFieldErrors(fieldErrors);
	// }
	//
	// @ExceptionHandler(CustomParameterizedException.class)
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ResponseBody
	// public ParameterizedErrorVM
	// processParameterizedValidationError(CustomParameterizedException ex) {
	// return ex.getErrorVM();
	// }

	// @ExceptionHandler(AccessDeniedException.class)
	// @ResponseStatus(HttpStatus.FORBIDDEN)
	// @ResponseBody
	// public ErrorVM processAccessDeniedException(AccessDeniedException e) {
	// return new ErrorVM(ErrorConstants.ERR_ACCESS_DENIED, e.getMessage());
	// }

//	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//	@ResponseBody
//	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
//	public BusinessException processMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
//		return new BusinessException(exception.getMessage());
//
//	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<ErrorResponse> processRuntimeException(Exception ex) {
		BodyBuilder builder;
		ErrorResponse errorResponse;
		ResponseStatus responseStatus = AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class);
		if (responseStatus != null) {
			builder = ResponseEntity.status(responseStatus.value());
			errorResponse = new ErrorResponse(responseStatus.value().value(), responseStatus.reason());
		} else {
			builder = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
			errorResponse = new ErrorResponse(500, "Internal server error");
		}
		return builder.body(errorResponse);
	}

}