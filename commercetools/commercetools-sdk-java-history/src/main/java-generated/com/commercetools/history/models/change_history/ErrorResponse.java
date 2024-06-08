
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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

    /**
     * set statusCode
     * @param statusCode value to be set
     */

    public void setStatusCode(final Integer statusCode);

    /**
     * set message
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * set error
     * @param error value to be set
     */

    public void setError(final String error);

    /**
     * set error_description
     * @param errorDescription value to be set
     */

    public void setErrorDescription(final String errorDescription);

    /**
     * set errors
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     * set errors
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of ErrorResponse
     */
    public static ErrorResponse of() {
        return new ErrorResponseImpl();
    }

    /**
     * factory method to create a shallow copy ErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ErrorResponse of(final ErrorResponse template) {
        ErrorResponseImpl instance = new ErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        instance.setErrors(template.getErrors());
        return instance;
    }

    /**
     * factory method to create a deep copy of ErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ErrorResponse deepCopy(@Nullable final ErrorResponse template) {
        if (template == null) {
            return null;
        }
        ErrorResponseImpl instance = new ErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_history.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ErrorResponse
     * @return builder
     */
    public static ErrorResponseBuilder builder() {
        return ErrorResponseBuilder.of();
    }

    /**
     * create builder for ErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorResponseBuilder builder(final ErrorResponse template) {
        return ErrorResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorResponse(Function<ErrorResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorResponse>";
            }
        };
    }
}
