
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryChangeNameActionQueryBuilderDsl {
    public CategoryChangeNameActionQueryBuilderDsl() {
    }

    public static CategoryChangeNameActionQueryBuilderDsl of() {
        return new CategoryChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryChangeNameActionQueryBuilderDsl::of);
    }

}
