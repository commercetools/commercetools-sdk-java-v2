
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
     *
     * @param statusCode value to be set
     * @return Builder
     */

    public ErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *
     * @param message value to be set
     * @return Builder
     */

    public ErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @param error value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error(@Nullable final String error) {
        this.error = error;
        return this;
    }

    /**
     *
     * @param error_description value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }

    /**
     *
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final com.commercetools.history.models.change_history.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *
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
     *
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
     *
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder withErrors(
            Function<com.commercetools.history.models.change_history.ErrorObjectBuilder, com.commercetools.history.models.change_history.ErrorObjectBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.history.models.change_history.ErrorObjectBuilder.of()).build());
        return this;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public String getError() {
        return this.error;
    }

    @Nullable
    public String getError_description() {
        return this.error_description;
    }

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

    public static ErrorResponseBuilder of() {
        return new ErrorResponseBuilder();
    }

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
