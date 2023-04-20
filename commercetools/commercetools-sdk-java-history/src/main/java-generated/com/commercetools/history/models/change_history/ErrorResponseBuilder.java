
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorResponseBuilder
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
public class ErrorResponseBuilder implements Builder<ErrorResponse> {

    private Integer statusCode;

    private String message;

    @Nullable
    private String error;

    @Nullable
    private String error_description;

    @Nullable
    private java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors;

    /**
     * set the value to the statusCode
     * @param statusCode value to be set
     * @return Builder
     */

    public ErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public ErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     * set the value to the error
     * @param error value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error(@Nullable final String error) {
        this.error = error;
        return this;
    }

    /**
     * set the value to the error_description
     * @param error_description value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }

    /**
     * set values to the errors
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final com.commercetools.history.models.change_history.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     * set value to the errors
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * add values to the errors
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(
            @Nullable final com.commercetools.history.models.change_history.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     * add the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(
            Function<com.commercetools.history.models.change_history.ErrorObjectBuilder, com.commercetools.history.models.change_history.ErrorObjectBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.history.models.change_history.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder withErrors(
            Function<com.commercetools.history.models.change_history.ErrorObjectBuilder, com.commercetools.history.models.change_history.ErrorObjectBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.history.models.change_history.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder addErrors(
            Function<com.commercetools.history.models.change_history.ErrorObjectBuilder, com.commercetools.history.models.change_history.ErrorObject> builder) {
        return plusErrors(builder.apply(com.commercetools.history.models.change_history.ErrorObjectBuilder.of()));
    }

    /**
     * set the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder setErrors(
            Function<com.commercetools.history.models.change_history.ErrorObjectBuilder, com.commercetools.history.models.change_history.ErrorObject> builder) {
        return errors(builder.apply(com.commercetools.history.models.change_history.ErrorObjectBuilder.of()));
    }

    /**
     * value of statusCode}
     * @return statusCode
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * value of message}
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * value of error}
     * @return error
     */

    @Nullable
    public String getError() {
        return this.error;
    }

    /**
     * value of error_description}
     * @return error_description
     */

    @Nullable
    public String getError_description() {
        return this.error_description;
    }

    /**
     * value of errors}
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.history.models.change_history.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds ErrorResponse with checking for non-null required values
     * @return ErrorResponse
     */
    public ErrorResponse build() {
        Objects.requireNonNull(statusCode, ErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, ErrorResponse.class + ": message is missing");
        return new ErrorResponseImpl(statusCode, message, error, error_description, errors);
    }

    /**
     * builds ErrorResponse without checking for non-null required values
     * @return ErrorResponse
     */
    public ErrorResponse buildUnchecked() {
        return new ErrorResponseImpl(statusCode, message, error, error_description, errors);
    }

    /**
     * factory method for an instance of ErrorResponseBuilder
     * @return builder
     */
    public static ErrorResponseBuilder of() {
        return new ErrorResponseBuilder();
    }

    /**
     * create builder for ErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorResponseBuilder of(final ErrorResponse template) {
        ErrorResponseBuilder builder = new ErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.error = template.getError();
        builder.error_description = template.getErrorDescription();
        builder.errors = template.getErrors();
        return builder;
    }

}
