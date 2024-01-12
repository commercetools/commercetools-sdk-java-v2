
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchSortingQueryBuilderDsl {
    public ProductSearchSortingQueryBuilderDsl() {
    }

    public static ProductSearchSortingQueryBuilderDsl of() {
        return new ProductSearchSortingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> order() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("order")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> attributeType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchSortingQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("filter"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl
                            .of())),
            ProductSearchSortingQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSearchSortingQueryBuilderDsl> internal() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("internal")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchSortingQueryBuilderDsl::of));
    }

}
