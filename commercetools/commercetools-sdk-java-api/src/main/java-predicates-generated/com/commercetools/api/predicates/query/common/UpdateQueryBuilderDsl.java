
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class UpdateQueryBuilderDsl {
    public UpdateQueryBuilderDsl() {
    }

    public static UpdateQueryBuilderDsl of() {
        return new UpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<UpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, UpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<UpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.common.UpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.UpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.UpdateActionQueryBuilderDsl.of())),
            UpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<UpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, UpdateQueryBuilderDsl::of));
    }

}
