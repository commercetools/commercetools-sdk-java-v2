
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderTransitionStateActionQueryBuilderDsl {
    public StagedOrderTransitionStateActionQueryBuilderDsl() {
    }

    public static StagedOrderTransitionStateActionQueryBuilderDsl of() {
        return new StagedOrderTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StagedOrderTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionStateActionQueryBuilderDsl::of));
    }

}
