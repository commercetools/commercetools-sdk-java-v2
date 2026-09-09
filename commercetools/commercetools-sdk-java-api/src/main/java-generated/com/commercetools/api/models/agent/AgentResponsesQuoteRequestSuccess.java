
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote_request.QuoteRequest;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request when <code>outputType</code> is <code>QuoteRequest</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesQuoteRequestSuccess agentResponsesQuoteRequestSuccess = AgentResponsesQuoteRequestSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRequest")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesQuoteRequestSuccessImpl.class)
public interface AgentResponsesQuoteRequestSuccess extends AgentResponsesSuccess {

    /**
     * discriminator value for AgentResponsesQuoteRequestSuccess
     */
    String QUOTE_REQUEST = "QuoteRequest";

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @return entity
     */
    @NotNull
    @Valid
    @JsonProperty("entity")
    public QuoteRequest getEntity();

    /**
     *  <p><code>id</code> of the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @return cartId
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     */

    public void setEntity(final QuoteRequest entity);

    /**
     *  <p><code>id</code> of the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param cartId value to be set
     */

    public void setCartId(final String cartId);

    /**
     * factory method
     * @return instance of AgentResponsesQuoteRequestSuccess
     */
    public static AgentResponsesQuoteRequestSuccess of() {
        return new AgentResponsesQuoteRequestSuccessImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesQuoteRequestSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesQuoteRequestSuccess of(final AgentResponsesQuoteRequestSuccess template) {
        AgentResponsesQuoteRequestSuccessImpl instance = new AgentResponsesQuoteRequestSuccessImpl();
        instance.setWarnings(template.getWarnings());
        instance.setThreadId(template.getThreadId());
        instance.setEntity(template.getEntity());
        instance.setCartId(template.getCartId());
        return instance;
    }

    public AgentResponsesQuoteRequestSuccess copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesQuoteRequestSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesQuoteRequestSuccess deepCopy(
            @Nullable final AgentResponsesQuoteRequestSuccess template) {
        if (template == null) {
            return null;
        }
        AgentResponsesQuoteRequestSuccessImpl instance = new AgentResponsesQuoteRequestSuccessImpl();
        instance.setWarnings(Optional.ofNullable(template.getWarnings())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.warning.WarningObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setThreadId(template.getThreadId());
        instance.setEntity(com.commercetools.api.models.quote_request.QuoteRequest.deepCopy(template.getEntity()));
        instance.setCartId(template.getCartId());
        return instance;
    }

    /**
     * builder factory method for AgentResponsesQuoteRequestSuccess
     * @return builder
     */
    public static AgentResponsesQuoteRequestSuccessBuilder builder() {
        return AgentResponsesQuoteRequestSuccessBuilder.of();
    }

    /**
     * create builder for AgentResponsesQuoteRequestSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesQuoteRequestSuccessBuilder builder(final AgentResponsesQuoteRequestSuccess template) {
        return AgentResponsesQuoteRequestSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesQuoteRequestSuccess(Function<AgentResponsesQuoteRequestSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesQuoteRequestSuccess> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesQuoteRequestSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesQuoteRequestSuccess>";
            }
        };
    }
}
