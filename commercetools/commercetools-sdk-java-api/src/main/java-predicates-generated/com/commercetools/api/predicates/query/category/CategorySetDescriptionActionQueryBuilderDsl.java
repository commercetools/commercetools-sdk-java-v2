package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetDescriptionActionQueryBuilderDsl  {
    public CategorySetDescriptionActionQueryBuilderDsl() {
    }

    public static CategorySetDescriptionActionQueryBuilderDsl of() {
        return new CategorySetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetDescriptionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategorySetDescriptionActionQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySetDescriptionActionQueryBuilderDsl::of);
    }
    
    
}
