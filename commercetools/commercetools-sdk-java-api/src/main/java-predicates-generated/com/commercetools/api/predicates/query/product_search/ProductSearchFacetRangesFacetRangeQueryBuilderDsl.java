
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetRangesFacetRangeQueryBuilderDsl {
    public ProductSearchFacetRangesFacetRangeQueryBuilderDsl() {
    }

    public static ProductSearchFacetRangesFacetRangeQueryBuilderDsl of() {
        return new ProductSearchFacetRangesFacetRangeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesFacetRangeQueryBuilderDsl> from() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("from")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesFacetRangeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesFacetRangeQueryBuilderDsl> to() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("to")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesFacetRangeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesFacetRangeQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesFacetRangeQueryBuilderDsl::of));
    }

}
