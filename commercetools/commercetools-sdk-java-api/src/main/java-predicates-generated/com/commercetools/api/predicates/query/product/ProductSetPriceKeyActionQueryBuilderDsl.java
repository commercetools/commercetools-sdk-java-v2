
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetPriceKeyActionQueryBuilderDsl {
    public ProductSetPriceKeyActionQueryBuilderDsl() {
    }

    public static ProductSetPriceKeyActionQueryBuilderDsl of() {
        return new ProductSetPriceKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetPriceKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetPriceKeyActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceKeyActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetPriceKeyActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetPriceKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPriceKeyActionQueryBuilderDsl::of));
    }

}
