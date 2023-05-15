
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DuplicatePriceScopeErrorQueryBuilderDsl {
    public DuplicatePriceScopeErrorQueryBuilderDsl() {
    }

    public static DuplicatePriceScopeErrorQueryBuilderDsl of() {
        return new DuplicatePriceScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicatePriceScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DuplicatePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicatePriceScopeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DuplicatePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DuplicatePriceScopeErrorQueryBuilderDsl> conflictingPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("conflictingPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            DuplicatePriceScopeErrorQueryBuilderDsl::of);
    }

}
