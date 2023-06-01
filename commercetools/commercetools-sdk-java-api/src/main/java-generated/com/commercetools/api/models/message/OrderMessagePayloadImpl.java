package com.commercetools.api.models.message;

import com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.DeliveryAddedMessagePayload;
import com.commercetools.api.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayload;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerSetMessagePayload;
import com.commercetools.api.models.message.OrderDeletedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.api.models.message.OrderEditAppliedMessagePayload;
import com.commercetools.api.models.message.OrderImportedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemAddedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayload;
import com.commercetools.api.models.message.OrderLineItemRemovedMessagePayload;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayload;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.api.models.message.OrderStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderStoreSetMessagePayload;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.api.models.message.ReturnInfoAddedMessagePayload;
import com.commercetools.api.models.message.ReturnInfoSetMessagePayload;
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
 * OrderMessagePayload
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderMessagePayloadImpl implements OrderMessagePayload, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderMessagePayloadImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public OrderMessagePayloadImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderMessagePayloadImpl that = (OrderMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
