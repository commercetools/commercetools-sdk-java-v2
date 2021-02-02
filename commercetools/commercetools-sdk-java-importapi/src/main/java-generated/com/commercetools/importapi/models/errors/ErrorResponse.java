
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The response in case of an error.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ErrorResponseImpl.class)
public interface ErrorResponse {

    /**
    *  <p>The http status code of the response.</p>
    */
    @NotNull
    @JsonProperty("statusCode")
    public Integer getStatusCode();

    /**
    *  <p>Describes the error.</p>
    */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
    *  <p>This property is only used for OAuth2 errors.
    *  Contains the error code.</p>
    */

    @JsonProperty("error")
    public String getError();

    /**
    *  <p>This property is only used for OAuth2 errors.
    *  Additional information to assist the client developer in
    *  understanding the error.</p>
    */

    @JsonProperty("error_description")
    public String getErrorDescription();

    /**
    *  <p>The errors that caused this error response.</p>
    */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    public void setStatusCode(final Integer statusCode);

    public void setMessage(final String message);

    public void setError(final String error);

    public void setErrorDescription(final String errorDescription);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    public static ErrorResponse of() {
        return new ErrorResponseImpl();
    }

    public static ErrorResponse of(final ErrorResponse template) {
        ErrorResponseImpl instance = new ErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static ErrorResponseBuilder builder() {
        return ErrorResponseBuilder.of();
    }

    public static ErrorResponseBuilder builder(final ErrorResponse template) {
        return ErrorResponseBuilder.of(template);
    }

    default <T> T withErrorResponse(Function<ErrorResponse, T> helper) {
        return helper.apply(this);
    }
}
