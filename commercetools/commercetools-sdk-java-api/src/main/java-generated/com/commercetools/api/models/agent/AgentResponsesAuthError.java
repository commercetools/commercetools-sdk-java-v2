
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.AuthErrorResponse;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Authentication or authorization failure from a <span>/responses</span> request. Uses the standard <a href="https://docs.commercetools.com/apis/ctp:api:type:AuthErrorResponse" rel="nofollow">AuthErrorResponse</a> shape (<code>statusCode</code>, <code>message</code>, <code>errors</code>, plus OAuth <code>error</code> / <code>error_description</code>) rather than the <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesErrorResponse" rel="nofollow">AgentResponsesErrorResponse</a> envelope used for other errors from this endpoint.</p>
 *
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
@JsonDeserialize(as = AgentResponsesAuthErrorImpl.class)
public interface AgentResponsesAuthError extends AuthErrorResponse {

    /**
     * factory method
     * @return instance of AgentResponsesAuthError
     */
    public static AgentResponsesAuthError of() {
        return new AgentResponsesAuthErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesAuthError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesAuthError of(final AgentResponsesAuthError template) {
        AgentResponsesAuthErrorImpl instance = new AgentResponsesAuthErrorImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(template.getErrors());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        return instance;
    }

    public AgentResponsesAuthError copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesAuthError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesAuthError deepCopy(@Nullable final AgentResponsesAuthError template) {
        if (template == null) {
            return null;
        }
        AgentResponsesAuthErrorImpl instance = new AgentResponsesAuthErrorImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        return instance;
    }

    /**
     * builder factory method for AgentResponsesAuthError
     * @return builder
     */
    public static AgentResponsesAuthErrorBuilder builder() {
        return AgentResponsesAuthErrorBuilder.of();
    }

    /**
     * create builder for AgentResponsesAuthError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesAuthErrorBuilder builder(final AgentResponsesAuthError template) {
        return AgentResponsesAuthErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesAuthError(Function<AgentResponsesAuthError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesAuthError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesAuthError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesAuthError>";
            }
        };
    }
}
