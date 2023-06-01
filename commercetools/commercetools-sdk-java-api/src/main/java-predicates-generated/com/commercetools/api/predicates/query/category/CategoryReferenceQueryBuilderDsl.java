package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryReferenceQueryBuilderDsl  {
    public CategoryReferenceQueryBuilderDsl() {
    }

    public static CategoryReferenceQueryBuilderDsl of() {
        return new CategoryReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, CategoryReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategoryReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CategoryReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategoryReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl.of())),
            CategoryReferenceQueryBuilderDsl::of);
    }
    
    
}
