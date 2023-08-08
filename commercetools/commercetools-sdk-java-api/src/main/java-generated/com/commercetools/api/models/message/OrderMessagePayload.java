
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderMessagePayload orderMessagePayload = OrderMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderMessagePayload extends MessagePayload {

    /**
     * factory method to create a deep copy of OrderMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderMessagePayload deepCopy(@Nullable final OrderMessagePayload template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload.deepCopy(
                (com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryAddedMessagePayload) {
            return com.commercetools.api.models.message.DeliveryAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.DeliveryAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryAddressSetMessagePayload) {
            return com.commercetools.api.models.message.DeliveryAddressSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.DeliveryAddressSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload) {
            return com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.DeliveryRemovedMessagePayload) {
            return com.commercetools.api.models.message.DeliveryRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.DeliveryRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.LineItemStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.LineItemStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.LineItemStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload) {
            return com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCreatedMessagePayload) {
            return com.commercetools.api.models.message.OrderCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomTypeSetMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomTypeSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomTypeSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderCustomerSetMessagePayload) {
            return com.commercetools.api.models.message.OrderCustomerSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderCustomerSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDeletedMessagePayload) {
            return com.commercetools.api.models.message.OrderDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload) {
            return com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload) {
            return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload) {
            return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderEditAppliedMessagePayload) {
            return com.commercetools.api.models.message.OrderEditAppliedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderEditAppliedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderImportedMessagePayload) {
            return com.commercetools.api.models.message.OrderImportedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderImportedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemAddedMessagePayload) {
            return com.commercetools.api.models.message.OrderLineItemAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload) {
            return com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayload) {
            return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderLineItemRemovedMessagePayload) {
            return com.commercetools.api.models.message.OrderLineItemRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderLineItemRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayload) {
            return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload) {
            return com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload) {
            return com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload) {
            return com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStateChangedMessagePayload) {
            return com.commercetools.api.models.message.OrderStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.OrderStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderStoreSetMessagePayload) {
            return com.commercetools.api.models.message.OrderStoreSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderStoreSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload) {
            return com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload) {
            return com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload) {
            return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload) {
            return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload) {
            return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReturnInfoAddedMessagePayload) {
            return com.commercetools.api.models.message.ReturnInfoAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ReturnInfoAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReturnInfoSetMessagePayload) {
            return com.commercetools.api.models.message.ReturnInfoSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ReturnInfoSetMessagePayload) template);
        }
        OrderMessagePayloadImpl instance = new OrderMessagePayloadImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderMessagePayload(Function<OrderMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderMessagePayload>";
            }
        };
    }
}
