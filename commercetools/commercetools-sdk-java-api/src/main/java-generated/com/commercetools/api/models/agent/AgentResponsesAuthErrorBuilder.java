
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesAuthErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesAuthError agentResponsesAuthError = AgentResponsesAuthError.builder()
 *             .statusCode(1)
 *             .message("{message}")
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .error("{error}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesAuthErrorBuilder implements Builder<AgentResponsesAuthError> {

    private Integer statusCode;

    private String message;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    private String error;

    @Nullable
    private String error_description;

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @param statusCode value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder errors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder plusErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Error code as per the <span>OAuth 2.0 specification</span>. For example: <code>"access_denied"</code>.</p>
     * @param error value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder error(final String error) {
        this.error = error;
        return this;
    }

    /**
     *  <p>Plain text description of the first error.</p>
     * @param error_description value to be set
     * @return Builder
     */

    public AgentResponsesAuthErrorBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @return statusCode
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @return errors
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     *  <p>Error code as per the <span>OAuth 2.0 specification</span>. For example: <code>"access_denied"</code>.</p>
     * @return error
     */

    public String getError() {
        return this.error;
    }

    /**
     *  <p>Plain text description of the first error.</p>
     * @return error_description
     */

    @Nullable
    public String getError_description() {
        return this.error_description;
    }

    /**
     * builds AgentResponsesAuthError with checking for non-null required values
     * @return AgentResponsesAuthError
     */
    public AgentResponsesAuthError build() {
        Objects.requireNonNull(statusCode, AgentResponsesAuthError.class + ": statusCode is missing");
        Objects.requireNonNull(message, AgentResponsesAuthError.class + ": message is missing");
        Objects.requireNonNull(errors, AgentResponsesAuthError.class + ": errors is missing");
        Objects.requireNonNull(error, AgentResponsesAuthError.class + ": error is missing");
        return new AgentResponsesAuthErrorImpl(statusCode, message, errors, error, error_description);
    }

    /**
     * builds AgentResponsesAuthError without checking for non-null required values
     * @return AgentResponsesAuthError
     */
    public AgentResponsesAuthError buildUnchecked() {
        return new AgentResponsesAuthErrorImpl(statusCode, message, errors, error, error_description);
    }

    /**
     * factory method for an instance of AgentResponsesAuthErrorBuilder
     * @return builder
     */
    public static AgentResponsesAuthErrorBuilder of() {
        return new AgentResponsesAuthErrorBuilder();
    }

    /**
     * create builder for AgentResponsesAuthError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesAuthErrorBuilder of(final AgentResponsesAuthError template) {
        AgentResponsesAuthErrorBuilder builder = new AgentResponsesAuthErrorBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.errors = template.getErrors();
        builder.error = template.getError();
        builder.error_description = template.getErrorDescription();
        return builder;
    }

}
