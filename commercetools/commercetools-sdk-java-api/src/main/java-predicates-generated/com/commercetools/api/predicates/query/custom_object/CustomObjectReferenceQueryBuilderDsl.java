
package com.commercetools.api.predicates.query.custom_object;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomObjectReferenceQueryBuilderDsl {
    public CustomObjectReferenceQueryBuilderDsl() {
    }

    public static CustomObjectReferenceQueryBuilderDsl of() {
        return new CustomObjectReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomObjectReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomObjectReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomObjectReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl.of())),
            CustomObjectReferenceQueryBuilderDsl::of);
    }

}
