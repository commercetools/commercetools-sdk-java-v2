
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShoppingListUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListUpdateAction shoppingListUpdateAction = ShoppingListUpdateAction.addLineItemBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ShoppingListUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ShoppingListUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShoppingListUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ShoppingListUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ShoppingListUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListUpdateAction deepCopy(@Nullable final ShoppingListUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ShoppingListUpdateActionImpl)) {
            return template.copyDeep();
        }
        ShoppingListUpdateActionImpl instance = new ShoppingListUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder.of();
    }

    /**
     * builder for addTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder.of();
    }

    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeTextLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder.of();
    }

    /**
     * builder for removeTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder.of();
    }

    /**
     * builder for setAnonymousId subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder.of();
    }

    /**
     * builder for setBusinessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetBusinessUnitActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder setCustomerBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder.of();
    }

    /**
     * builder for setDeleteDaysAfterLastModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder
                .of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder setSlugBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder.of();
    }

    /**
     * builder for setStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder setStoreBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setTextLineItemDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListUpdateAction(Function<ShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListUpdateAction>";
            }
        };
    }
}
