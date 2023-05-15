
package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionUpdateActionQueryBuilderDsl {
    public ProductSelectionUpdateActionQueryBuilderDsl() {
    }

    public static ProductSelectionUpdateActionQueryBuilderDsl of() {
        return new ProductSelectionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionUpdateActionQueryBuilderDsl::of));
    }
}
