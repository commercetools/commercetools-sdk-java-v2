
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RangeFacetResultQueryBuilderDsl {
    public RangeFacetResultQueryBuilderDsl() {
    }

    public static RangeFacetResultQueryBuilderDsl of() {
        return new RangeFacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RangeFacetResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RangeFacetResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RangeFacetResultQueryBuilderDsl> ranges(
            Function<com.commercetools.api.predicates.query.product.FacetRangeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.FacetRangeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("ranges"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.FacetRangeQueryBuilderDsl.of())),
            RangeFacetResultQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RangeFacetResultQueryBuilderDsl> ranges() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("ranges")),
            p -> new CombinationQueryPredicate<>(p, RangeFacetResultQueryBuilderDsl::of));
    }

}
