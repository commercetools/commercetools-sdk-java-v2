
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeReferenceQueryBuilderDsl {
    public TypeReferenceQueryBuilderDsl() {
    }

    public static TypeReferenceQueryBuilderDsl of() {
        return new TypeReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, TypeReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TypeReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl.of())),
            TypeReferenceQueryBuilderDsl::of);
    }

}
