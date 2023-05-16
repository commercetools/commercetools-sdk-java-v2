
package com.commercetools.api.predicates.query.state;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StateSetNameActionQueryBuilderDsl {
    public StateSetNameActionQueryBuilderDsl() {
    }

    public static StateSetNameActionQueryBuilderDsl of() {
        return new StateSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StateSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateSetNameActionQueryBuilderDsl::of);
    }

}
