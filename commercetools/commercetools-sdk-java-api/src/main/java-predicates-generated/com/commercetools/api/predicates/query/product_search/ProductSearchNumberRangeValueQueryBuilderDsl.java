
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchNumberRangeValueQueryBuilderDsl {
    public ProductSearchNumberRangeValueQueryBuilderDsl() {
    }

    public static ProductSearchNumberRangeValueQueryBuilderDsl of() {
        return new ProductSearchNumberRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> gte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> gt() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> lte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchNumberRangeValueQueryBuilderDsl> lt() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNumberRangeValueQueryBuilderDsl::of));
    }

}
