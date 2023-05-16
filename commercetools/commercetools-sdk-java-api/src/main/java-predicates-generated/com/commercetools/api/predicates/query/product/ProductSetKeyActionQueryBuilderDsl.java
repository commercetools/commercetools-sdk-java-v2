
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetKeyActionQueryBuilderDsl {
    public ProductSetKeyActionQueryBuilderDsl() {
    }

    public static ProductSetKeyActionQueryBuilderDsl of() {
        return new ProductSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSetKeyActionQueryBuilderDsl::of));
    }

}
