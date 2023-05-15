
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceReferenceQueryBuilderDsl {
    public StandalonePriceReferenceQueryBuilderDsl() {
    }

    public static StandalonePriceReferenceQueryBuilderDsl of() {
        return new StandalonePriceReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl.of())),
            StandalonePriceReferenceQueryBuilderDsl::of);
    }

}
