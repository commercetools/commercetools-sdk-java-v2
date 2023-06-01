package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryUpdateQueryBuilderDsl  {
    public CategoryUpdateQueryBuilderDsl() {
    }

    public static CategoryUpdateQueryBuilderDsl of() {
        return new CategoryUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CategoryUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CategoryUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategoryUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.category.CategoryUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryUpdateActionQueryBuilderDsl.of())),
            CategoryUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CategoryUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, CategoryUpdateQueryBuilderDsl::of));
    }
    
}
