
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

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
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionImpl.class, name = StagedOrderAddCustomLineItemAction.ADD_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionImpl.class, name = StagedOrderAddDeliveryAction.ADD_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionImpl.class, name = StagedOrderAddDiscountCodeAction.ADD_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionImpl.class, name = StagedOrderAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionImpl.class, name = StagedOrderAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionImpl.class, name = StagedOrderAddParcelToDeliveryAction.ADD_PARCEL_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionImpl.class, name = StagedOrderAddPaymentAction.ADD_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionImpl.class, name = StagedOrderAddReturnInfoAction.ADD_RETURN_INFO),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionImpl.class, name = StagedOrderAddShoppingListAction.ADD_SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionImpl.class, name = StagedOrderChangeCustomLineItemMoneyAction.CHANGE_CUSTOM_LINE_ITEM_MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionImpl.class, name = StagedOrderChangeCustomLineItemQuantityAction.CHANGE_CUSTOM_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionImpl.class, name = StagedOrderChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionImpl.class, name = StagedOrderChangeOrderStateAction.CHANGE_ORDER_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionImpl.class, name = StagedOrderChangePaymentStateAction.CHANGE_PAYMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionImpl.class, name = StagedOrderChangeShipmentStateAction.CHANGE_SHIPMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionImpl.class, name = StagedOrderChangeTaxCalculationModeAction.CHANGE_TAX_CALCULATION_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionImpl.class, name = StagedOrderChangeTaxModeAction.CHANGE_TAX_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionImpl.class, name = StagedOrderChangeTaxRoundingModeAction.CHANGE_TAX_ROUNDING_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionImpl.class, name = StagedOrderImportCustomLineItemStateAction.IMPORT_CUSTOM_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionImpl.class, name = StagedOrderImportLineItemStateAction.IMPORT_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionImpl.class, name = StagedOrderRemoveCustomLineItemAction.REMOVE_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionImpl.class, name = StagedOrderRemoveDeliveryAction.REMOVE_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionImpl.class, name = StagedOrderRemoveDiscountCodeAction.REMOVE_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionImpl.class, name = StagedOrderRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionImpl.class, name = StagedOrderRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionImpl.class, name = StagedOrderRemoveParcelFromDeliveryAction.REMOVE_PARCEL_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionImpl.class, name = StagedOrderRemovePaymentAction.REMOVE_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionImpl.class, name = StagedOrderSetBillingAddressAction.SET_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionImpl.class, name = StagedOrderSetBillingAddressCustomFieldAction.SET_BILLING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionImpl.class, name = StagedOrderSetBillingAddressCustomTypeAction.SET_BILLING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCountryActionImpl.class, name = StagedOrderSetCountryAction.SET_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionImpl.class, name = StagedOrderSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionImpl.class, name = StagedOrderSetCustomLineItemCustomFieldAction.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionImpl.class, name = StagedOrderSetCustomLineItemCustomTypeAction.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionImpl.class, name = StagedOrderSetCustomLineItemShippingDetailsAction.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionImpl.class, name = StagedOrderSetCustomLineItemTaxAmountAction.SET_CUSTOM_LINE_ITEM_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionImpl.class, name = StagedOrderSetCustomLineItemTaxRateAction.SET_CUSTOM_LINE_ITEM_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionImpl.class, name = StagedOrderSetCustomShippingMethodAction.SET_CUSTOM_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionImpl.class, name = StagedOrderSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionImpl.class, name = StagedOrderSetCustomerEmailAction.SET_CUSTOMER_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionImpl.class, name = StagedOrderSetCustomerGroupAction.SET_CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionImpl.class, name = StagedOrderSetCustomerIdAction.SET_CUSTOMER_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionImpl.class, name = StagedOrderSetDeliveryAddressAction.SET_DELIVERY_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionImpl.class, name = StagedOrderSetDeliveryAddressCustomFieldAction.SET_DELIVERY_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionImpl.class, name = StagedOrderSetDeliveryAddressCustomTypeAction.SET_DELIVERY_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionImpl.class, name = StagedOrderSetDeliveryCustomFieldAction.SET_DELIVERY_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionImpl.class, name = StagedOrderSetDeliveryCustomTypeAction.SET_DELIVERY_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionImpl.class, name = StagedOrderSetDeliveryItemsAction.SET_DELIVERY_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionImpl.class, name = StagedOrderSetItemShippingAddressCustomFieldAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionImpl.class, name = StagedOrderSetItemShippingAddressCustomTypeAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionImpl.class, name = StagedOrderSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionImpl.class, name = StagedOrderSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionImpl.class, name = StagedOrderSetLineItemDistributionChannelAction.SET_LINE_ITEM_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionImpl.class, name = StagedOrderSetLineItemPriceAction.SET_LINE_ITEM_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionImpl.class, name = StagedOrderSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionImpl.class, name = StagedOrderSetLineItemTaxAmountAction.SET_LINE_ITEM_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionImpl.class, name = StagedOrderSetLineItemTaxRateAction.SET_LINE_ITEM_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionImpl.class, name = StagedOrderSetLineItemTotalPriceAction.SET_LINE_ITEM_TOTAL_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionImpl.class, name = StagedOrderSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionImpl.class, name = StagedOrderSetOrderNumberAction.SET_ORDER_NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionImpl.class, name = StagedOrderSetOrderTotalTaxAction.SET_ORDER_TOTAL_TAX),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionImpl.class, name = StagedOrderSetParcelCustomFieldAction.SET_PARCEL_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionImpl.class, name = StagedOrderSetParcelCustomTypeAction.SET_PARCEL_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionImpl.class, name = StagedOrderSetParcelItemsAction.SET_PARCEL_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionImpl.class, name = StagedOrderSetParcelMeasurementsAction.SET_PARCEL_MEASUREMENTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionImpl.class, name = StagedOrderSetParcelTrackingDataAction.SET_PARCEL_TRACKING_DATA),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionImpl.class, name = StagedOrderSetReturnInfoAction.SET_RETURN_INFO),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionImpl.class, name = StagedOrderSetReturnItemCustomFieldAction.SET_RETURN_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionImpl.class, name = StagedOrderSetReturnItemCustomTypeAction.SET_RETURN_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionImpl.class, name = StagedOrderSetReturnPaymentStateAction.SET_RETURN_PAYMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionImpl.class, name = StagedOrderSetReturnShipmentStateAction.SET_RETURN_SHIPMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionImpl.class, name = StagedOrderSetShippingAddressAction.SET_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class, name = StagedOrderSetShippingAddressAndCustomShippingMethodAction.SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionImpl.class, name = StagedOrderSetShippingAddressAndShippingMethodAction.SET_SHIPPING_ADDRESS_AND_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionImpl.class, name = StagedOrderSetShippingAddressCustomFieldAction.SET_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionImpl.class, name = StagedOrderSetShippingAddressCustomTypeAction.SET_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionImpl.class, name = StagedOrderSetShippingMethodAction.SET_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionImpl.class, name = StagedOrderSetShippingMethodTaxAmountAction.SET_SHIPPING_METHOD_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionImpl.class, name = StagedOrderSetShippingMethodTaxRateAction.SET_SHIPPING_METHOD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionImpl.class, name = StagedOrderSetShippingRateInputAction.SET_SHIPPING_RATE_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionImpl.class, name = StagedOrderTransitionCustomLineItemStateAction.TRANSITION_CUSTOM_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionImpl.class, name = StagedOrderTransitionLineItemStateAction.TRANSITION_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionImpl.class, name = StagedOrderTransitionStateAction.TRANSITION_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionImpl.class, name = StagedOrderUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionImpl.class, name = StagedOrderUpdateSyncInfoAction.UPDATE_SYNC_INFO) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StagedOrderUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StagedOrderUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StagedOrderUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<StagedOrderUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder addDeliveryBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder addShoppingListBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder changeTaxModeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder setCountryBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder setOrderTotalTaxBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder setShippingAddressAndCustomShippingMethodBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder
                .of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder setShippingAddressAndShippingMethodBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder setShippingMethodBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder.of();
    }

    default <T> T withStagedOrderUpdateAction(Function<StagedOrderUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderUpdateAction>";
            }
        };
    }
}
