
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchMatchingVariantEntryQueryBuilderDsl {
    public ProductSearchMatchingVariantEntryQueryBuilderDsl() {
    }

    public static ProductSearchMatchingVariantEntryQueryBuilderDsl of() {
        return new ProductSearchMatchingVariantEntryQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSearchMatchingVariantEntryQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantEntryQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchMatchingVariantEntryQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantEntryQueryBuilderDsl::of));
    }

}
