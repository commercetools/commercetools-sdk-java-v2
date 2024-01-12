
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchLongRangeValueQueryBuilderDsl {
    public ProductSearchLongRangeValueQueryBuilderDsl() {
    }

    public static ProductSearchLongRangeValueQueryBuilderDsl of() {
        return new ProductSearchLongRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> gte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> gt() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> lte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchLongRangeValueQueryBuilderDsl> lt() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchLongRangeValueQueryBuilderDsl::of));
    }

}
