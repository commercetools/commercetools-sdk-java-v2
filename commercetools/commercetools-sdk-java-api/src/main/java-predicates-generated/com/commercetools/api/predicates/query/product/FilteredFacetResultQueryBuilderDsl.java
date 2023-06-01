package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class FilteredFacetResultQueryBuilderDsl  {
    public FilteredFacetResultQueryBuilderDsl() {
    }

    public static FilteredFacetResultQueryBuilderDsl of() {
        return new FilteredFacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FilteredFacetResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, FilteredFacetResultQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FilteredFacetResultQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, FilteredFacetResultQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FilteredFacetResultQueryBuilderDsl> productCount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productCount")),
        p -> new CombinationQueryPredicate<>(p, FilteredFacetResultQueryBuilderDsl::of));
    }
    
}
