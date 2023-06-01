package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductStateTransitionMessagePayloadQueryBuilderDsl  {
    public ProductStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static ProductStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new ProductStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductStateTransitionMessagePayloadQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ProductStateTransitionMessagePayloadQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, ProductStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    
}
