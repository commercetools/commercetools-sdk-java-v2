
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
 *  <p>Returned by a <span>/responses</span> request with <code>outputType</code> set to <code>ShoppingList</code> when a name for the Shopping List is not present in the input. A name is never invented.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingShoppingListNameError agentMissingShoppingListNameError = AgentMissingShoppingListNameError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingShoppingListName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentMissingShoppingListNameErrorImpl.class)
public interface AgentMissingShoppingListNameError extends ErrorObject {

    /**
     * discriminator value for AgentMissingShoppingListNameError
     */
    String MISSING_SHOPPING_LIST_NAME = "MissingShoppingListName";

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
     * @return instance of AgentMissingShoppingListNameError
     */
    public static AgentMissingShoppingListNameError of() {
        return new AgentMissingShoppingListNameErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentMissingShoppingListNameError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentMissingShoppingListNameError of(final AgentMissingShoppingListNameError template) {
        AgentMissingShoppingListNameErrorImpl instance = new AgentMissingShoppingListNameErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentMissingShoppingListNameError copyDeep();

    /**
     * factory method to create a deep copy of AgentMissingShoppingListNameError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentMissingShoppingListNameError deepCopy(
            @Nullable final AgentMissingShoppingListNameError template) {
        if (template == null) {
            return null;
        }
        AgentMissingShoppingListNameErrorImpl instance = new AgentMissingShoppingListNameErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentMissingShoppingListNameError
     * @return builder
     */
    public static AgentMissingShoppingListNameErrorBuilder builder() {
        return AgentMissingShoppingListNameErrorBuilder.of();
    }

    /**
     * create builder for AgentMissingShoppingListNameError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingShoppingListNameErrorBuilder builder(final AgentMissingShoppingListNameError template) {
        return AgentMissingShoppingListNameErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentMissingShoppingListNameError(Function<AgentMissingShoppingListNameError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentMissingShoppingListNameError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentMissingShoppingListNameError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentMissingShoppingListNameError>";
            }
        };
    }
}
