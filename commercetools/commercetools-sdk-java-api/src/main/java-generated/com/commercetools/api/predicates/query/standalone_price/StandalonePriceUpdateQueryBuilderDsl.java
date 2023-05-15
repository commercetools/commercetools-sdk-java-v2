
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceUpdateQueryBuilderDsl {
    public StandalonePriceUpdateQueryBuilderDsl() {
    }

    public static StandalonePriceUpdateQueryBuilderDsl of() {
        return new StandalonePriceUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StandalonePriceUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StandalonePriceUpdateActionQueryBuilderDsl
                            .of())),
            StandalonePriceUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceUpdateQueryBuilderDsl::of));
    }
}
