
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductUpdateActionQueryBuilderDsl {
    public ProductUpdateActionQueryBuilderDsl() {
    }

    public static ProductUpdateActionQueryBuilderDsl of() {
        return new ProductUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductUpdateActionQueryBuilderDsl::of));
    }
}
