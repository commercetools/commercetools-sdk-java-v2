package com.commercetools.api.models.message;

import com.commercetools.api.models.message.CategoryCreatedMessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerCreatedMessagePayload;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.DeliveryAddedMessagePayload;
import com.commercetools.api.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload;
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
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayload;
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
import com.commercetools.api.models.message.PaymentCreatedMessagePayload;
import com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload;
import com.commercetools.api.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.models.message.ProductVariantAddedMessagePayload;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.models.message.ReviewStateTransitionMessagePayload;
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
public final class MessagePayloadImpl implements MessagePayload {

    private String type;

    @JsonCreator
    MessagePayloadImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public MessagePayloadImpl() {
    }

    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MessagePayloadImpl that = (MessagePayloadImpl) o;
    
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
