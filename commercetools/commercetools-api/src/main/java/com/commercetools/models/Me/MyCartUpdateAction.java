package com.commercetools.models.me;

import com.commercetools.models.me.MyCartAddDiscountCodeAction;
import com.commercetools.models.me.MyCartAddItemShippingAddressAction;
import com.commercetools.models.me.MyCartAddLineItemAction;
import com.commercetools.models.me.MyCartAddPaymentAction;
import com.commercetools.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.models.me.MyCartChangeLineItemQuantityAction;
import com.commercetools.models.me.MyCartChangeTaxModeAction;
import com.commercetools.models.me.MyCartRecalculateAction;
import com.commercetools.models.me.MyCartRemoveDiscountCodeAction;
import com.commercetools.models.me.MyCartRemoveItemShippingAddressAction;
import com.commercetools.models.me.MyCartRemoveLineItemAction;
import com.commercetools.models.me.MyCartRemovePaymentAction;
import com.commercetools.models.me.MyCartSetBillingAddressAction;
import com.commercetools.models.me.MyCartSetCountryAction;
import com.commercetools.models.me.MyCartSetCustomFieldAction;
import com.commercetools.models.me.MyCartSetCustomShippingMethodAction;
import com.commercetools.models.me.MyCartSetCustomTypeAction;
import com.commercetools.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.me.MyCartSetLineItemCustomFieldAction;
import com.commercetools.models.me.MyCartSetLineItemCustomTypeAction;
import com.commercetools.models.me.MyCartSetLineItemShippingDetailsAction;
import com.commercetools.models.me.MyCartSetLocaleAction;
import com.commercetools.models.me.MyCartSetShippingAddressAction;
import com.commercetools.models.me.MyCartSetShippingMethodAction;
import com.commercetools.models.me.MyCartUpdateItemShippingAddressAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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
public interface MyCartUpdateAction  {


   


}