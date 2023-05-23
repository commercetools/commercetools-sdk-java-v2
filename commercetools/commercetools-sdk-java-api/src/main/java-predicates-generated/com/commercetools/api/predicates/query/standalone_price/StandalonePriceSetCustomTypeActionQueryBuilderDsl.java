
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetCustomTypeActionQueryBuilderDsl {
    public StandalonePriceSetCustomTypeActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetCustomTypeActionQueryBuilderDsl of() {
        return new StandalonePriceSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StandalonePriceSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StandalonePriceSetCustomTypeActionQueryBuilderDsl::of);
    }

}
