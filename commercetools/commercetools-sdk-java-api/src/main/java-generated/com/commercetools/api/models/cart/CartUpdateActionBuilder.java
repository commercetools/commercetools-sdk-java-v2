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
import com.commercetools.api.models.cart.CartUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartUpdateActionBuilder {

    public com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
       return com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddCustomShippingMethodActionBuilder addCustomShippingMethodBuilder() {
       return com.commercetools.api.models.cart.CartAddCustomShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
       return com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
       return com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.cart.CartAddLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddPaymentActionBuilder addPaymentBuilder() {
       return com.commercetools.api.models.cart.CartAddPaymentActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddShippingMethodActionBuilder addShippingMethodBuilder() {
       return com.commercetools.api.models.cart.CartAddShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartAddShoppingListActionBuilder addShoppingListBuilder() {
       return com.commercetools.api.models.cart.CartAddShoppingListActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder applyDeltaToCustomLineItemShippingDetailsTargetsBuilder() {
       return com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
       return com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
       return com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeActionBuilder changeCustomLineItemPriceModeBuilder() {
       return com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
       return com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
       return com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder changeTaxModeBuilder() {
       return com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
       return com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartFreezeCartActionBuilder freezeCartBuilder() {
       return com.commercetools.api.models.cart.CartFreezeCartActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRecalculateActionBuilder recalculateBuilder() {
       return com.commercetools.api.models.cart.CartRecalculateActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
       return com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
       return com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
       return com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemovePaymentActionBuilder removePaymentBuilder() {
       return com.commercetools.api.models.cart.CartRemovePaymentActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartRemoveShippingMethodActionBuilder removeShippingMethodBuilder() {
       return com.commercetools.api.models.cart.CartRemoveShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
       return com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder setBillingAddressBuilder() {
       return com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
       return com.commercetools.api.models.cart.CartSetBusinessUnitActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder setCartTotalTaxBuilder() {
       return com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCountryActionBuilder setCountryBuilder() {
       return com.commercetools.api.models.cart.CartSetCountryActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder setCustomerIdBuilder() {
       return com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
       return com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder setDirectDiscountsBuilder() {
       return com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.cart.CartSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
       return com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.cart.CartSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder setShippingAddressBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingCustomFieldActionBuilder setShippingCustomFieldBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingCustomTypeActionBuilder setShippingCustomTypeBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder setShippingMethodBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
       return com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartUnfreezeCartActionBuilder unfreezeCartBuilder() {
       return com.commercetools.api.models.cart.CartUnfreezeCartActionBuilder.of();
    }
    public com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
       return com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * factory method for an instance of CartUpdateActionBuilder
     * @return builder 
     */
    public static CartUpdateActionBuilder of() {
        return new CartUpdateActionBuilder();
    }

}
