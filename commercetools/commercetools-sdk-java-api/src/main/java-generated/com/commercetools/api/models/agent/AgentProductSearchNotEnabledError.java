
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
 *  <p>Returned by a <span>/responses</span> request when Product Search is not enabled for the project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentProductSearchNotEnabledError agentProductSearchNotEnabledError = AgentProductSearchNotEnabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSearchNotEnabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentProductSearchNotEnabledErrorImpl.class)
public interface AgentProductSearchNotEnabledError extends ErrorObject {

    /**
     * discriminator value for AgentProductSearchNotEnabledError
     */
    String PRODUCT_SEARCH_NOT_ENABLED = "ProductSearchNotEnabled";

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
     * @return instance of AgentProductSearchNotEnabledError
     */
    public static AgentProductSearchNotEnabledError of() {
        return new AgentProductSearchNotEnabledErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentProductSearchNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentProductSearchNotEnabledError of(final AgentProductSearchNotEnabledError template) {
        AgentProductSearchNotEnabledErrorImpl instance = new AgentProductSearchNotEnabledErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentProductSearchNotEnabledError copyDeep();

    /**
     * factory method to create a deep copy of AgentProductSearchNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentProductSearchNotEnabledError deepCopy(
            @Nullable final AgentProductSearchNotEnabledError template) {
        if (template == null) {
            return null;
        }
        AgentProductSearchNotEnabledErrorImpl instance = new AgentProductSearchNotEnabledErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentProductSearchNotEnabledError
     * @return builder
     */
    public static AgentProductSearchNotEnabledErrorBuilder builder() {
        return AgentProductSearchNotEnabledErrorBuilder.of();
    }

    /**
     * create builder for AgentProductSearchNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductSearchNotEnabledErrorBuilder builder(final AgentProductSearchNotEnabledError template) {
        return AgentProductSearchNotEnabledErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentProductSearchNotEnabledError(Function<AgentProductSearchNotEnabledError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentProductSearchNotEnabledError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentProductSearchNotEnabledError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentProductSearchNotEnabledError>";
            }
        };
    }
}
