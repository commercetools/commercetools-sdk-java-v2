
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFullTextValueQueryBuilderDsl {
    public ProductSearchFullTextValueQueryBuilderDsl() {
    }

    public static ProductSearchFullTextValueQueryBuilderDsl of() {
        return new ProductSearchFullTextValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFullTextValueQueryBuilderDsl> mustMatch() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mustMatch")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFullTextValueQueryBuilderDsl::of));
    }

}
