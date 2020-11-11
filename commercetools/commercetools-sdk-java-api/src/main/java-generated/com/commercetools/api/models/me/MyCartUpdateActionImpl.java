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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartUpdateActionImpl implements MyCartUpdateAction {

    private String action;

    @JsonCreator
    MyCartUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public MyCartUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}
