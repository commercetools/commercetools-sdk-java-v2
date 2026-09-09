
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> could not be resolved from the input. Pin it with an explicit <code>store</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreUnresolvedError agentStoreUnresolvedError = AgentStoreUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentStoreUnresolvedErrorImpl.class)
public interface AgentStoreUnresolvedError extends ErrorObject {

    /**
     * discriminator value for AgentStoreUnresolvedError
     */
    String STORE_UNRESOLVED = "StoreUnresolved";

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
     * @return instance of AgentStoreUnresolvedError
     */
    public static AgentStoreUnresolvedError of() {
        return new AgentStoreUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentStoreUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentStoreUnresolvedError of(final AgentStoreUnresolvedError template) {
        AgentStoreUnresolvedErrorImpl instance = new AgentStoreUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentStoreUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of AgentStoreUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentStoreUnresolvedError deepCopy(@Nullable final AgentStoreUnresolvedError template) {
        if (template == null) {
            return null;
        }
        AgentStoreUnresolvedErrorImpl instance = new AgentStoreUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentStoreUnresolvedError
     * @return builder
     */
    public static AgentStoreUnresolvedErrorBuilder builder() {
        return AgentStoreUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for AgentStoreUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreUnresolvedErrorBuilder builder(final AgentStoreUnresolvedError template) {
        return AgentStoreUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentStoreUnresolvedError(Function<AgentStoreUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentStoreUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentStoreUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentStoreUnresolvedError>";
            }
        };
    }
}
