package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartAddDiscountCodeAction;
import com.commercetools.models.Me.MyCartAddItemShippingAddressAction;
import com.commercetools.models.Me.MyCartAddLineItemAction;
import com.commercetools.models.Me.MyCartAddPaymentAction;
import com.commercetools.models.Me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.models.Me.MyCartChangeLineItemQuantityAction;
import com.commercetools.models.Me.MyCartChangeTaxModeAction;
import com.commercetools.models.Me.MyCartRecalculateAction;
import com.commercetools.models.Me.MyCartRemoveDiscountCodeAction;
import com.commercetools.models.Me.MyCartRemoveItemShippingAddressAction;
import com.commercetools.models.Me.MyCartRemoveLineItemAction;
import com.commercetools.models.Me.MyCartRemovePaymentAction;
import com.commercetools.models.Me.MyCartSetBillingAddressAction;
import com.commercetools.models.Me.MyCartSetCountryAction;
import com.commercetools.models.Me.MyCartSetCustomFieldAction;
import com.commercetools.models.Me.MyCartSetCustomShippingMethodAction;
import com.commercetools.models.Me.MyCartSetCustomTypeAction;
import com.commercetools.models.Me.MyCartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.Me.MyCartSetLineItemCustomFieldAction;
import com.commercetools.models.Me.MyCartSetLineItemCustomTypeAction;
import com.commercetools.models.Me.MyCartSetLineItemShippingDetailsAction;
import com.commercetools.models.Me.MyCartSetLocaleAction;
import com.commercetools.models.Me.MyCartSetShippingAddressAction;
import com.commercetools.models.Me.MyCartSetShippingMethodAction;
import com.commercetools.models.Me.MyCartUpdateItemShippingAddressAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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