
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryReferenceQueryBuilderDsl {
    public TaxCategoryReferenceQueryBuilderDsl() {
    }

    public static TaxCategoryReferenceQueryBuilderDsl of() {
        return new TaxCategoryReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("obj"))
                .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl.of())),
            TaxCategoryReferenceQueryBuilderDsl::of);
    }

}
