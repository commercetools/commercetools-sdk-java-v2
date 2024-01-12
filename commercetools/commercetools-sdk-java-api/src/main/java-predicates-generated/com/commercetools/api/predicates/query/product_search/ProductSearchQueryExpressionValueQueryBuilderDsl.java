
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchQueryExpressionValueQueryBuilderDsl {
    public ProductSearchQueryExpressionValueQueryBuilderDsl() {
    }

    public static ProductSearchQueryExpressionValueQueryBuilderDsl of() {
        return new ProductSearchQueryExpressionValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchQueryExpressionValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ProductSearchQueryExpressionValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchQueryExpressionValueQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchAnyValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchDateRangeValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchDateTimeRangeValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchExistsValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchFullTextValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchLongRangeValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchNumberRangeValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionValueQueryBuilderDsl> asProductSearchTimeRangeValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl.of()),
            ProductSearchQueryExpressionValueQueryBuilderDsl::of);
    }
}
