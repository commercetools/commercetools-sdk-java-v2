
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorResponse errorResponse = ErrorResponse.builder()
 *             .statusCode(1)
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ErrorResponseImpl.class)
public interface ErrorResponse {

    /**
     *
     * @return statusCode
     */
    @NotNull
    @JsonProperty("statusCode")
    public Integer getStatusCode();

    /**
     *
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *
     * @return error
     */

    @JsonProperty("error")
    public String getError();

    /**
     *
     * @return error_description
     */

    @JsonProperty("error_description")
    public String getErrorDescription();

    /**
     *
     * @return errors
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

    public static com.fasterxml.jackson.core.type.TypeReference<ErrorResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorResponse>";
            }
        };
    }
}
