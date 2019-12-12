package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.generated.models.cart.CartAddDiscountCodeAction;
import com.commercetools.api.generated.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartAddLineItemAction;
import com.commercetools.api.generated.models.cart.CartAddPaymentAction;
import com.commercetools.api.generated.models.cart.CartAddShoppingListAction;
import com.commercetools.api.generated.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.api.generated.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.generated.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.api.generated.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.api.generated.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.api.generated.models.cart.CartRecalculateAction;
import com.commercetools.api.generated.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.api.generated.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.api.generated.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartRemoveLineItemAction;
import com.commercetools.api.generated.models.cart.CartRemovePaymentAction;
import com.commercetools.api.generated.models.cart.CartSetAnonymousIdAction;
import com.commercetools.api.generated.models.cart.CartSetBillingAddressAction;
import com.commercetools.api.generated.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.api.generated.models.cart.CartSetCountryAction;
import com.commercetools.api.generated.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.api.generated.models.cart.CartSetCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerEmailAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerGroupAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerIdAction;
import com.commercetools.api.generated.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemPriceAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.api.generated.models.cart.CartSetLocaleAction;
import com.commercetools.api.generated.models.cart.CartSetShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetShippingRateInputAction;
import com.commercetools.api.generated.models.cart.CartUpdateItemShippingAddressAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartUpdateActionImpl implements CartUpdateAction {

   private String action;

   @JsonCreator
   CartUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}