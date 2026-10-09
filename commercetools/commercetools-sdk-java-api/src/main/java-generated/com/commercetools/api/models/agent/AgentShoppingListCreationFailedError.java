
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> could not be created, for example because the request has no verified Customer or because commercetools rejected the ShoppingList draft. No entity is created, so there is nothing to clean up.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentShoppingListCreationFailedError agentShoppingListCreationFailedError = AgentShoppingListCreationFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListCreationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentShoppingListCreationFailedErrorImpl.class)
public interface AgentShoppingListCreationFailedError extends ErrorObject {

    /**
     * discriminator value for AgentShoppingListCreationFailedError
     */
    String SHOPPING_LIST_CREATION_FAILED = "ShoppingListCreationFailed";

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
     * @return instance of AgentShoppingListCreationFailedError
     */
    public static AgentShoppingListCreationFailedError of() {
        return new AgentShoppingListCreationFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentShoppingListCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentShoppingListCreationFailedError of(final AgentShoppingListCreationFailedError template) {
        AgentShoppingListCreationFailedErrorImpl instance = new AgentShoppingListCreationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentShoppingListCreationFailedError copyDeep();

    /**
     * factory method to create a deep copy of AgentShoppingListCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentShoppingListCreationFailedError deepCopy(
            @Nullable final AgentShoppingListCreationFailedError template) {
        if (template == null) {
            return null;
        }
        AgentShoppingListCreationFailedErrorImpl instance = new AgentShoppingListCreationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentShoppingListCreationFailedError
     * @return builder
     */
    public static AgentShoppingListCreationFailedErrorBuilder builder() {
        return AgentShoppingListCreationFailedErrorBuilder.of();
    }

    /**
     * create builder for AgentShoppingListCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentShoppingListCreationFailedErrorBuilder builder(
            final AgentShoppingListCreationFailedError template) {
        return AgentShoppingListCreationFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentShoppingListCreationFailedError(Function<AgentShoppingListCreationFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentShoppingListCreationFailedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentShoppingListCreationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentShoppingListCreationFailedError>";
            }
        };
    }
}
