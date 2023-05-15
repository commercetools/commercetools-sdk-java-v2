
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderExcerptQueryBuilderDsl {
    public OrderExcerptQueryBuilderDsl() {
    }

    public static OrderExcerptQueryBuilderDsl of() {
        return new OrderExcerptQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderExcerptQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            OrderExcerptQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderExcerptQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            OrderExcerptQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderExcerptQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderExcerptQueryBuilderDsl::of));
    }
}
