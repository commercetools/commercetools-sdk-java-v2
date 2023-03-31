
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderMessage orderMessage = OrderMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderMessage extends Message {

    /**
     * factory method to create a deep copy of OrderMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderMessage deepCopy(@Nullable final OrderMessage template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.message.OrderPaymentStateChangedMessage) {
            return com.commercetools.api.models.message.OrderPaymentStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderPaymentStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessage) {
            return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessage) {
            return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShipmentStateChangedMessage) {
            return com.commercetools.api.models.message.OrderShipmentStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderShipmentStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingAddressSetMessage) {
            return com.commercetools.api.models.message.OrderShippingAddressSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderShippingAddressSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingInfoSetMessage) {
            return com.commercetools.api.models.message.OrderShippingInfoSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderShippingInfoSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingRateInputSetMessage) {
            return com.commercetools.api.models.message.OrderShippingRateInputSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderShippingRateInputSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStateChangedMessage) {
            return com.commercetools.api.models.message.OrderStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStateTransitionMessage) {
            return com.commercetools.api.models.message.OrderStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.OrderStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStoreSetMessage) {
            return com.commercetools.api.models.message.OrderStoreSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderStoreSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelAddedToDeliveryMessage) {
            return com.commercetools.api.models.message.ParcelAddedToDeliveryMessage
                    .deepCopy((com.commercetools.api.models.message.ParcelAddedToDeliveryMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelItemsUpdatedMessage) {
            return com.commercetools.api.models.message.ParcelItemsUpdatedMessage
                    .deepCopy((com.commercetools.api.models.message.ParcelItemsUpdatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage) {
            return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage
                    .deepCopy((com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessage) {
            return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessage
                    .deepCopy((com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessage) {
            return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessage
                    .deepCopy((com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReturnInfoAddedMessage) {
            return com.commercetools.api.models.message.ReturnInfoAddedMessage
                    .deepCopy((com.commercetools.api.models.message.ReturnInfoAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReturnInfoSetMessage) {
            return com.commercetools.api.models.message.ReturnInfoSetMessage
                    .deepCopy((com.commercetools.api.models.message.ReturnInfoSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderBillingAddressSetMessage) {
            return com.commercetools.api.models.message.OrderBillingAddressSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderBillingAddressSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemRemovedMessage) {
            return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomLineItemRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerEmailSetMessage) {
            return com.commercetools.api.models.message.OrderCustomerEmailSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerEmailSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessage) {
            return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessage.deepCopy(
                (com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryItemsUpdatedMessage) {
            return com.commercetools.api.models.message.DeliveryItemsUpdatedMessage
                    .deepCopy((com.commercetools.api.models.message.DeliveryItemsUpdatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomLineItemStateTransitionMessage) {
            return com.commercetools.api.models.message.CustomLineItemStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.CustomLineItemStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessage) {
            return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessage) {
            return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessage.deepCopy(
                (com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerGroupSetMessage) {
            return com.commercetools.api.models.message.OrderCustomerGroupSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerGroupSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeAddedMessage) {
            return com.commercetools.api.models.message.OrderDiscountCodeAddedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerSetMessage) {
            return com.commercetools.api.models.message.OrderCustomerSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryAddressSetMessage) {
            return com.commercetools.api.models.message.DeliveryAddressSetMessage
                    .deepCopy((com.commercetools.api.models.message.DeliveryAddressSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDeletedMessage) {
            return com.commercetools.api.models.message.OrderDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemRemovedMessage) {
            return com.commercetools.api.models.message.OrderLineItemRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryRemovedMessage) {
            return com.commercetools.api.models.message.DeliveryRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.DeliveryRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderImportedMessage) {
            return com.commercetools.api.models.message.OrderImportedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderImportedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderEditAppliedMessage) {
            return com.commercetools.api.models.message.OrderEditAppliedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderEditAppliedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeRemovedMessage) {
            return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCreatedMessage) {
            return com.commercetools.api.models.message.OrderCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemAddedMessage) {
            return com.commercetools.api.models.message.OrderLineItemAddedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.LineItemStateTransitionMessage) {
            return com.commercetools.api.models.message.LineItemStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.LineItemStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryAddedMessage) {
            return com.commercetools.api.models.message.DeliveryAddedMessage
                    .deepCopy((com.commercetools.api.models.message.DeliveryAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemAddedMessage) {
            return com.commercetools.api.models.message.OrderCustomLineItemAddedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderCustomLineItemAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeStateSetMessage) {
            return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeStateSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemDiscountSetMessage) {
            return com.commercetools.api.models.message.OrderLineItemDiscountSetMessage
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemDiscountSetMessage) template);
        }
        OrderMessageImpl instance = new OrderMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderMessage(Function<OrderMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderMessage>";
            }
        };
    }
}
