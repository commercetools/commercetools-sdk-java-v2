
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdateAction orderUpdateAction = OrderUpdateAction.addDeliveryBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = OrderUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = OrderUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<OrderUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public OrderUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderUpdateAction deepCopy(@Nullable final OrderUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof OrderUpdateActionImpl)) {
            return template.copyDeep();
        }
        OrderUpdateActionImpl instance = new OrderUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderAddDeliveryActionBuilder addDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderAddDeliveryActionBuilder.of();
    }

    /**
     * builder for addItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for addParcelToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder.of();
    }

    /**
     * builder for addPayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.order.OrderAddPaymentActionBuilder.of();
    }

    /**
     * builder for addReturnInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
        return com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder.of();
    }

    /**
     * builder for changeOrderState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
        return com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder.of();
    }

    /**
     * builder for changePaymentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
        return com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder.of();
    }

    /**
     * builder for changeShipmentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
        return com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder.of();
    }

    /**
     * builder for importCustomLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder.of();
    }

    /**
     * builder for importLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder.of();
    }

    /**
     * builder for removeDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder.of();
    }

    /**
     * builder for removeItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for removeParcelFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    /**
     * builder for removePayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.order.OrderRemovePaymentActionBuilder.of();
    }

    /**
     * builder for setBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder.of();
    }

    /**
     * builder for setBillingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setBillingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setBusinessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
        return com.commercetools.api.models.order.OrderSetBusinessUnitActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomerEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder.of();
    }

    /**
     * builder for setCustomerId subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder.of();
    }

    /**
     * builder for setDeliveryAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder.of();
    }

    /**
     * builder for setDeliveryAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setDeliveryAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDeliveryCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder.of();
    }

    /**
     * builder for setDeliveryCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDeliveryItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder.of();
    }

    /**
     * builder for setItemShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setItemShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.order.OrderSetLocaleActionBuilder.of();
    }

    /**
     * builder for setOrderNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
        return com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder.of();
    }

    /**
     * builder for setParcelCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder.of();
    }

    /**
     * builder for setParcelCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder.of();
    }

    /**
     * builder for setParcelItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder.of();
    }

    /**
     * builder for setParcelMeasurements subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder.of();
    }

    /**
     * builder for setParcelTrackingData subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder.of();
    }

    /**
     * builder for setPurchaseOrderNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetPurchaseOrderNumberActionBuilder setPurchaseOrderNumberBuilder() {
        return com.commercetools.api.models.order.OrderSetPurchaseOrderNumberActionBuilder.of();
    }

    /**
     * builder for setReturnInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder.of();
    }

    /**
     * builder for setReturnItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setReturnItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setReturnPaymentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder.of();
    }

    /**
     * builder for setReturnShipmentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder.of();
    }

    /**
     * builder for setShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder.of();
    }

    /**
     * builder for setShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setShippingCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetShippingCustomFieldActionBuilder setShippingCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * builder for setShippingCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetShippingCustomTypeActionBuilder setShippingCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingCustomTypeActionBuilder.of();
    }

    /**
     * builder for setStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderSetStoreActionBuilder setStoreBuilder() {
        return com.commercetools.api.models.order.OrderSetStoreActionBuilder.of();
    }

    /**
     * builder for transitionCustomLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder.of();
    }

    /**
     * builder for transitionLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder.of();
    }

    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionStateActionBuilder.of();
    }

    /**
     * builder for updateItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for updateSyncInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
        return com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderUpdateAction(Function<OrderUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdateAction>";
            }
        };
    }
}
