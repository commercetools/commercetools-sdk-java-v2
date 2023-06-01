package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetMetaTitleActionQueryBuilderDsl  {
    public CategorySetMetaTitleActionQueryBuilderDsl() {
    }

    public static CategorySetMetaTitleActionQueryBuilderDsl of() {
        return new CategorySetMetaTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetMetaTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetMetaTitleActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategorySetMetaTitleActionQueryBuilderDsl> metaTitle(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("metaTitle"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySetMetaTitleActionQueryBuilderDsl::of);
    }
    
    
}
