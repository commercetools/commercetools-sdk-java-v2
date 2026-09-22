
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
 *  <p>Returned by a <span>/responses</span> request when the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> was created but the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> could not be created from it, for example because the Cart has no verified Customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentQuoteRequestCreationFailedError agentQuoteRequestCreationFailedError = AgentQuoteRequestCreationFailedError.builder()
 *             .message("{message}")
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRequestCreationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentQuoteRequestCreationFailedErrorImpl.class)
public interface AgentQuoteRequestCreationFailedError extends ErrorObject {

    /**
     * discriminator value for AgentQuoteRequestCreationFailedError
     */
    String QUOTE_REQUEST_CREATION_FAILED = "QuoteRequestCreationFailed";

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
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @return cartId
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @param cartId value to be set
     */

    public void setCartId(final String cartId);

    /**
     * factory method
     * @return instance of AgentQuoteRequestCreationFailedError
     */
    public static AgentQuoteRequestCreationFailedError of() {
        return new AgentQuoteRequestCreationFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentQuoteRequestCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentQuoteRequestCreationFailedError of(final AgentQuoteRequestCreationFailedError template) {
        AgentQuoteRequestCreationFailedErrorImpl instance = new AgentQuoteRequestCreationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCartId(template.getCartId());
        return instance;
    }

    public AgentQuoteRequestCreationFailedError copyDeep();

    /**
     * factory method to create a deep copy of AgentQuoteRequestCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentQuoteRequestCreationFailedError deepCopy(
            @Nullable final AgentQuoteRequestCreationFailedError template) {
        if (template == null) {
            return null;
        }
        AgentQuoteRequestCreationFailedErrorImpl instance = new AgentQuoteRequestCreationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCartId(template.getCartId());
        return instance;
    }

    /**
     * builder factory method for AgentQuoteRequestCreationFailedError
     * @return builder
     */
    public static AgentQuoteRequestCreationFailedErrorBuilder builder() {
        return AgentQuoteRequestCreationFailedErrorBuilder.of();
    }

    /**
     * create builder for AgentQuoteRequestCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentQuoteRequestCreationFailedErrorBuilder builder(
            final AgentQuoteRequestCreationFailedError template) {
        return AgentQuoteRequestCreationFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentQuoteRequestCreationFailedError(Function<AgentQuoteRequestCreationFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentQuoteRequestCreationFailedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentQuoteRequestCreationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentQuoteRequestCreationFailedError>";
            }
        };
    }
}
