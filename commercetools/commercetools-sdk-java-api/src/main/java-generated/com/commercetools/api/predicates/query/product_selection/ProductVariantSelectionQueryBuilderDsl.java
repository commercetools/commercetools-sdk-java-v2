
package com.commercetools.api.predicates.query.product_selection;

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
}
