
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductLegacySetSkuActionQueryBuilderDsl {
    public ProductLegacySetSkuActionQueryBuilderDsl() {
    }

    public static ProductLegacySetSkuActionQueryBuilderDsl of() {
        return new ProductLegacySetSkuActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductLegacySetSkuActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductLegacySetSkuActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductLegacySetSkuActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductLegacySetSkuActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductLegacySetSkuActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductLegacySetSkuActionQueryBuilderDsl::of));
    }
}
