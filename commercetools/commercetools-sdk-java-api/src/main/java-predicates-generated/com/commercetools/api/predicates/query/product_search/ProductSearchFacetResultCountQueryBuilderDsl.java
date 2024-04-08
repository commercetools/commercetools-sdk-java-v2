
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultCountQueryBuilderDsl {
    public ProductSearchFacetResultCountQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultCountQueryBuilderDsl of() {
        return new ProductSearchFacetResultCountQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultCountQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultCountQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchFacetResultCountQueryBuilderDsl> value() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultCountQueryBuilderDsl::of));
    }

}
