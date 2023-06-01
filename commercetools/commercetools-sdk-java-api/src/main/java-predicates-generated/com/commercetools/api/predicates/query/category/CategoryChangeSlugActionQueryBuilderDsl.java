package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryChangeSlugActionQueryBuilderDsl  {
    public CategoryChangeSlugActionQueryBuilderDsl() {
    }

    public static CategoryChangeSlugActionQueryBuilderDsl of() {
        return new CategoryChangeSlugActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeSlugActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategoryChangeSlugActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategoryChangeSlugActionQueryBuilderDsl> slug(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("slug"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryChangeSlugActionQueryBuilderDsl::of);
    }
    
    
}
