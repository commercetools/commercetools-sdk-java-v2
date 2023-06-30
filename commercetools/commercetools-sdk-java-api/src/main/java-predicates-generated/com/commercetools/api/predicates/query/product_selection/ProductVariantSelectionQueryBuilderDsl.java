
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantSelectionQueryBuilderDsl {
    public ProductVariantSelectionQueryBuilderDsl() {
    }

    public static ProductVariantSelectionQueryBuilderDsl of() {
        return new ProductVariantSelectionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantSelectionQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantSelectionQueryBuilderDsl> asIncludeAllExcept(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeAllExceptQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeAllExceptQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeAllExceptQueryBuilderDsl
                    .of()),
            ProductVariantSelectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantSelectionQueryBuilderDsl> asIncludeOnly(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeOnlyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeOnlyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionIncludeOnlyQueryBuilderDsl
                    .of()),
            ProductVariantSelectionQueryBuilderDsl::of);
    }
}
