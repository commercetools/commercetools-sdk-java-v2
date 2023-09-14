
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartUpdateActionQueryBuilderDsl {
    public CartUpdateActionQueryBuilderDsl() {
    }

    public static CartUpdateActionQueryBuilderDsl of() {
        return new CartUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddCustomLineItem(
            Function<com.commercetools.api.predicates.query.cart.CartAddCustomLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddCustomLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddCustomLineItemActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddCustomShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.CartAddCustomShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddCustomShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddCustomShippingMethodActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddDiscountCode(
            Function<com.commercetools.api.predicates.query.cart.CartAddDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddDiscountCodeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddItemShippingAddress(
            Function<com.commercetools.api.predicates.query.cart.CartAddItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddItemShippingAddressActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddLineItem(
            Function<com.commercetools.api.predicates.query.cart.CartAddLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddLineItemActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddPayment(
            Function<com.commercetools.api.predicates.query.cart.CartAddPaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddPaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddPaymentActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.CartAddShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddShippingMethodActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asAddShoppingList(
            Function<com.commercetools.api.predicates.query.cart.CartAddShoppingListActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartAddShoppingListActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartAddShoppingListActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asApplyDeltaToCustomLineItemShippingDetailsTargets(
            Function<com.commercetools.api.predicates.query.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl
                    .of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asApplyDeltaToLineItemShippingDetailsTargets(
            Function<com.commercetools.api.predicates.query.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl
                    .of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeCustomLineItemMoney(
            Function<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemMoneyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemMoneyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemMoneyActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeCustomLineItemPriceMode(
            Function<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemPriceModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemPriceModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemPriceModeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeCustomLineItemQuantity(
            Function<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartChangeCustomLineItemQuantityActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeLineItemQuantity(
            Function<com.commercetools.api.predicates.query.cart.CartChangeLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartChangeLineItemQuantityActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeTaxCalculationMode(
            Function<com.commercetools.api.predicates.query.cart.CartChangeTaxCalculationModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeTaxCalculationModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartChangeTaxCalculationModeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeTaxMode(
            Function<com.commercetools.api.predicates.query.cart.CartChangeTaxModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeTaxModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartChangeTaxModeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asChangeTaxRoundingMode(
            Function<com.commercetools.api.predicates.query.cart.CartChangeTaxRoundingModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartChangeTaxRoundingModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartChangeTaxRoundingModeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asFreezeCart(
            Function<com.commercetools.api.predicates.query.cart.CartFreezeCartActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartFreezeCartActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartFreezeCartActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRecalculate(
            Function<com.commercetools.api.predicates.query.cart.CartRecalculateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRecalculateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRecalculateActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemoveCustomLineItem(
            Function<com.commercetools.api.predicates.query.cart.CartRemoveCustomLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemoveCustomLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRemoveCustomLineItemActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemoveDiscountCode(
            Function<com.commercetools.api.predicates.query.cart.CartRemoveDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemoveDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRemoveDiscountCodeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemoveItemShippingAddress(
            Function<com.commercetools.api.predicates.query.cart.CartRemoveItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemoveItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartRemoveItemShippingAddressActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemoveLineItem(
            Function<com.commercetools.api.predicates.query.cart.CartRemoveLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemoveLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRemoveLineItemActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemovePayment(
            Function<com.commercetools.api.predicates.query.cart.CartRemovePaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemovePaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRemovePaymentActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asRemoveShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.CartRemoveShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartRemoveShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartRemoveShippingMethodActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetAnonymousId(
            Function<com.commercetools.api.predicates.query.cart.CartSetAnonymousIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetAnonymousIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetAnonymousIdActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetBillingAddress(
            Function<com.commercetools.api.predicates.query.cart.CartSetBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetBillingAddressActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetBillingAddressCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetBillingAddressCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetBillingAddressCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetBusinessUnit(
            Function<com.commercetools.api.predicates.query.cart.CartSetBusinessUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetBusinessUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetBusinessUnitActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCartTotalTax(
            Function<com.commercetools.api.predicates.query.cart.CartSetCartTotalTaxActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCartTotalTaxActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCartTotalTaxActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCountry(
            Function<com.commercetools.api.predicates.query.cart.CartSetCountryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCountryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCountryActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetCustomLineItemCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomLineItemTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxAmountActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomLineItemTaxRate(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetCustomLineItemTaxRateActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomShippingMethodActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomerEmail(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomerEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomerEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomerEmailActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomerGroup(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomerGroupActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomerGroupActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomerGroupActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetCustomerId(
            Function<com.commercetools.api.predicates.query.cart.CartSetCustomerIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetCustomerIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetCustomerIdActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetDeleteDaysAfterLastModification(
            Function<com.commercetools.api.predicates.query.cart.CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl
                    .of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetDirectDiscounts(
            Function<com.commercetools.api.predicates.query.cart.CartSetDirectDiscountsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetDirectDiscountsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetDirectDiscountsActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.cart.CartSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetKeyActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemDistributionChannel(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemDistributionChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemDistributionChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetLineItemDistributionChannelActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemInventoryMode(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemInventoryModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemInventoryModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetLineItemInventoryModeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemPrice(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemPriceActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetLineItemShippingDetailsActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemSupplyChannel(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemSupplyChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemSupplyChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetLineItemSupplyChannelActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemTaxAmountActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemTaxRate(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemTaxRateActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLineItemTotalPrice(
            Function<com.commercetools.api.predicates.query.cart.CartSetLineItemTotalPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLineItemTotalPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLineItemTotalPriceActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetLocale(
            Function<com.commercetools.api.predicates.query.cart.CartSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetLocaleActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingAddress(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetShippingAddressActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetShippingAddressCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingCustomField(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetShippingCustomFieldActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingCustomType(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetShippingCustomTypeActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetShippingMethodActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingMethodTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxAmountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxAmountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxAmountActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingMethodTaxRate(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartSetShippingMethodTaxRateActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asSetShippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.CartSetShippingRateInputActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartSetShippingRateInputActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartSetShippingRateInputActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asUnfreezeCart(
            Function<com.commercetools.api.predicates.query.cart.CartUnfreezeCartActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartUnfreezeCartActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartUnfreezeCartActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartUpdateActionQueryBuilderDsl> asUpdateItemShippingAddress(
            Function<com.commercetools.api.predicates.query.cart.CartUpdateItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartUpdateItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.CartUpdateItemShippingAddressActionQueryBuilderDsl.of()),
            CartUpdateActionQueryBuilderDsl::of);
    }
}
