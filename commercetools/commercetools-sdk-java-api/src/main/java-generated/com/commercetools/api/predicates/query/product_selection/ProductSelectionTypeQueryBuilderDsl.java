
package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

@Deprecated
public class ProductSelectionTypeQueryBuilderDsl {
    public ProductSelectionTypeQueryBuilderDsl() {
    }

    public static ProductSelectionTypeQueryBuilderDsl of() {
        return new ProductSelectionTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionTypeQueryBuilderDsl::of));
    }
}
