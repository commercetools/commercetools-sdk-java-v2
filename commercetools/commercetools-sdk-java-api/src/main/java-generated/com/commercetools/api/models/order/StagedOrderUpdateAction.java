
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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StagedOrderUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StagedOrderUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StagedOrderUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<StagedOrderUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public StagedOrderUpdateAction copyDeep();

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

        if (!(template instanceof StagedOrderUpdateActionImpl)) {
            return template.copyDeep();
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
     * builder for setBusinessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetBusinessUnitActionBuilder.of();
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
     * builder for setDirectDiscounts subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetDirectDiscountsActionBuilder setDirectDiscountsBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetDirectDiscountsActionBuilder.of();
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
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder
                .of();
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
     * builder for setShippingCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingCustomFieldActionBuilder setShippingCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * builder for setShippingCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetShippingCustomTypeActionBuilder setShippingCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetShippingCustomTypeActionBuilder.of();
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
     * builder for setStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.StagedOrderSetStoreActionBuilder setStoreBuilder() {
        return com.commercetools.api.models.order_edit.StagedOrderSetStoreActionBuilder.of();
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
