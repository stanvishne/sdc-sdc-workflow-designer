package org.onap.sdc.workflow.services.exceptions;

public class InvalidPaginationParameterException extends RuntimeException {

    public InvalidPaginationParameterException(String parameterName, String parameterValue, String message) {
        super(String.format("Requested %s: %s %s", parameterName, parameterValue, message));
    }
}