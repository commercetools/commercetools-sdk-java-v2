
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductRemoveFromCategoryActionQueryBuilderDsl {
    public ProductRemoveFromCategoryActionQueryBuilderDsl() {
    }

    public static ProductRemoveFromCategoryActionQueryBuilderDsl of() {
        return new ProductRemoveFromCategoryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemoveFromCategoryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveFromCategoryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductRemoveFromCategoryActionQueryBuilderDsl> category(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("category"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of())),
            ProductRemoveFromCategoryActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductRemoveFromCategoryActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductRemoveFromCategoryActionQueryBuilderDsl::of));
    }

}
