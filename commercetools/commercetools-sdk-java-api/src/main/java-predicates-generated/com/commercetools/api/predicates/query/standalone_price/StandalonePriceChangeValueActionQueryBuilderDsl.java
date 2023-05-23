
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceChangeValueActionQueryBuilderDsl {
    public StandalonePriceChangeValueActionQueryBuilderDsl() {
    }

    public static StandalonePriceChangeValueActionQueryBuilderDsl of() {
        return new StandalonePriceChangeValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceChangeValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceChangeValueActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceChangeValueActionQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceChangeValueActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StandalonePriceChangeValueActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceChangeValueActionQueryBuilderDsl::of));
    }

}
