
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetPriceModeActionQueryBuilderDsl {
    public ProductSetPriceModeActionQueryBuilderDsl() {
    }

    public static ProductSetPriceModeActionQueryBuilderDsl of() {
        return new ProductSetPriceModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetPriceModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetPriceModeActionQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceModeActionQueryBuilderDsl::of));
    }
}
