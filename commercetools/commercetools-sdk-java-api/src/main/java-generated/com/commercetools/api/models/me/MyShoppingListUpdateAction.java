package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListAddLineItemAction;
import com.commercetools.api.models.me.MyShoppingListAddTextLineItemAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderAction;
import com.commercetools.api.models.me.MyShoppingListChangeNameAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.api.models.me.MyShoppingListRemoveLineItemAction;
import com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemAction;
import com.commercetools.api.models.me.MyShoppingListSetCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.me.MyShoppingListSetDescriptionAction;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

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
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionImpl.class, name = MyShoppingListSetTextLineItemDescriptionAction.SET_TEXT_LINE_ITEM_DESCRIPTION)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = MyShoppingListUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyShoppingListUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<MyShoppingListUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withMyShoppingListUpdateAction(Function<MyShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
