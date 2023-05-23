
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssignedProductSelectionPagedQueryResponseQueryBuilderDsl {
    public AssignedProductSelectionPagedQueryResponseQueryBuilderDsl() {
    }

    public static AssignedProductSelectionPagedQueryResponseQueryBuilderDsl of() {
        return new AssignedProductSelectionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_selection.AssignedProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.AssignedProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.AssignedProductSelectionQueryBuilderDsl
                            .of())),
            AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AssignedProductSelectionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

}
