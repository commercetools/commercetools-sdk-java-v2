package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderImportCustomLineItemStateActionQueryBuilderDsl  {
    public StagedOrderImportCustomLineItemStateActionQueryBuilderDsl() {
    }

    public static StagedOrderImportCustomLineItemStateActionQueryBuilderDsl of() {
        return new StagedOrderImportCustomLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderImportCustomLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderImportCustomLineItemStateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderImportCustomLineItemStateActionQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            StagedOrderImportCustomLineItemStateActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedOrderImportCustomLineItemStateActionQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
                p -> new CombinationQueryPredicate<>(p, StagedOrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    
}
