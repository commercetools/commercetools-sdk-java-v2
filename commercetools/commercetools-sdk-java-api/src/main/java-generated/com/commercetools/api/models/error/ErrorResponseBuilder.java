
package com.commercetools.api.models.error;

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
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @param statusCode value to be set
     * @return Builder
     */

    public ErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @param message value to be set
     * @return Builder
     */

    public ErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(@Nullable final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(@Nullable final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ErrorResponseBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds ErrorResponse with checking for non-null required values
     * @return ErrorResponse
     */
    public ErrorResponse build() {
        Objects.requireNonNull(statusCode, ErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, ErrorResponse.class + ": message is missing");
        return new ErrorResponseImpl(statusCode, message, errors);
    }

    /**
     * builds ErrorResponse without checking for non-null required values
     * @return ErrorResponse
     */
    public ErrorResponse buildUnchecked() {
        return new ErrorResponseImpl(statusCode, message, errors);
    }

    public static ErrorResponseBuilder of() {
        return new ErrorResponseBuilder();
    }

    public static ErrorResponseBuilder of(final ErrorResponse template) {
        ErrorResponseBuilder builder = new ErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.errors = template.getErrors();
        return builder;
    }

}
