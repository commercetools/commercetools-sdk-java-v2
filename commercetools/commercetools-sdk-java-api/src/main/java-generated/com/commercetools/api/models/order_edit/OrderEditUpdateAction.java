
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderEditUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditUpdateAction orderEditUpdateAction = OrderEditUpdateAction.addStagedActionBuilder()
 *             stagedAction(stagedActionBuilder -> stagedActionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = OrderEditUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = OrderEditUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderEditUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<OrderEditUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public OrderEditUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderEditUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditUpdateAction deepCopy(@Nullable final OrderEditUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof OrderEditUpdateActionImpl)) {
            return template.copyDeep();
        }
        OrderEditUpdateActionImpl instance = new OrderEditUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addStagedAction subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionBuilder addStagedActionBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionBuilder.of();
    }

    /**
     * builder for setComment subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditSetCommentActionBuilder setCommentBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCommentActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetKeyActionBuilder.of();
    }

    /**
     * builder for setStagedActions subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionBuilder setStagedActionsBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditUpdateAction(Function<OrderEditUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditUpdateAction>";
            }
        };
    }
}
