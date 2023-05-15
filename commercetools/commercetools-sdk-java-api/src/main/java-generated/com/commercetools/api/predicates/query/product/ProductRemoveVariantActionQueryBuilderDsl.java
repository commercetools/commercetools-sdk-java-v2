
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductRemoveVariantActionQueryBuilderDsl {
    public ProductRemoveVariantActionQueryBuilderDsl() {
    }

    public static ProductRemoveVariantActionQueryBuilderDsl of() {
        return new ProductRemoveVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemoveVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveVariantActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductRemoveVariantActionQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveVariantActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductRemoveVariantActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveVariantActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductRemoveVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveVariantActionQueryBuilderDsl::of));
    }
}
