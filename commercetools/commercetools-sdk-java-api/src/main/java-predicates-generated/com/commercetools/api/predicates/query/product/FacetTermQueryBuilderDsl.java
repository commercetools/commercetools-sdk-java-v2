package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class FacetTermQueryBuilderDsl  {
    public FacetTermQueryBuilderDsl() {
    }

    public static FacetTermQueryBuilderDsl of() {
        return new FacetTermQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FacetTermQueryBuilderDsl> term() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("term")),
        p -> new CombinationQueryPredicate<>(p, FacetTermQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FacetTermQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, FacetTermQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FacetTermQueryBuilderDsl> productCount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productCount")),
        p -> new CombinationQueryPredicate<>(p, FacetTermQueryBuilderDsl::of));
    }
    
}
