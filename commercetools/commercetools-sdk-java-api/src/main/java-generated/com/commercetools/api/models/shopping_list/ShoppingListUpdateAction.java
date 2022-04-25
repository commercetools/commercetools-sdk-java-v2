
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionImpl.class, name = ShoppingListAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionImpl.class, name = ShoppingListAddTextLineItemAction.ADD_TEXT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionImpl.class, name = ShoppingListChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionImpl.class, name = ShoppingListChangeLineItemsOrderAction.CHANGE_LINE_ITEMS_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionImpl.class, name = ShoppingListChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionImpl.class, name = ShoppingListChangeTextLineItemNameAction.CHANGE_TEXT_LINE_ITEM_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl.class, name = ShoppingListChangeTextLineItemQuantityAction.CHANGE_TEXT_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl.class, name = ShoppingListChangeTextLineItemsOrderAction.CHANGE_TEXT_LINE_ITEMS_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionImpl.class, name = ShoppingListRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionImpl.class, name = ShoppingListRemoveTextLineItemAction.REMOVE_TEXT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionImpl.class, name = ShoppingListSetAnonymousIdAction.SET_ANONYMOUS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionImpl.class, name = ShoppingListSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionImpl.class, name = ShoppingListSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionImpl.class, name = ShoppingListSetCustomerAction.SET_CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = ShoppingListSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionImpl.class, name = ShoppingListSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionImpl.class, name = ShoppingListSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionImpl.class, name = ShoppingListSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionImpl.class, name = ShoppingListSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionImpl.class, name = ShoppingListSetSlugAction.SET_SLUG),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionImpl.class, name = ShoppingListSetStoreAction.SET_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionImpl.class, name = ShoppingListSetTextLineItemCustomFieldAction.SET_TEXT_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionImpl.class, name = ShoppingListSetTextLineItemCustomTypeAction.SET_TEXT_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionImpl.class, name = ShoppingListSetTextLineItemDescriptionAction.SET_TEXT_LINE_ITEM_DESCRIPTION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ShoppingListUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ShoppingListUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShoppingListUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ShoppingListUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder setCustomerBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder
                .of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder setSlugBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder setStoreBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    default <T> T withShoppingListUpdateAction(Function<ShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListUpdateAction>";
            }
        };
    }
}
