
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionImpl.class, name = OrderEditAddStagedActionAction.ADD_STAGED_ACTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl.class, name = OrderEditSetCommentAction.SET_COMMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl.class, name = OrderEditSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl.class, name = OrderEditSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetKeyActionImpl.class, name = OrderEditSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionImpl.class, name = OrderEditSetStagedActionsAction.SET_STAGED_ACTIONS) })
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
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction) {
            return com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditSetCommentAction) {
            return com.commercetools.api.models.order_edit.OrderEditSetCommentAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditSetCommentAction) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction) {
            return com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction) {
            return com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditSetKeyAction) {
            return com.commercetools.api.models.order_edit.OrderEditSetKeyAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction) {
            return com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction) template);
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
