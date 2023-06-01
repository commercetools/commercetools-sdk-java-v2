package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DuplicatePriceKeyErrorQueryBuilderDsl  {
    public DuplicatePriceKeyErrorQueryBuilderDsl() {
    }

    public static DuplicatePriceKeyErrorQueryBuilderDsl of() {
        return new DuplicatePriceKeyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicatePriceKeyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, DuplicatePriceKeyErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicatePriceKeyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, DuplicatePriceKeyErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DuplicatePriceKeyErrorQueryBuilderDsl> conflictingPrice(
        Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("conflictingPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            DuplicatePriceKeyErrorQueryBuilderDsl::of);
    }
    
    
}
