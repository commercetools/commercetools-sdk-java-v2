package com.commercetools.models.Me;

import com.commercetools.models.Me.MyShoppingListAddLineItemAction;
import com.commercetools.models.Me.MyShoppingListAddTextLineItemAction;
import com.commercetools.models.Me.MyShoppingListChangeLineItemQuantityAction;
import com.commercetools.models.Me.MyShoppingListChangeLineItemsOrderAction;
import com.commercetools.models.Me.MyShoppingListChangeNameAction;
import com.commercetools.models.Me.MyShoppingListChangeTextLineItemNameAction;
import com.commercetools.models.Me.MyShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.models.Me.MyShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.models.Me.MyShoppingListRemoveLineItemAction;
import com.commercetools.models.Me.MyShoppingListRemoveTextLineItemAction;
import com.commercetools.models.Me.MyShoppingListSetCustomFieldAction;
import com.commercetools.models.Me.MyShoppingListSetCustomTypeAction;
import com.commercetools.models.Me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.Me.MyShoppingListSetDescriptionAction;
import com.commercetools.models.Me.MyShoppingListSetLineItemCustomFieldAction;
import com.commercetools.models.Me.MyShoppingListSetLineItemCustomTypeAction;
import com.commercetools.models.Me.MyShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.models.Me.MyShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.models.Me.MyShoppingListSetTextLineItemDescriptionAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListAddTextLineItemActionImpl.class, name = "addTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeLineItemsOrderActionImpl.class, name = "changeLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeTextLineItemNameActionImpl.class, name = "changeTextLineItemName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeTextLineItemQuantityActionImpl.class, name = "changeTextLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListChangeTextLineItemsOrderActionImpl.class, name = "changeTextLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListRemoveTextLineItemActionImpl.class, name = "removeTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetTextLineItemCustomFieldActionImpl.class, name = "setTextLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetTextLineItemCustomTypeActionImpl.class, name = "setTextLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyShoppingListSetTextLineItemDescriptionActionImpl.class, name = "setTextLineItemDescription")
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