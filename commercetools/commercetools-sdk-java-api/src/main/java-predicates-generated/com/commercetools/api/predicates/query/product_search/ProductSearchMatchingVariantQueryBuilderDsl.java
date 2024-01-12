
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchMatchingVariantQueryBuilderDsl {
    public ProductSearchMatchingVariantQueryBuilderDsl() {
    }

    public static ProductSearchMatchingVariantQueryBuilderDsl of() {
        return new ProductSearchMatchingVariantQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSearchMatchingVariantQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchMatchingVariantQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantQueryBuilderDsl::of));
    }

}
