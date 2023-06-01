package com.commercetools.api.models.order;

import com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemAction;
import com.commercetools.api.models.order_edit.StagedOrderAddDeliveryAction;
import com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeAction;
import com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderAddLineItemAction;
import com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryAction;
import com.commercetools.api.models.order_edit.StagedOrderAddPaymentAction;
import com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction;
import com.commercetools.api.models.order_edit.StagedOrderAddShoppingListAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeAction;
import com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateAction;
import com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.models.order_edit.StagedOrderRemovePaymentAction;
import com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCountryAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsAction;
import com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLocaleAction;
import com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberAction;
import com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataAction;
import com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputAction;
import com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateAction;
import com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateAction;
import com.commercetools.api.models.order_edit.StagedOrderTransitionStateAction;
import com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressAction;
import com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoAction;
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
 * StagedOrderUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderUpdateActionImpl implements StagedOrderUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public StagedOrderUpdateActionImpl() {
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
    
        StagedOrderUpdateActionImpl that = (StagedOrderUpdateActionImpl) o;
    
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
