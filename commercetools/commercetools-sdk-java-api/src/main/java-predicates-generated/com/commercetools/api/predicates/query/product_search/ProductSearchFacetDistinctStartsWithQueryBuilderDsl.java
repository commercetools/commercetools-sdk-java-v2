
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetDistinctStartsWithQueryBuilderDsl {
    public ProductSearchFacetDistinctStartsWithQueryBuilderDsl() {
    }

    public static ProductSearchFacetDistinctStartsWithQueryBuilderDsl of() {
        return new ProductSearchFacetDistinctStartsWithQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctStartsWithQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctStartsWithQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSearchFacetDistinctStartsWithQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctStartsWithQueryBuilderDsl::of));
    }

}
