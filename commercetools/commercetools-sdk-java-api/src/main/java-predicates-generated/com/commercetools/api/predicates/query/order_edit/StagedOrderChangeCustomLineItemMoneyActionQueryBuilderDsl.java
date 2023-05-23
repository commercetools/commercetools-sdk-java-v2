
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl {
    public StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl of() {
        return new StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderChangeCustomLineItemMoneyActionQueryBuilderDsl::of);
    }

}
