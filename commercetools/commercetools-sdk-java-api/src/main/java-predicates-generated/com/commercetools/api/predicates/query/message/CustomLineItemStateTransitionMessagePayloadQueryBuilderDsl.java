package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl  {
    public CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> transitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitionDate")),
        p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> fromState(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fromState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl> toState(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("toState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
