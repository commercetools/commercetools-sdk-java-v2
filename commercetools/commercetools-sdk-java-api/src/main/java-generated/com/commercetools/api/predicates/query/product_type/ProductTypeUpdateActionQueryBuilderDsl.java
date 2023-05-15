
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeUpdateActionQueryBuilderDsl {
    public ProductTypeUpdateActionQueryBuilderDsl() {
    }

    public static ProductTypeUpdateActionQueryBuilderDsl of() {
        return new ProductTypeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeUpdateActionQueryBuilderDsl::of));
    }
}
