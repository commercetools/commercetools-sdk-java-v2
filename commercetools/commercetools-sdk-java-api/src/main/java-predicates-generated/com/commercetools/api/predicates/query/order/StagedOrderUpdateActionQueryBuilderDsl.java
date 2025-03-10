
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderUpdateActionQueryBuilderDsl {
    public StagedOrderUpdateActionQueryBuilderDsl() {
    }

    public static StagedOrderUpdateActionQueryBuilderDsl of() {
        return new StagedOrderUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddCustomLineItem(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddCustomLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddCustomLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderAddCustomLineItemActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddDelivery(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderAddDeliveryActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddDiscountCode(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderAddDiscountCodeActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderAddItemShippingAddressActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddLineItem(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderAddLineItemActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddParcelToDelivery(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddParcelToDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddParcelToDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderAddParcelToDeliveryActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddPayment(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddPaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddPaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderAddPaymentActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddReturnInfo(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddReturnInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddReturnInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderAddReturnInfoActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asAddShoppingList(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderAddShoppingListActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderAddShoppingListActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderAddShoppingListActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeCustomLineItemMoney(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeCustomLineItemQuantity(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeLineItemQuantity(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeLineItemQuantityActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeOrderState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeOrderStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeOrderStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeOrderStateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangePaymentState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangePaymentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangePaymentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangePaymentStateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeShipmentState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeShipmentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeShipmentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeShipmentStateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeTaxCalculationMode(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeTaxMode(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxModeActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asChangeTaxRoundingMode(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asImportCustomLineItemState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderImportCustomLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderImportCustomLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderImportCustomLineItemStateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asImportLineItemState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderImportLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderImportLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderImportLineItemStateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveCustomLineItem(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveCustomLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveCustomLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveCustomLineItemActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveDelivery(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDeliveryActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveDiscountCode(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveDiscountCodeActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveLineItem(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveLineItemActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemoveParcelFromDelivery(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asRemovePayment(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderRemovePaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderRemovePaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderRemovePaymentActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetBillingAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetBillingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetBillingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetBusinessUnit(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBusinessUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetBusinessUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetBusinessUnitActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCountry(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCountryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCountryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderSetCountryActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomFieldActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomLineItemTaxAmount(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomLineItemTaxRate(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomShippingMethod(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomShippingMethodActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomTypeActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomerEmail(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerEmailActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomerGroup(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerGroupActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerGroupActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerGroupActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetCustomerId(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetCustomerIdActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryAddressCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryAddressCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDeliveryItems(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryItemsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryItemsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDeliveryItemsActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetDirectDiscounts(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDirectDiscountsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetDirectDiscountsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetDirectDiscountsActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemDistributionChannel(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemPrice(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemPriceActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemTaxAmount(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemTaxRate(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTaxRateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLineItemTotalPrice(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetLocale(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderSetLocaleActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetOrderNumber(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderNumberActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderNumberActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderNumberActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetOrderTotalTax(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderTotalTaxActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderTotalTaxActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetOrderTotalTaxActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetParcelCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetParcelCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelCustomTypeActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetParcelItems(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelItemsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelItemsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelItemsActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetParcelMeasurements(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelMeasurementsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelMeasurementsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelMeasurementsActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetParcelTrackingData(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelTrackingDataActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelTrackingDataActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetParcelTrackingDataActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetPurchaseOrderNumber(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetReturnInfo(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnInfoActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetReturnItemCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetReturnItemCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetReturnPaymentState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnPaymentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnPaymentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnPaymentStateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetReturnShipmentState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnShipmentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnShipmentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetReturnShipmentStateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingAddressAndCustomShippingMethod(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingAddressAndShippingMethod(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomFieldActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingCustomTypeActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingMethod(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingMethodTaxAmount(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingMethodTaxRate(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetShippingRateInput(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingRateInputActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingRateInputActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderSetShippingRateInputActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asSetStore(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderSetStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderSetStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderSetStoreActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asTransitionCustomLineItemState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asTransitionLineItemState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionLineItemStateActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderTransitionStateActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asUpdateItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl
                    .of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderUpdateActionQueryBuilderDsl> asUpdateSyncInfo(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateSyncInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateSyncInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.StagedOrderUpdateSyncInfoActionQueryBuilderDsl.of()),
            StagedOrderUpdateActionQueryBuilderDsl::of);
    }
}
