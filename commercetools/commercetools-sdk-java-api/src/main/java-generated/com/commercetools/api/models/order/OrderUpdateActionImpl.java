package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderAddDeliveryAction;
import com.commercetools.api.models.order.OrderAddItemShippingAddressAction;
import com.commercetools.api.models.order.OrderAddParcelToDeliveryAction;
import com.commercetools.api.models.order.OrderAddPaymentAction;
import com.commercetools.api.models.order.OrderAddReturnInfoAction;
import com.commercetools.api.models.order.OrderChangeOrderStateAction;
import com.commercetools.api.models.order.OrderChangePaymentStateAction;
import com.commercetools.api.models.order.OrderChangeShipmentStateAction;
import com.commercetools.api.models.order.OrderImportCustomLineItemStateAction;
import com.commercetools.api.models.order.OrderImportLineItemStateAction;
import com.commercetools.api.models.order.OrderRemoveDeliveryAction;
import com.commercetools.api.models.order.OrderRemoveItemShippingAddressAction;
import com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.models.order.OrderRemovePaymentAction;
import com.commercetools.api.models.order.OrderSetBillingAddressAction;
import com.commercetools.api.models.order.OrderSetCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomerEmailAction;
import com.commercetools.api.models.order.OrderSetCustomerIdAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.api.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetLocaleAction;
import com.commercetools.api.models.order.OrderSetOrderNumberAction;
import com.commercetools.api.models.order.OrderSetParcelItemsAction;
import com.commercetools.api.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.api.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.api.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.api.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressAction;
import com.commercetools.api.models.order.OrderSetStoreAction;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionStateAction;
import com.commercetools.api.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.api.models.order.OrderUpdateSyncInfoAction;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderUpdateActionImpl implements OrderUpdateAction {

    private String action;

    @JsonCreator
    OrderUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public OrderUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderUpdateActionImpl that = (OrderUpdateActionImpl) o;
    
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
