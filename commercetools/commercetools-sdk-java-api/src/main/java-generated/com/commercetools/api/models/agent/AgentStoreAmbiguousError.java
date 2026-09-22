
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
 *  <p>Returned by a <span>/responses</span> request when the resolved <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> grants multiple <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> and none could be automatically selected. To resolve this error, specify an explicit <code>store</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreAmbiguousError agentStoreAmbiguousError = AgentStoreAmbiguousError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreAmbiguous")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentStoreAmbiguousErrorImpl.class)
public interface AgentStoreAmbiguousError extends ErrorObject {

    /**
     * discriminator value for AgentStoreAmbiguousError
     */
    String STORE_AMBIGUOUS = "StoreAmbiguous";

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
     * @return instance of AgentStoreAmbiguousError
     */
    public static AgentStoreAmbiguousError of() {
        return new AgentStoreAmbiguousErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentStoreAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentStoreAmbiguousError of(final AgentStoreAmbiguousError template) {
        AgentStoreAmbiguousErrorImpl instance = new AgentStoreAmbiguousErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentStoreAmbiguousError copyDeep();

    /**
     * factory method to create a deep copy of AgentStoreAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentStoreAmbiguousError deepCopy(@Nullable final AgentStoreAmbiguousError template) {
        if (template == null) {
            return null;
        }
        AgentStoreAmbiguousErrorImpl instance = new AgentStoreAmbiguousErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentStoreAmbiguousError
     * @return builder
     */
    public static AgentStoreAmbiguousErrorBuilder builder() {
        return AgentStoreAmbiguousErrorBuilder.of();
    }

    /**
     * create builder for AgentStoreAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreAmbiguousErrorBuilder builder(final AgentStoreAmbiguousError template) {
        return AgentStoreAmbiguousErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentStoreAmbiguousError(Function<AgentStoreAmbiguousError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentStoreAmbiguousError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentStoreAmbiguousError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentStoreAmbiguousError>";
            }
        };
    }
}
