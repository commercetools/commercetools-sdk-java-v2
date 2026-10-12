
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AllocationQueryBuilderDsl {
    public AllocationQueryBuilderDsl() {
    }

    public static AllocationQueryBuilderDsl of() {
        return new AllocationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AllocationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AllocationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AllocationQueryBuilderDsl> asAbsolute(
            Function<com.commercetools.api.predicates.query.cart.AbsoluteAllocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.AbsoluteAllocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.AbsoluteAllocationQueryBuilderDsl.of()),
            AllocationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AllocationQueryBuilderDsl> asRelative(
            Function<com.commercetools.api.predicates.query.cart.RelativeAllocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.RelativeAllocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.RelativeAllocationQueryBuilderDsl.of()),
            AllocationQueryBuilderDsl::of);
    }
}
