package com.nyash.travellizer.travellizercommon.infra.exception.flow;


import com.nyash.travellizer.travellizercommon.infra.exception.base.AppException;

/**
 * {@link ValidationException} is raised when attribute values of the object
 * model violates business rules or restrictions
 *
 * @author Nyash
 *
 */
public class ValidationException extends AppException {
    private static final long serialVersionUID = 6858621613562789296L;

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
