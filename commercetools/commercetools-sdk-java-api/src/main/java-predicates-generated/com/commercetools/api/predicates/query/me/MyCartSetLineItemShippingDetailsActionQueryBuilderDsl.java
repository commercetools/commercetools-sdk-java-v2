
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetLineItemShippingDetailsActionQueryBuilderDsl {
    public MyCartSetLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new MyCartSetLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemShippingDetailsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemShippingDetailsActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            MyCartSetLineItemShippingDetailsActionQueryBuilderDsl::of);
    }

}
