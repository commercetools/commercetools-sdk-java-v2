
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListAddLineItemActionImpl.class, name = MyShoppingListAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionImpl.class, name = MyShoppingListAddTextLineItemAction.ADD_TEXT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionImpl.class, name = MyShoppingListChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionImpl.class, name = MyShoppingListChangeLineItemsOrderAction.CHANGE_LINE_ITEMS_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeNameActionImpl.class, name = MyShoppingListChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionImpl.class, name = MyShoppingListChangeTextLineItemNameAction.CHANGE_TEXT_LINE_ITEM_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionImpl.class, name = MyShoppingListChangeTextLineItemQuantityAction.CHANGE_TEXT_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionImpl.class, name = MyShoppingListChangeTextLineItemsOrderAction.CHANGE_TEXT_LINE_ITEMS_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionImpl.class, name = MyShoppingListRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionImpl.class, name = MyShoppingListRemoveTextLineItemAction.REMOVE_TEXT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionImpl.class, name = MyShoppingListSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionImpl.class, name = MyShoppingListSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = MyShoppingListSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetDescriptionActionImpl.class, name = MyShoppingListSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionImpl.class, name = MyShoppingListSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionImpl.class, name = MyShoppingListSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionImpl.class, name = MyShoppingListSetTextLineItemCustomFieldAction.SET_TEXT_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionImpl.class, name = MyShoppingListSetTextLineItemCustomTypeAction.SET_TEXT_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionImpl.class, name = MyShoppingListSetTextLineItemDescriptionAction.SET_TEXT_LINE_ITEM_DESCRIPTION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyShoppingListUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyShoppingListUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MyShoppingListUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyShoppingListUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
        return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
        return com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
        return com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    default <T> T withMyShoppingListUpdateAction(Function<MyShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListUpdateAction>";
            }
        };
    }
}
