
package com.commercetools.importapi.models.errors;

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
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    /**
     *  <p>The http status code of the response.</p>
     * @param statusCode value to be set
     * @return Builder
     */

    public ErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *  <p>Describes the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>This property is only used for OAuth2 errors. Contains the error code.</p>
     * @param error value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error(@Nullable final String error) {
        this.error = error;
        return this;
    }

    /**
     *  <p>This property is only used for OAuth2 errors. Additional information to assist the client developer in understanding the error.</p>
     * @param error_description value to be set
     * @return Builder
     */

    public ErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder withErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The http status code of the response.</p>
     * @return statusCode
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *  <p>Describes the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>This property is only used for OAuth2 errors. Contains the error code.</p>
     * @return error
     */

    @Nullable
    public String getError() {
        return this.error;
    }

    /**
     *  <p>This property is only used for OAuth2 errors. Additional information to assist the client developer in understanding the error.</p>
     * @return error_description
     */

    @Nullable
    public String getError_description() {
        return this.error_description;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
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
