package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl  {
    public StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl() {
    }

    public static StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl of() {
        return new StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> fromState(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fromState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> toState(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("toState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl> actualTransitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actualTransitionDate")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }
    
}
