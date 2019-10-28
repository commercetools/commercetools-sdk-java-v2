package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListAddLineItemAction;
import com.commercetools.api.generated.models.me.MyShoppingListAddTextLineItemAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemsOrderAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeNameAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemNameAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.api.generated.models.me.MyShoppingListRemoveLineItemAction;
import com.commercetools.api.generated.models.me.MyShoppingListRemoveTextLineItemAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetCustomFieldAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetCustomTypeAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetDescriptionAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemDescriptionAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListAddTextLineItemActionImpl.class, name = "addTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemsOrderActionImpl.class, name = "changeLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemNameActionImpl.class, name = "changeTextLineItemName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemQuantityActionImpl.class, name = "changeTextLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemsOrderActionImpl.class, name = "changeTextLineItemsOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListRemoveTextLineItemActionImpl.class, name = "removeTextLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomFieldActionImpl.class, name = "setTextLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomTypeActionImpl.class, name = "setTextLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemDescriptionActionImpl.class, name = "setTextLineItemDescription")
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