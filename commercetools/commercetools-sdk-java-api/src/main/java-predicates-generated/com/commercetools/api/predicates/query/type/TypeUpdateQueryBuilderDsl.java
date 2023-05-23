
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeUpdateQueryBuilderDsl {
    public TypeUpdateQueryBuilderDsl() {
    }

    public static TypeUpdateQueryBuilderDsl of() {
        return new TypeUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<TypeUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, TypeUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.type.TypeUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeUpdateActionQueryBuilderDsl.of())),
            TypeUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TypeUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, TypeUpdateQueryBuilderDsl::of));
    }

}
