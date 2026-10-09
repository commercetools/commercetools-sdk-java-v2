
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.shopping_list.ShoppingList;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request when <code>outputType</code> is <code>ShoppingList</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesShoppingListSuccess agentResponsesShoppingListSuccess = AgentResponsesShoppingListSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingList")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesShoppingListSuccessImpl.class)
public interface AgentResponsesShoppingListSuccess extends AgentResponsesSuccess {

    /**
     * discriminator value for AgentResponsesShoppingListSuccess
     */
    String SHOPPING_LIST = "ShoppingList";

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @return entity
     */
    @NotNull
    @Valid
    @JsonProperty("entity")
    public ShoppingList getEntity();

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     */

    public void setEntity(final ShoppingList entity);

    /**
     * factory method
     * @return instance of AgentResponsesShoppingListSuccess
     */
    public static AgentResponsesShoppingListSuccess of() {
        return new AgentResponsesShoppingListSuccessImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesShoppingListSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesShoppingListSuccess of(final AgentResponsesShoppingListSuccess template) {
        AgentResponsesShoppingListSuccessImpl instance = new AgentResponsesShoppingListSuccessImpl();
        instance.setWarnings(template.getWarnings());
        instance.setThreadId(template.getThreadId());
        instance.setEntity(template.getEntity());
        return instance;
    }

    public AgentResponsesShoppingListSuccess copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesShoppingListSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesShoppingListSuccess deepCopy(
            @Nullable final AgentResponsesShoppingListSuccess template) {
        if (template == null) {
            return null;
        }
        AgentResponsesShoppingListSuccessImpl instance = new AgentResponsesShoppingListSuccessImpl();
        instance.setWarnings(Optional.ofNullable(template.getWarnings())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.warning.WarningObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setThreadId(template.getThreadId());
        instance.setEntity(com.commercetools.api.models.shopping_list.ShoppingList.deepCopy(template.getEntity()));
        return instance;
    }

    /**
     * builder factory method for AgentResponsesShoppingListSuccess
     * @return builder
     */
    public static AgentResponsesShoppingListSuccessBuilder builder() {
        return AgentResponsesShoppingListSuccessBuilder.of();
    }

    /**
     * create builder for AgentResponsesShoppingListSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesShoppingListSuccessBuilder builder(final AgentResponsesShoppingListSuccess template) {
        return AgentResponsesShoppingListSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesShoppingListSuccess(Function<AgentResponsesShoppingListSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesShoppingListSuccess> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesShoppingListSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesShoppingListSuccess>";
            }
        };
    }
}
