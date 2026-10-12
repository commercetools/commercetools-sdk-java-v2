
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AllocationDraftQueryBuilderDsl {
    public AllocationDraftQueryBuilderDsl() {
    }

    public static AllocationDraftQueryBuilderDsl of() {
        return new AllocationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AllocationDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AllocationDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AllocationDraftQueryBuilderDsl> asAbsolute(
            Function<com.commercetools.api.predicates.query.cart.AbsoluteAllocationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.AbsoluteAllocationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.AbsoluteAllocationDraftQueryBuilderDsl.of()),
            AllocationDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AllocationDraftQueryBuilderDsl> asRelative(
            Function<com.commercetools.api.predicates.query.cart.RelativeAllocationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.RelativeAllocationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.RelativeAllocationDraftQueryBuilderDsl.of()),
            AllocationDraftQueryBuilderDsl::of);
    }
}
