
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class FacetResultQueryBuilderDsl {
    public FacetResultQueryBuilderDsl() {
    }

    public static FacetResultQueryBuilderDsl of() {
        return new FacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FacetResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, FacetResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<FacetResultQueryBuilderDsl> asFilter(
            Function<com.commercetools.api.predicates.query.product.FilteredFacetResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.FilteredFacetResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.FilteredFacetResultQueryBuilderDsl.of()),
            FacetResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<FacetResultQueryBuilderDsl> asRange(
            Function<com.commercetools.api.predicates.query.product.RangeFacetResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.RangeFacetResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.RangeFacetResultQueryBuilderDsl.of()),
            FacetResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<FacetResultQueryBuilderDsl> asTerms(
            Function<com.commercetools.api.predicates.query.product.TermFacetResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.TermFacetResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.TermFacetResultQueryBuilderDsl.of()),
            FacetResultQueryBuilderDsl::of);
    }
}
