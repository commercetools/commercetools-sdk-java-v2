
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartRemoveLineItemActionQueryBuilderDsl {
    public MyCartRemoveLineItemActionQueryBuilderDsl() {
    }

    public static MyCartRemoveLineItemActionQueryBuilderDsl of() {
        return new MyCartRemoveLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartRemoveLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartRemoveLineItemActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartRemoveLineItemActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCartRemoveLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartRemoveLineItemActionQueryBuilderDsl> externalPrice(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            MyCartRemoveLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartRemoveLineItemActionQueryBuilderDsl> externalTotalPrice(
            Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            MyCartRemoveLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartRemoveLineItemActionQueryBuilderDsl> shippingDetailsToRemove(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetailsToRemove"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            MyCartRemoveLineItemActionQueryBuilderDsl::of);
    }

}
