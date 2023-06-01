package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl  {
    public StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl> stagedChanges(
        Function<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedChanges"))
            .inner(fn.apply(com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
