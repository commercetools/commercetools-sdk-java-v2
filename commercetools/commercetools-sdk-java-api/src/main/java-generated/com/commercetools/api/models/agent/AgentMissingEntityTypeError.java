
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
 *  <p>Returned by a <span>/responses</span> request when the input did not specify whether to create a Cart or a Quote Request. Set <code>outputType</code> explicitly in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingEntityTypeError agentMissingEntityTypeError = AgentMissingEntityTypeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingEntityType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentMissingEntityTypeErrorImpl.class)
public interface AgentMissingEntityTypeError extends ErrorObject {

    /**
     * discriminator value for AgentMissingEntityTypeError
     */
    String MISSING_ENTITY_TYPE = "MissingEntityType";

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
     * @return instance of AgentMissingEntityTypeError
     */
    public static AgentMissingEntityTypeError of() {
        return new AgentMissingEntityTypeErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentMissingEntityTypeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentMissingEntityTypeError of(final AgentMissingEntityTypeError template) {
        AgentMissingEntityTypeErrorImpl instance = new AgentMissingEntityTypeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentMissingEntityTypeError copyDeep();

    /**
     * factory method to create a deep copy of AgentMissingEntityTypeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentMissingEntityTypeError deepCopy(@Nullable final AgentMissingEntityTypeError template) {
        if (template == null) {
            return null;
        }
        AgentMissingEntityTypeErrorImpl instance = new AgentMissingEntityTypeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentMissingEntityTypeError
     * @return builder
     */
    public static AgentMissingEntityTypeErrorBuilder builder() {
        return AgentMissingEntityTypeErrorBuilder.of();
    }

    /**
     * create builder for AgentMissingEntityTypeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingEntityTypeErrorBuilder builder(final AgentMissingEntityTypeError template) {
        return AgentMissingEntityTypeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentMissingEntityTypeError(Function<AgentMissingEntityTypeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentMissingEntityTypeError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentMissingEntityTypeError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentMissingEntityTypeError>";
            }
        };
    }
}
