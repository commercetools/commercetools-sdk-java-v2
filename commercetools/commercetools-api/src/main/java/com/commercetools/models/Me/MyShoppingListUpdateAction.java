package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListAddLineItemAction;
import com.commercetools.models.me.MyShoppingListAddTextLineItemAction;
import com.commercetools.models.me.MyShoppingListChangeLineItemQuantityAction;
import com.commercetools.models.me.MyShoppingListChangeLineItemsOrderAction;
import com.commercetools.models.me.MyShoppingListChangeNameAction;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemNameAction;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.models.me.MyShoppingListRemoveLineItemAction;
import com.commercetools.models.me.MyShoppingListRemoveTextLineItemAction;
import com.commercetools.models.me.MyShoppingListSetCustomFieldAction;
import com.commercetools.models.me.MyShoppingListSetCustomTypeAction;
import com.commercetools.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.me.MyShoppingListSetDescriptionAction;
import com.commercetools.models.me.MyShoppingListSetLineItemCustomFieldAction;
import com.commercetools.models.me.MyShoppingListSetLineItemCustomTypeAction;
import com.commercetools.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.models.me.MyShoppingListSetTextLineItemDescriptionAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListAddTextLineItemActionImpl.class, name = "addTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeLineItemsOrderActionImpl.class, name = "changeLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeTextLineItemNameActionImpl.class, name = "changeTextLineItemName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeTextLineItemQuantityActionImpl.class, name = "changeTextLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListChangeTextLineItemsOrderActionImpl.class, name = "changeTextLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListRemoveTextLineItemActionImpl.class, name = "removeTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetTextLineItemCustomFieldActionImpl.class, name = "setTextLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetTextLineItemCustomTypeActionImpl.class, name = "setTextLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyShoppingListSetTextLineItemDescriptionActionImpl.class, name = "setTextLineItemDescription")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyShoppingListUpdateAction  {


   


}