
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeChangeNameActionQueryBuilderDsl {
    public TypeChangeNameActionQueryBuilderDsl() {
    }

    public static TypeChangeNameActionQueryBuilderDsl of() {
        return new TypeChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeChangeNameActionQueryBuilderDsl::of);
    }

}
