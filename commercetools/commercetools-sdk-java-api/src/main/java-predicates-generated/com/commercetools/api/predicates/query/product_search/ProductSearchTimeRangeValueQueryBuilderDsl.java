
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchTimeRangeValueQueryBuilderDsl {
    public ProductSearchTimeRangeValueQueryBuilderDsl() {
    }

    public static ProductSearchTimeRangeValueQueryBuilderDsl of() {
        return new ProductSearchTimeRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> gte() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> gt() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> lte() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<ProductSearchTimeRangeValueQueryBuilderDsl> lt() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchTimeRangeValueQueryBuilderDsl::of));
    }

}
