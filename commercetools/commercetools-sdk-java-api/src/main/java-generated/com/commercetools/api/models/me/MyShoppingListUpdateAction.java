
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyShoppingListUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListUpdateAction myShoppingListUpdateAction = MyShoppingListUpdateAction.addLineItemBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyShoppingListUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyShoppingListUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyShoppingListUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyShoppingListUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public MyShoppingListUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListUpdateAction deepCopy(@Nullable final MyShoppingListUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MyShoppingListUpdateActionImpl)) {
            return template.copyDeep();
        }
        MyShoppingListUpdateActionImpl instance = new MyShoppingListUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder.of();
    }

    /**
     * builder for addTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder.of();
    }

    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder.of();
    }

    /**
     * builder for removeTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDeleteDaysAfterLastModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setTextLineItemDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListUpdateAction(Function<MyShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListUpdateAction>";
            }
        };
    }
}
