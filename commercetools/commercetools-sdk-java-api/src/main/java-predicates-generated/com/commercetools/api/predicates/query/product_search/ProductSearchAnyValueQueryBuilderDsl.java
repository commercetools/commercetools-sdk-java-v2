
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchAnyValueQueryBuilderDsl {
    public ProductSearchAnyValueQueryBuilderDsl() {
    }

    public static ProductSearchAnyValueQueryBuilderDsl of() {
        return new ProductSearchAnyValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSearchAnyValueQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAnyValueQueryBuilderDsl::of));
    }

}
