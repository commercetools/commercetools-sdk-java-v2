
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryDraftQueryBuilderDsl {
    public TaxCategoryDraftQueryBuilderDsl() {
    }

    public static TaxCategoryDraftQueryBuilderDsl of() {
        return new TaxCategoryDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryDraftQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryDraftQueryBuilderDsl> rates(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("rates"))
                .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl.of())),
            TaxCategoryDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TaxCategoryDraftQueryBuilderDsl> rates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rates")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryDraftQueryBuilderDsl::of));
    }

}
