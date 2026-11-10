
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.Cart;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request when <code>outputType</code> is <code>Cart</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesCartSuccess agentResponsesCartSuccess = AgentResponsesCartSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Cart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesCartSuccessImpl.class)
public interface AgentResponsesCartSuccess extends AgentResponsesSuccess {

    /**
     * discriminator value for AgentResponsesCartSuccess
     */
    String CART = "Cart";

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @return entity
     */
    @NotNull
    @Valid
    @JsonProperty("entity")
    public Cart getEntity();

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     */

    public void setEntity(final Cart entity);

    /**
     * factory method
     * @return instance of AgentResponsesCartSuccess
     */
    public static AgentResponsesCartSuccess of() {
        return new AgentResponsesCartSuccessImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesCartSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesCartSuccess of(final AgentResponsesCartSuccess template) {
        AgentResponsesCartSuccessImpl instance = new AgentResponsesCartSuccessImpl();
        instance.setWarnings(template.getWarnings());
        instance.setThreadId(template.getThreadId());
        instance.setEntity(template.getEntity());
        return instance;
    }

    public AgentResponsesCartSuccess copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesCartSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesCartSuccess deepCopy(@Nullable final AgentResponsesCartSuccess template) {
        if (template == null) {
            return null;
        }
        AgentResponsesCartSuccessImpl instance = new AgentResponsesCartSuccessImpl();
        instance.setWarnings(Optional.ofNullable(template.getWarnings())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.warning.WarningObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setThreadId(template.getThreadId());
        instance.setEntity(com.commercetools.api.models.cart.Cart.deepCopy(template.getEntity()));
        return instance;
    }

    /**
     * builder factory method for AgentResponsesCartSuccess
     * @return builder
     */
    public static AgentResponsesCartSuccessBuilder builder() {
        return AgentResponsesCartSuccessBuilder.of();
    }

    /**
     * create builder for AgentResponsesCartSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesCartSuccessBuilder builder(final AgentResponsesCartSuccess template) {
        return AgentResponsesCartSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesCartSuccess(Function<AgentResponsesCartSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesCartSuccess> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesCartSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesCartSuccess>";
            }
        };
    }
}
