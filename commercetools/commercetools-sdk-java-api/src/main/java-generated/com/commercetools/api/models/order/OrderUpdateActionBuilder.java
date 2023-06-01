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
import com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldAction;
import com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomerEmailAction;
import com.commercetools.api.models.order.OrderSetCustomerIdAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeAction;
import com.commercetools.api.models.order.OrderSetDeliveryCustomFieldAction;
import com.commercetools.api.models.order.OrderSetDeliveryCustomTypeAction;
import com.commercetools.api.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldAction;
import com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetLocaleAction;
import com.commercetools.api.models.order.OrderSetOrderNumberAction;
import com.commercetools.api.models.order.OrderSetParcelCustomFieldAction;
import com.commercetools.api.models.order.OrderSetParcelCustomTypeAction;
import com.commercetools.api.models.order.OrderSetParcelItemsAction;
import com.commercetools.api.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.api.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.api.models.order.OrderSetPurchaseOrderNumberAction;
import com.commercetools.api.models.order.OrderSetReturnInfoAction;
import com.commercetools.api.models.order.OrderSetReturnItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetReturnItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.api.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressAction;
import com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldAction;
import com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeAction;
import com.commercetools.api.models.order.OrderSetStoreAction;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionStateAction;
import com.commercetools.api.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.api.models.order.OrderUpdateSyncInfoAction;
import com.commercetools.api.models.order.OrderUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderUpdateActionBuilder {

    public com.commercetools.api.models.order.OrderAddDeliveryActionBuilder addDeliveryBuilder() {
       return com.commercetools.api.models.order.OrderAddDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
       return com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
       return com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderAddPaymentActionBuilder addPaymentBuilder() {
       return com.commercetools.api.models.order.OrderAddPaymentActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
       return com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
       return com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
       return com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
       return com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
       return com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
       return com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
       return com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
       return com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderRemovePaymentActionBuilder removePaymentBuilder() {
       return com.commercetools.api.models.order.OrderRemovePaymentActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
       return com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
       return com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
       return com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.order.OrderSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
       return com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
       return com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
       return com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
       return com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetPurchaseOrderNumberActionBuilder setPurchaseOrderNumberBuilder() {
       return com.commercetools.api.models.order.OrderSetPurchaseOrderNumberActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
       return com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
       return com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
       return com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
       return com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderSetStoreActionBuilder setStoreBuilder() {
       return com.commercetools.api.models.order.OrderSetStoreActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
       return com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.order.OrderTransitionStateActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
       return com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
       return com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * factory method for an instance of OrderUpdateActionBuilder
     * @return builder 
     */
    public static OrderUpdateActionBuilder of() {
        return new OrderUpdateActionBuilder();
    }

}
