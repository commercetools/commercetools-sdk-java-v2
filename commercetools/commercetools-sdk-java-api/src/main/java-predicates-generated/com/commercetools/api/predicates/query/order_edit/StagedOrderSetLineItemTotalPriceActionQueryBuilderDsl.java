
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl {
    public StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl> externalTotalPrice(
            Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            StagedOrderSetLineItemTotalPriceActionQueryBuilderDsl::of);
    }

}
