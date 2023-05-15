
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryQueryBuilderDsl {
    public TaxCategoryQueryBuilderDsl() {
    }

    public static TaxCategoryQueryBuilderDsl of() {
        return new TaxCategoryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            TaxCategoryQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            TaxCategoryQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryQueryBuilderDsl> rates(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("rates"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            TaxCategoryQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TaxCategoryQueryBuilderDsl> rates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rates")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryQueryBuilderDsl::of));
    }
}
