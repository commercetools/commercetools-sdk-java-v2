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
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderUpdateActionBuilder {

    public com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddCustomLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder addDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder addPaymentBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddPaymentActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder addShoppingListBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderAddShoppingListActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder changeTaxModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder removePaymentBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder setCountryBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCountryActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemShippingDetailsActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder setOrderTotalTaxBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberActionBuilder setPurchaseOrderNumberBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetPurchaseOrderNumberActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnInfoActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder setShippingAddressAndCustomShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder setShippingAddressAndShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder setShippingMethodBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
       return com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * factory method for an instance of StagedOrderUpdateActionBuilder
     * @return builder 
     */
    public static StagedOrderUpdateActionBuilder of() {
        return new StagedOrderUpdateActionBuilder();
    }

}
