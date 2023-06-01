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
import com.commercetools.api.models.me.MyCartSetBusinessUnitAction;
import com.commercetools.api.models.me.MyCartSetCountryAction;
import com.commercetools.api.models.me.MyCartSetCustomFieldAction;
import com.commercetools.api.models.me.MyCartSetCustomTypeAction;
import com.commercetools.api.models.me.MyCartSetCustomerEmailAction;
import com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.me.MyCartSetLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction;
import com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction;
import com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelAction;
import com.commercetools.api.models.me.MyCartSetLocaleAction;
import com.commercetools.api.models.me.MyCartSetShippingAddressAction;
import com.commercetools.api.models.me.MyCartSetShippingMethodAction;
import com.commercetools.api.models.me.MyCartUpdateItemShippingAddressAction;
import com.commercetools.api.models.me.MyCartUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartUpdateActionBuilder {

    public com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
       return com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
       return com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.me.MyCartAddLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartAddPaymentActionBuilder addPaymentBuilder() {
       return com.commercetools.api.models.me.MyCartAddPaymentActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
       return com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder changeTaxModeBuilder() {
       return com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartRecalculateActionBuilder recalculateBuilder() {
       return com.commercetools.api.models.me.MyCartRecalculateActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
       return com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
       return com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder removePaymentBuilder() {
       return com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder setBillingAddressBuilder() {
       return com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
       return com.commercetools.api.models.me.MyCartSetBusinessUnitActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetCountryActionBuilder setCountryBuilder() {
       return com.commercetools.api.models.me.MyCartSetCountryActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
       return com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
       return com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
       return com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
       return com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.me.MyCartSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder setShippingAddressBuilder() {
       return com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder setShippingMethodBuilder() {
       return com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
       return com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * factory method for an instance of MyCartUpdateActionBuilder
     * @return builder 
     */
    public static MyCartUpdateActionBuilder of() {
        return new MyCartUpdateActionBuilder();
    }

}
