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
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddDiscountCodeActionImpl.class, name = MyCartAddDiscountCodeAction.ADD_DISCOUNT_CODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddItemShippingAddressActionImpl.class, name = MyCartAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddLineItemActionImpl.class, name = MyCartAddLineItemAction.ADD_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddPaymentActionImpl.class, name = MyCartAddPaymentAction.ADD_PAYMENT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionImpl.class, name = MyCartChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeTaxModeActionImpl.class, name = MyCartChangeTaxModeAction.CHANGE_TAX_MODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRecalculateActionImpl.class, name = MyCartRecalculateAction.RECALCULATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionImpl.class, name = MyCartRemoveDiscountCodeAction.REMOVE_DISCOUNT_CODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl.class, name = MyCartRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveLineItemActionImpl.class, name = MyCartRemoveLineItemAction.REMOVE_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemovePaymentActionImpl.class, name = MyCartRemovePaymentAction.REMOVE_PAYMENT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetBillingAddressActionImpl.class, name = MyCartSetBillingAddressAction.SET_BILLING_ADDRESS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCountryActionImpl.class, name = MyCartSetCountryAction.SET_COUNTRY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomFieldActionImpl.class, name = MyCartSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomTypeActionImpl.class, name = MyCartSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = MyCartSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionImpl.class, name = MyCartSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionImpl.class, name = MyCartSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionImpl.class, name = MyCartSetLineItemDistributionChannelAction.SET_LINE_ITEM_DISTRIBUTION_CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionImpl.class, name = MyCartSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLocaleActionImpl.class, name = MyCartSetLocaleAction.SET_LOCALE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingAddressActionImpl.class, name = MyCartSetShippingAddressAction.SET_SHIPPING_ADDRESS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingMethodActionImpl.class, name = MyCartSetShippingMethodAction.SET_SHIPPING_METHOD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionImpl.class, name = MyCartUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = MyCartUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyCartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<MyCartUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withMyCartUpdateAction(Function<MyCartUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
