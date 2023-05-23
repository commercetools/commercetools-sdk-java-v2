
package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

@Deprecated
public class ProductVariantSelectionInclusionQueryBuilderDsl {
    public ProductVariantSelectionInclusionQueryBuilderDsl() {
    }

    public static ProductVariantSelectionInclusionQueryBuilderDsl of() {
        return new ProductVariantSelectionInclusionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantSelectionInclusionQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionInclusionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductVariantSelectionInclusionQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionInclusionQueryBuilderDsl::of));
    }

}
