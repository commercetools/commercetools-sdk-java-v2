
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesErrorResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesErrorResponse agentResponsesErrorResponse = AgentResponsesErrorResponse.builder()
 *             .statusCode(1)
 *             .message("{message}")
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesErrorResponseBuilder implements Builder<AgentResponsesErrorResponse> {

    private Integer statusCode;

    private String message;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    @Nullable
    private String threadId;

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @param statusCode value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder errors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder plusErrors(
            final com.commercetools.api.models.error.ErrorObject... errors) {
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

    public AgentResponsesErrorResponseBuilder plusErrors(
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

    public AgentResponsesErrorResponseBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifier of the workflow run that raised the error. Present on errors raised once the workflow has started. Absent on errors raised while parsing the request, before the workflow starts.</p>
     * @param threadId value to be set
     * @return Builder
     */

    public AgentResponsesErrorResponseBuilder threadId(@Nullable final String threadId) {
        this.threadId = threadId;
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
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @return errors
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     *  <p>Identifier of the workflow run that raised the error. Present on errors raised once the workflow has started. Absent on errors raised while parsing the request, before the workflow starts.</p>
     * @return threadId
     */

    @Nullable
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * builds AgentResponsesErrorResponse with checking for non-null required values
     * @return AgentResponsesErrorResponse
     */
    public AgentResponsesErrorResponse build() {
        Objects.requireNonNull(statusCode, AgentResponsesErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, AgentResponsesErrorResponse.class + ": message is missing");
        Objects.requireNonNull(errors, AgentResponsesErrorResponse.class + ": errors is missing");
        return new AgentResponsesErrorResponseImpl(statusCode, message, errors, threadId);
    }

    /**
     * builds AgentResponsesErrorResponse without checking for non-null required values
     * @return AgentResponsesErrorResponse
     */
    public AgentResponsesErrorResponse buildUnchecked() {
        return new AgentResponsesErrorResponseImpl(statusCode, message, errors, threadId);
    }

    /**
     * factory method for an instance of AgentResponsesErrorResponseBuilder
     * @return builder
     */
    public static AgentResponsesErrorResponseBuilder of() {
        return new AgentResponsesErrorResponseBuilder();
    }

    /**
     * create builder for AgentResponsesErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesErrorResponseBuilder of(final AgentResponsesErrorResponse template) {
        AgentResponsesErrorResponseBuilder builder = new AgentResponsesErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.errors = template.getErrors();
        builder.threadId = template.getThreadId();
        return builder;
    }

}
