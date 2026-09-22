
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Error response from a <span>/responses</span> request. Extends <a href="https://docs.commercetools.com/apis/ctp:api:type:ErrorResponse" rel="nofollow">ErrorResponse</a> with a <code>threadId</code> for support.</p>
 *
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
@JsonDeserialize(as = AgentResponsesErrorResponseImpl.class)
public interface AgentResponsesErrorResponse extends ErrorResponse {

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @return errors
     */
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>Identifier of the workflow run that raised the error. Present on errors raised once the workflow has started. Absent on errors raised while parsing the request, before the workflow starts.</p>
     * @return threadId
     */

    @JsonProperty("threadId")
    public String getThreadId();

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     *  <p>Identifier of the workflow run that raised the error. Present on errors raised once the workflow has started. Absent on errors raised while parsing the request, before the workflow starts.</p>
     * @param threadId value to be set
     */

    public void setThreadId(final String threadId);

    /**
     * factory method
     * @return instance of AgentResponsesErrorResponse
     */
    public static AgentResponsesErrorResponse of() {
        return new AgentResponsesErrorResponseImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesErrorResponse of(final AgentResponsesErrorResponse template) {
        AgentResponsesErrorResponseImpl instance = new AgentResponsesErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(template.getErrors());
        instance.setThreadId(template.getThreadId());
        return instance;
    }

    public AgentResponsesErrorResponse copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesErrorResponse deepCopy(@Nullable final AgentResponsesErrorResponse template) {
        if (template == null) {
            return null;
        }
        AgentResponsesErrorResponseImpl instance = new AgentResponsesErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setThreadId(template.getThreadId());
        return instance;
    }

    /**
     * builder factory method for AgentResponsesErrorResponse
     * @return builder
     */
    public static AgentResponsesErrorResponseBuilder builder() {
        return AgentResponsesErrorResponseBuilder.of();
    }

    /**
     * create builder for AgentResponsesErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesErrorResponseBuilder builder(final AgentResponsesErrorResponse template) {
        return AgentResponsesErrorResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesErrorResponse(Function<AgentResponsesErrorResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesErrorResponse> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesErrorResponse>";
            }
        };
    }
}
