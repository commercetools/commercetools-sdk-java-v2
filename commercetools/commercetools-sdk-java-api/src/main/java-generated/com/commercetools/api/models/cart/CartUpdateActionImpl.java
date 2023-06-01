package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.models.cart.CartAddCustomShippingMethodAction;
import com.commercetools.api.models.cart.CartAddDiscountCodeAction;
import com.commercetools.api.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import com.commercetools.api.models.cart.CartAddPaymentAction;
import com.commercetools.api.models.cart.CartAddShippingMethodAction;
import com.commercetools.api.models.cart.CartAddShoppingListAction;
import com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.api.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.api.models.cart.CartFreezeCartAction;
import com.commercetools.api.models.cart.CartRecalculateAction;
import com.commercetools.api.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.api.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.api.models.cart.CartRemoveLineItemAction;
import com.commercetools.api.models.cart.CartRemovePaymentAction;
import com.commercetools.api.models.cart.CartRemoveShippingMethodAction;
import com.commercetools.api.models.cart.CartSetAnonymousIdAction;
import com.commercetools.api.models.cart.CartSetBillingAddressAction;
import com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction;
import com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction;
import com.commercetools.api.models.cart.CartSetBusinessUnitAction;
import com.commercetools.api.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.api.models.cart.CartSetCountryAction;
import com.commercetools.api.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.api.models.cart.CartSetCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomerEmailAction;
import com.commercetools.api.models.cart.CartSetCustomerGroupAction;
import com.commercetools.api.models.cart.CartSetCustomerIdAction;
import com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction;
import com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeAction;
import com.commercetools.api.models.cart.CartSetDirectDiscountsAction;
import com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction;
import com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeAction;
import com.commercetools.api.models.cart.CartSetKeyAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction;
import com.commercetools.api.models.cart.CartSetLineItemPriceAction;
import com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetLineItemSupplyChannelAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.api.models.cart.CartSetLocaleAction;
import com.commercetools.api.models.cart.CartSetShippingAddressAction;
import com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction;
import com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeAction;
import com.commercetools.api.models.cart.CartSetShippingCustomFieldAction;
import com.commercetools.api.models.cart.CartSetShippingCustomTypeAction;
import com.commercetools.api.models.cart.CartSetShippingMethodAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.api.models.cart.CartSetShippingRateInputAction;
import com.commercetools.api.models.cart.CartUnfreezeCartAction;
import com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartUpdateActionImpl implements CartUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public CartUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartUpdateActionImpl that = (CartUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
