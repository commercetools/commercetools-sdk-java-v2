
package com.commercetools.api.client.error;

import com.commercetools.api.models.error.ErrorResponse;

/**
 * Exception which holds the response payload as {@link ErrorResponse}
 */
public interface ErrorResponseException {
    public ErrorResponse getErrorResponse();

    default boolean hasErrorCode(final String errorCode) {
        return getErrorResponse().getErrors().stream().anyMatch(error -> error.getCode().equals(errorCode));
    }
}
