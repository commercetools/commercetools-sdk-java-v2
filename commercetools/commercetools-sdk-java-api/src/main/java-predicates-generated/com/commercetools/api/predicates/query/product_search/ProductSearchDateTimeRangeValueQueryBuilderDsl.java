
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchDateTimeRangeValueQueryBuilderDsl {
    public ProductSearchDateTimeRangeValueQueryBuilderDsl() {
    }

    public static ProductSearchDateTimeRangeValueQueryBuilderDsl of() {
        return new ProductSearchDateTimeRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> gte() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> gt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> lte() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSearchDateTimeRangeValueQueryBuilderDsl> lt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateTimeRangeValueQueryBuilderDsl::of));
    }

}
