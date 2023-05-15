
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TermFacetResultQueryBuilderDsl {
    public TermFacetResultQueryBuilderDsl() {
    }

    public static TermFacetResultQueryBuilderDsl of() {
        return new TermFacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TermFacetResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TermFacetResultQueryBuilderDsl> dataType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dataType")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TermFacetResultQueryBuilderDsl> missing() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("missing")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TermFacetResultQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TermFacetResultQueryBuilderDsl> other() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("other")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TermFacetResultQueryBuilderDsl> terms(
            Function<com.commercetools.api.predicates.query.product.FacetTermQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.FacetTermQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("terms"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.FacetTermQueryBuilderDsl.of())),
            TermFacetResultQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TermFacetResultQueryBuilderDsl> terms() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("terms")),
            p -> new CombinationQueryPredicate<>(p, TermFacetResultQueryBuilderDsl::of));
    }
}
