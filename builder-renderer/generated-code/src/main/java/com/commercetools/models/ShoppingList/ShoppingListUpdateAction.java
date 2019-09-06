package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListAddLineItemAction;
import com.commercetools.models.ShoppingList.ShoppingListAddTextLineItemAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeLineItemQuantityAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeLineItemsOrderAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeNameAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemNameAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.models.ShoppingList.ShoppingListRemoveLineItemAction;
import com.commercetools.models.ShoppingList.ShoppingListRemoveTextLineItemAction;
import com.commercetools.models.ShoppingList.ShoppingListSetAnonymousIdAction;
import com.commercetools.models.ShoppingList.ShoppingListSetCustomFieldAction;
import com.commercetools.models.ShoppingList.ShoppingListSetCustomTypeAction;
import com.commercetools.models.ShoppingList.ShoppingListSetCustomerAction;
import com.commercetools.models.ShoppingList.ShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.ShoppingList.ShoppingListSetDescriptionAction;
import com.commercetools.models.ShoppingList.ShoppingListSetKeyAction;
import com.commercetools.models.ShoppingList.ShoppingListSetLineItemCustomFieldAction;
import com.commercetools.models.ShoppingList.ShoppingListSetLineItemCustomTypeAction;
import com.commercetools.models.ShoppingList.ShoppingListSetSlugAction;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemDescriptionAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListAddTextLineItemActionImpl.class, name = "addTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeLineItemsOrderActionImpl.class, name = "changeLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemNameActionImpl.class, name = "changeTextLineItemName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemQuantityActionImpl.class, name = "changeTextLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemsOrderActionImpl.class, name = "changeTextLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListRemoveTextLineItemActionImpl.class, name = "removeTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetSlugActionImpl.class, name = "setSlug"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomFieldActionImpl.class, name = "setTextLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomTypeActionImpl.class, name = "setTextLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemDescriptionActionImpl.class, name = "setTextLineItemDescription")
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
public interface ShoppingListUpdateAction  {


   


}