
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultStatsQueryBuilderDsl {
    public ProductSearchFacetResultStatsQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultStatsQueryBuilderDsl of() {
        return new ProductSearchFacetResultStatsQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> min() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("min")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> max() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("max")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> mean() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mean")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> sum() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sum")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchFacetResultStatsQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultStatsQueryBuilderDsl::of));
    }

}
