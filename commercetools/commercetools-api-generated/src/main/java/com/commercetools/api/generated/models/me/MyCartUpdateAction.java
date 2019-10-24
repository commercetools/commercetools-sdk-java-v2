package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartAddDiscountCodeAction;
import com.commercetools.api.generated.models.me.MyCartAddItemShippingAddressAction;
import com.commercetools.api.generated.models.me.MyCartAddLineItemAction;
import com.commercetools.api.generated.models.me.MyCartAddPaymentAction;
import com.commercetools.api.generated.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.generated.models.me.MyCartChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.me.MyCartChangeTaxModeAction;
import com.commercetools.api.generated.models.me.MyCartRecalculateAction;
import com.commercetools.api.generated.models.me.MyCartRemoveDiscountCodeAction;
import com.commercetools.api.generated.models.me.MyCartRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.me.MyCartRemoveLineItemAction;
import com.commercetools.api.generated.models.me.MyCartRemovePaymentAction;
import com.commercetools.api.generated.models.me.MyCartSetBillingAddressAction;
import com.commercetools.api.generated.models.me.MyCartSetCountryAction;
import com.commercetools.api.generated.models.me.MyCartSetCustomFieldAction;
import com.commercetools.api.generated.models.me.MyCartSetCustomShippingMethodAction;
import com.commercetools.api.generated.models.me.MyCartSetCustomTypeAction;
import com.commercetools.api.generated.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.generated.models.me.MyCartSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.me.MyCartSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.me.MyCartSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.me.MyCartSetLocaleAction;
import com.commercetools.api.generated.models.me.MyCartSetShippingAddressAction;
import com.commercetools.api.generated.models.me.MyCartSetShippingMethodAction;
import com.commercetools.api.generated.models.me.MyCartUpdateItemShippingAddressAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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