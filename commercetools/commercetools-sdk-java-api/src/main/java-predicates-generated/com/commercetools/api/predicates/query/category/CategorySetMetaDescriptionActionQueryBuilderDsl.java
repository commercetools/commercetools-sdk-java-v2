package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetMetaDescriptionActionQueryBuilderDsl  {
    public CategorySetMetaDescriptionActionQueryBuilderDsl() {
    }

    public static CategorySetMetaDescriptionActionQueryBuilderDsl of() {
        return new CategorySetMetaDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetMetaDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetMetaDescriptionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategorySetMetaDescriptionActionQueryBuilderDsl> metaDescription(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("metaDescription"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySetMetaDescriptionActionQueryBuilderDsl::of);
    }
    
    
}
