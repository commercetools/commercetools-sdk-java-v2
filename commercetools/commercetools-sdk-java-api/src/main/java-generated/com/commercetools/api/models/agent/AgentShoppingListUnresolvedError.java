
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in <code>shoppingList</code> could not be found. No entity is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentShoppingListUnresolvedError agentShoppingListUnresolvedError = AgentShoppingListUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentShoppingListUnresolvedErrorImpl.class)
public interface AgentShoppingListUnresolvedError extends ErrorObject {

    /**
     * discriminator value for AgentShoppingListUnresolvedError
     */
    String SHOPPING_LIST_UNRESOLVED = "ShoppingListUnresolved";

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
     * @return instance of AgentShoppingListUnresolvedError
     */
    public static AgentShoppingListUnresolvedError of() {
        return new AgentShoppingListUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentShoppingListUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentShoppingListUnresolvedError of(final AgentShoppingListUnresolvedError template) {
        AgentShoppingListUnresolvedErrorImpl instance = new AgentShoppingListUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentShoppingListUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of AgentShoppingListUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentShoppingListUnresolvedError deepCopy(@Nullable final AgentShoppingListUnresolvedError template) {
        if (template == null) {
            return null;
        }
        AgentShoppingListUnresolvedErrorImpl instance = new AgentShoppingListUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentShoppingListUnresolvedError
     * @return builder
     */
    public static AgentShoppingListUnresolvedErrorBuilder builder() {
        return AgentShoppingListUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for AgentShoppingListUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentShoppingListUnresolvedErrorBuilder builder(final AgentShoppingListUnresolvedError template) {
        return AgentShoppingListUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentShoppingListUnresolvedError(Function<AgentShoppingListUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentShoppingListUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentShoppingListUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentShoppingListUnresolvedError>";
            }
        };
    }
}
