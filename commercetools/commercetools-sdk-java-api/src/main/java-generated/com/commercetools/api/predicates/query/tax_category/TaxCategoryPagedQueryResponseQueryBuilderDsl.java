
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryPagedQueryResponseQueryBuilderDsl {
    public TaxCategoryPagedQueryResponseQueryBuilderDsl() {
    }

    public static TaxCategoryPagedQueryResponseQueryBuilderDsl of() {
        return new TaxCategoryPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<TaxCategoryPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TaxCategoryPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TaxCategoryPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TaxCategoryPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl.of())),
            TaxCategoryPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TaxCategoryPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryPagedQueryResponseQueryBuilderDsl::of));
    }
}
