
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionImpl.class, name = ShoppingListSetTextLineItemCustomFieldAction.SET_TEXT_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionImpl.class, name = ShoppingListSetTextLineItemCustomTypeAction.SET_TEXT_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionImpl.class, name = ShoppingListSetTextLineItemDescriptionAction.SET_TEXT_LINE_ITEM_DESCRIPTION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ShoppingListUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShoppingListUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ShoppingListUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withShoppingListUpdateAction(Function<ShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
