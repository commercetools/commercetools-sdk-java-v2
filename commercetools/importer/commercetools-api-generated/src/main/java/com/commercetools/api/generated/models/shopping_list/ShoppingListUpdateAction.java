package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListAddLineItemAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListAddTextLineItemAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeLineItemsOrderAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeNameAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemNameAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListRemoveLineItemAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListRemoveTextLineItemAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetAnonymousIdAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomFieldAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomTypeAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomerAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetDescriptionAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetKeyAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetSlugAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListAddTextLineItemActionImpl.class, name = "addTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeLineItemsOrderActionImpl.class, name = "changeLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemNameActionImpl.class, name = "changeTextLineItemName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl.class, name = "changeTextLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl.class, name = "changeTextLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListRemoveTextLineItemActionImpl.class, name = "removeTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetSlugActionImpl.class, name = "setSlug"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionImpl.class, name = "setTextLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionImpl.class, name = "setTextLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionImpl.class, name = "setTextLineItemDescription")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = ShoppingListUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShoppingListUpdateAction  {


   


}