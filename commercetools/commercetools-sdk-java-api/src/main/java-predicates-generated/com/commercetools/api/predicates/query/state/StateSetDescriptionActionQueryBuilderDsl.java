
package com.commercetools.api.predicates.query.state;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StateSetDescriptionActionQueryBuilderDsl {
    public StateSetDescriptionActionQueryBuilderDsl() {
    }

    public static StateSetDescriptionActionQueryBuilderDsl of() {
        return new StateSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StateSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateSetDescriptionActionQueryBuilderDsl::of);
    }

}
