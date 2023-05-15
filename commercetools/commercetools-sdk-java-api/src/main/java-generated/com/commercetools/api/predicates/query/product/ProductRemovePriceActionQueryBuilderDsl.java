
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductRemovePriceActionQueryBuilderDsl {
    public ProductRemovePriceActionQueryBuilderDsl() {
    }

    public static ProductRemovePriceActionQueryBuilderDsl of() {
        return new ProductRemovePriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }
}
