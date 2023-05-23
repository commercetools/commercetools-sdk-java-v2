
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryChangeParentActionQueryBuilderDsl {
    public CategoryChangeParentActionQueryBuilderDsl() {
    }

    public static CategoryChangeParentActionQueryBuilderDsl of() {
        return new CategoryChangeParentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeParentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeParentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryChangeParentActionQueryBuilderDsl> parent(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parent"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of())),
            CategoryChangeParentActionQueryBuilderDsl::of);
    }

}
