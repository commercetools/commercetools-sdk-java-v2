
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when the input does not contain enough information to create a Cart or a Quote Request: no products, no customer email address, and no shipping country could be determined.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentOutOfScopeError agentOutOfScopeError = AgentOutOfScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OutOfScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentOutOfScopeErrorImpl.class)
public interface AgentOutOfScopeError extends ErrorObject {

    /**
     * discriminator value for AgentOutOfScopeError
     */
    String OUT_OF_SCOPE = "OutOfScope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of AgentOutOfScopeError
     */
    public static AgentOutOfScopeError of() {
        return new AgentOutOfScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentOutOfScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentOutOfScopeError of(final AgentOutOfScopeError template) {
        AgentOutOfScopeErrorImpl instance = new AgentOutOfScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentOutOfScopeError copyDeep();

    /**
     * factory method to create a deep copy of AgentOutOfScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentOutOfScopeError deepCopy(@Nullable final AgentOutOfScopeError template) {
        if (template == null) {
            return null;
        }
        AgentOutOfScopeErrorImpl instance = new AgentOutOfScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentOutOfScopeError
     * @return builder
     */
    public static AgentOutOfScopeErrorBuilder builder() {
        return AgentOutOfScopeErrorBuilder.of();
    }

    /**
     * create builder for AgentOutOfScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentOutOfScopeErrorBuilder builder(final AgentOutOfScopeError template) {
        return AgentOutOfScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentOutOfScopeError(Function<AgentOutOfScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentOutOfScopeError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentOutOfScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentOutOfScopeError>";
            }
        };
    }
}
