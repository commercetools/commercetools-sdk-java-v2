package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderTransitionLineItemStateActionQueryBuilderDsl  {
    public StagedOrderTransitionLineItemStateActionQueryBuilderDsl() {
    }

    public static StagedOrderTransitionLineItemStateActionQueryBuilderDsl of() {
        return new StagedOrderTransitionLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> fromState(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fromState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> toState(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("toState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<StagedOrderTransitionLineItemStateActionQueryBuilderDsl> actualTransitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actualTransitionDate")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }
    
}
