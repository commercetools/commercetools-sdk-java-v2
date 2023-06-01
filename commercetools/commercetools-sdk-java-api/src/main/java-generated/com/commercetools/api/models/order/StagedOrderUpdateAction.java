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


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * StagedOrderUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderUpdateAction stagedOrderUpdateAction = StagedOrderUpdateAction.addCustomLineItemBuilder()
 *             money(moneyBuilder -> moneyBuilder)
 *             name(nameBuilder -> nameBuilder)
 *             slug("{slug}")
 *             .build()
 * </code></pre>
 * </div> 
 */
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
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberActionImpl.class, name = StagedOrderSetPurchaseOrderNumberAction.SET_PURCHASE_ORDER_NUMBER),
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
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionImpl.class, name = StagedOrderUpdateSyncInfoAction.UPDATE_SYNC_INFO)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = StagedOrderUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = StagedOrderUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StagedOrderUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StagedOrderUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of StagedOrderUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderUpdateAction deepCopy(@Nullable final StagedOrderUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddDeliveryAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddDeliveryAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddDeliveryAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddLineItemAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddLineItemAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddPaymentAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddPaymentAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddPaymentAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderAddShoppingListAction) {
            return com.commercetools.api.models.order_edit.StagedOrderAddShoppingListAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderAddShoppingListAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderRemovePaymentAction) {
            return com.commercetools.api.models.order_edit.StagedOrderRemovePaymentAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderRemovePaymentAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCountryAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCountryAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCountryAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetLocaleAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetLocaleAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetLocaleAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputAction) {
            return com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderTransitionStateAction) {
            return com.commercetools.api.models.order_edit.StagedOrderTransitionStateAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderTransitionStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressAction) {
            return com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoAction) {
            return com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoAction.deepCopy((com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoAction)template);
        }
        StagedOrderUpdateActionImpl instance = new StagedOrderUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addCustomLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder.of();
    }
    /**
     * builder for addDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder addDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder.of();
    }
    /**
     * builder for addDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder.of();
    }
    /**
     * builder for addItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder.of();
    }
    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder.of();
    }
    /**
     * builder for addParcelToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder.of();
    }
    /**
     * builder for addPayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder addPaymentBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder.of();
    }
    /**
     * builder for addReturnInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder.of();
    }
    /**
     * builder for addShoppingList subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder addShoppingListBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder.of();
    }
    /**
     * builder for changeCustomLineItemMoney subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder.of();
    }
    /**
     * builder for changeCustomLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder.of();
    }
    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder.of();
    }
    /**
     * builder for changeOrderState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder.of();
    }
    /**
     * builder for changePaymentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder.of();
    }
    /**
     * builder for changeShipmentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder.of();
    }
    /**
     * builder for changeTaxCalculationMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }
    /**
     * builder for changeTaxMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder changeTaxModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder.of();
    }
    /**
     * builder for changeTaxRoundingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder.of();
    }
    /**
     * builder for importCustomLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder.of();
    }
    /**
     * builder for importLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder.of();
    }
    /**
     * builder for removeCustomLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder.of();
    }
    /**
     * builder for removeDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder.of();
    }
    /**
     * builder for removeDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder.of();
    }
    /**
     * builder for removeItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }
    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder.of();
    }
    /**
     * builder for removeParcelFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }
    /**
     * builder for removePayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder removePaymentBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder.of();
    }
    /**
     * builder for setBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder.of();
    }
    /**
     * builder for setBillingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }
    /**
     * builder for setBillingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder setCountryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }
    /**
     * builder for setCustomLineItemTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder.of();
    }
    /**
     * builder for setCustomLineItemTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }
    /**
     * builder for setCustomShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomerEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder.of();
    }
    /**
     * builder for setCustomerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder.of();
    }
    /**
     * builder for setCustomerId subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder.of();
    }
    /**
     * builder for setDeliveryAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder.of();
    }
    /**
     * builder for setDeliveryAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    /**
     * builder for setDeliveryAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    /**
     * builder for setDeliveryCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }
    /**
     * builder for setDeliveryCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder.of();
    }
    /**
     * builder for setDeliveryItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder.of();
    }
    /**
     * builder for setItemShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    /**
     * builder for setItemShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }
    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder.of();
    }
    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder.of();
    }
    /**
     * builder for setLineItemDistributionChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder.of();
    }
    /**
     * builder for setLineItemPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder.of();
    }
    /**
     * builder for setLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder.of();
    }
    /**
     * builder for setLineItemTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }
    /**
     * builder for setLineItemTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder.of();
    }
    /**
     * builder for setLineItemTotalPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder.of();
    }
    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder.of();
    }
    /**
     * builder for setOrderNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder.of();
    }
    /**
     * builder for setOrderTotalTax subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder setOrderTotalTaxBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder.of();
    }
    /**
     * builder for setParcelCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder.of();
    }
    /**
     * builder for setParcelCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder.of();
    }
    /**
     * builder for setParcelItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder.of();
    }
    /**
     * builder for setParcelMeasurements subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder.of();
    }
    /**
     * builder for setParcelTrackingData subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder.of();
    }
    /**
     * builder for setPurchaseOrderNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberActionBuilder setPurchaseOrderNumberBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberActionBuilder.of();
    }
    /**
     * builder for setReturnInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder.of();
    }
    /**
     * builder for setReturnItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder.of();
    }
    /**
     * builder for setReturnItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder.of();
    }
    /**
     * builder for setReturnPaymentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder.of();
    }
    /**
     * builder for setReturnShipmentState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder.of();
    }
    /**
     * builder for setShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder.of();
    }
    /**
     * builder for setShippingAddressAndCustomShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder setShippingAddressAndCustomShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of();
    }
    /**
     * builder for setShippingAddressAndShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder setShippingAddressAndShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }
    /**
     * builder for setShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder.of();
    }
    /**
     * builder for setShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder.of();
    }
    /**
     * builder for setShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder setShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder.of();
    }
    /**
     * builder for setShippingMethodTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder.of();
    }
    /**
     * builder for setShippingMethodTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder.of();
    }
    /**
     * builder for setShippingRateInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder.of();
    }
    /**
     * builder for transitionCustomLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder.of();
    }
    /**
     * builder for transitionLineItemState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder.of();
    }
    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder.of();
    }
    /**
     * builder for updateItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }
    /**
     * builder for updateSyncInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderUpdateAction(Function<StagedOrderUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderUpdateAction>";
            }
        };
    }
}
