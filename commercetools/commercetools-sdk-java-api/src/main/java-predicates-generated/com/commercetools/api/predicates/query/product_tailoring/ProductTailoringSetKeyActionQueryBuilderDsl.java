
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetKeyActionQueryBuilderDsl {
    public ProductTailoringSetKeyActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetKeyActionQueryBuilderDsl of() {
        return new ProductTailoringSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetKeyActionQueryBuilderDsl::of));
    }

}
