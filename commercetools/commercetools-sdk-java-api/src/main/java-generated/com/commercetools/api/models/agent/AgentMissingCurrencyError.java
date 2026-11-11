
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
 *  <p>Returned by a <span>/responses</span> request that sets <code>shoppingList</code> when the currency for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> could not be determined unambiguously. No entity is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCurrencyError agentMissingCurrencyError = AgentMissingCurrencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCurrency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentMissingCurrencyErrorImpl.class)
public interface AgentMissingCurrencyError extends ErrorObject {

    /**
     * discriminator value for AgentMissingCurrencyError
     */
    String MISSING_CURRENCY = "MissingCurrency";

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
     * @return instance of AgentMissingCurrencyError
     */
    public static AgentMissingCurrencyError of() {
        return new AgentMissingCurrencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentMissingCurrencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentMissingCurrencyError of(final AgentMissingCurrencyError template) {
        AgentMissingCurrencyErrorImpl instance = new AgentMissingCurrencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentMissingCurrencyError copyDeep();

    /**
     * factory method to create a deep copy of AgentMissingCurrencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentMissingCurrencyError deepCopy(@Nullable final AgentMissingCurrencyError template) {
        if (template == null) {
            return null;
        }
        AgentMissingCurrencyErrorImpl instance = new AgentMissingCurrencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentMissingCurrencyError
     * @return builder
     */
    public static AgentMissingCurrencyErrorBuilder builder() {
        return AgentMissingCurrencyErrorBuilder.of();
    }

    /**
     * create builder for AgentMissingCurrencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCurrencyErrorBuilder builder(final AgentMissingCurrencyError template) {
        return AgentMissingCurrencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentMissingCurrencyError(Function<AgentMissingCurrencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentMissingCurrencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentMissingCurrencyError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentMissingCurrencyError>";
            }
        };
    }
}
