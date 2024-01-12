
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchDateRangeValueQueryBuilderDsl {
    public ProductSearchDateRangeValueQueryBuilderDsl() {
    }

    public static ProductSearchDateRangeValueQueryBuilderDsl of() {
        return new ProductSearchDateRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> gte() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> gt() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> lte() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<ProductSearchDateRangeValueQueryBuilderDsl> lt() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchDateRangeValueQueryBuilderDsl::of));
    }

}
