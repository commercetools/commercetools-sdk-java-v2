
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchExistsValueQueryBuilderDsl {
    public ProductSearchExistsValueQueryBuilderDsl() {
    }

    public static ProductSearchExistsValueQueryBuilderDsl of() {
        return new ProductSearchExistsValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchExistsValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchExistsValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchExistsValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchExistsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchExistsValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchExistsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchExistsValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchExistsValueQueryBuilderDsl::of));
    }

}
