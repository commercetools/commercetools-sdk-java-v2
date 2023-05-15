
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAddToCategoryActionQueryBuilderDsl {
    public ProductAddToCategoryActionQueryBuilderDsl() {
    }

    public static ProductAddToCategoryActionQueryBuilderDsl of() {
        return new ProductAddToCategoryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddToCategoryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductAddToCategoryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddToCategoryActionQueryBuilderDsl> category(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("category"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of())),
            ProductAddToCategoryActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductAddToCategoryActionQueryBuilderDsl> orderHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderHint")),
            p -> new CombinationQueryPredicate<>(p, ProductAddToCategoryActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductAddToCategoryActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductAddToCategoryActionQueryBuilderDsl::of));
    }
}
