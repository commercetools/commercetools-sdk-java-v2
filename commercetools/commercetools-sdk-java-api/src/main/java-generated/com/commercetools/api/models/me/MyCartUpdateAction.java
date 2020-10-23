package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartAddDiscountCodeAction;
import com.commercetools.api.models.me.MyCartAddItemShippingAddressAction;
import com.commercetools.api.models.me.MyCartAddLineItemAction;
import com.commercetools.api.models.me.MyCartAddPaymentAction;
import com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.me.MyCartChangeLineItemQuantityAction;
import com.commercetools.api.models.me.MyCartChangeTaxModeAction;
import com.commercetools.api.models.me.MyCartRecalculateAction;
import com.commercetools.api.models.me.MyCartRemoveDiscountCodeAction;
import com.commercetools.api.models.me.MyCartRemoveItemShippingAddressAction;
import com.commercetools.api.models.me.MyCartRemoveLineItemAction;
import com.commercetools.api.models.me.MyCartRemovePaymentAction;
import com.commercetools.api.models.me.MyCartSetBillingAddressAction;
import com.commercetools.api.models.me.MyCartSetCountryAction;
import com.commercetools.api.models.me.MyCartSetCustomFieldAction;
import com.commercetools.api.models.me.MyCartSetCustomShippingMethodAction;
import com.commercetools.api.models.me.MyCartSetCustomTypeAction;
import com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.me.MyCartSetLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction;
import com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction;
import com.commercetools.api.models.me.MyCartSetLocaleAction;
import com.commercetools.api.models.me.MyCartSetShippingAddressAction;
import com.commercetools.api.models.me.MyCartSetShippingMethodAction;
import com.commercetools.api.models.me.MyCartUpdateItemShippingAddressAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionImpl.class, name = "setLineItemDistributionChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = MyCartUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyCartUpdateAction  {





    default <T> T withMyCartUpdateAction(Function<MyCartUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
