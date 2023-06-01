package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class FacetRangeQueryBuilderDsl  {
    public FacetRangeQueryBuilderDsl() {
    }

    public static FacetRangeQueryBuilderDsl of() {
        return new FacetRangeQueryBuilderDsl();
    }

    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> from() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("from")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> fromStr() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fromStr")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> to() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("to")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> toStr() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toStr")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> productCount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productCount")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> total() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> min() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("min")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> max() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("max")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<FacetRangeQueryBuilderDsl> mean() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mean")),
        p -> new CombinationQueryPredicate<>(p, FacetRangeQueryBuilderDsl::of));
    }
    
}
