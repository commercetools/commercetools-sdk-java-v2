
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartUpdateActionQueryBuilderDsl {
    public MyCartUpdateActionQueryBuilderDsl() {
    }

    public static MyCartUpdateActionQueryBuilderDsl of() {
        return new MyCartUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asAddDiscountCode(
            Function<com.commercetools.api.predicates.query.me.MyCartAddDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartAddDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartAddDiscountCodeActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asAddItemShippingAddress(
            Function<com.commercetools.api.predicates.query.me.MyCartAddItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartAddItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartAddItemShippingAddressActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asAddLineItem(
            Function<com.commercetools.api.predicates.query.me.MyCartAddLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartAddLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartAddLineItemActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asAddPayment(
            Function<com.commercetools.api.predicates.query.me.MyCartAddPaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartAddPaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartAddPaymentActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asApplyDeltaToLineItemShippingDetailsTargets(
            Function<com.commercetools.api.predicates.query.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl
                    .of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asChangeLineItemQuantity(
            Function<com.commercetools.api.predicates.query.me.MyCartChangeLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartChangeLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartChangeLineItemQuantityActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asChangeLineItemsOrder(
            Function<com.commercetools.api.predicates.query.me.MyCartChangeLineItemsOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartChangeLineItemsOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartChangeLineItemsOrderActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asChangeTaxMode(
            Function<com.commercetools.api.predicates.query.me.MyCartChangeTaxModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartChangeTaxModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartChangeTaxModeActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asRecalculate(
            Function<com.commercetools.api.predicates.query.me.MyCartRecalculateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartRecalculateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartRecalculateActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asRemoveDiscountCode(
            Function<com.commercetools.api.predicates.query.me.MyCartRemoveDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartRemoveDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartRemoveDiscountCodeActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asRemoveItemShippingAddress(
            Function<com.commercetools.api.predicates.query.me.MyCartRemoveItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartRemoveItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyCartRemoveItemShippingAddressActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asRemoveLineItem(
            Function<com.commercetools.api.predicates.query.me.MyCartRemoveLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartRemoveLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartRemoveLineItemActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asRemovePayment(
            Function<com.commercetools.api.predicates.query.me.MyCartRemovePaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartRemovePaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartRemovePaymentActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetBillingAddress(
            Function<com.commercetools.api.predicates.query.me.MyCartSetBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetBillingAddressActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetBusinessUnit(
            Function<com.commercetools.api.predicates.query.me.MyCartSetBusinessUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetBusinessUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetBusinessUnitActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetCountry(
            Function<com.commercetools.api.predicates.query.me.MyCartSetCountryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetCountryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetCountryActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.me.MyCartSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetCustomFieldActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.me.MyCartSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetCustomTypeActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetCustomerEmail(
            Function<com.commercetools.api.predicates.query.me.MyCartSetCustomerEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetCustomerEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetCustomerEmailActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetDeleteDaysAfterLastModification(
            Function<com.commercetools.api.predicates.query.me.MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl
                    .of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomFieldActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetLineItemCustomTypeActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLineItemDistributionChannel(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLineItemDistributionChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLineItemDistributionChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyCartSetLineItemDistributionChannelActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyCartSetLineItemShippingDetailsActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLineItemSupplyChannel(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLineItemSupplyChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLineItemSupplyChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyCartSetLineItemSupplyChannelActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetLocale(
            Function<com.commercetools.api.predicates.query.me.MyCartSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetLocaleActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetShippingAddress(
            Function<com.commercetools.api.predicates.query.me.MyCartSetShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetShippingAddressActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asSetShippingMethod(
            Function<com.commercetools.api.predicates.query.me.MyCartSetShippingMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartSetShippingMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyCartSetShippingMethodActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartUpdateActionQueryBuilderDsl> asUpdateItemShippingAddress(
            Function<com.commercetools.api.predicates.query.me.MyCartUpdateItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartUpdateItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyCartUpdateItemShippingAddressActionQueryBuilderDsl.of()),
            MyCartUpdateActionQueryBuilderDsl::of);
    }
}
