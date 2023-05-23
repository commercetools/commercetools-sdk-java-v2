
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderImportLineItemStateActionQueryBuilderDsl {
    public StagedOrderImportLineItemStateActionQueryBuilderDsl() {
    }

    public static StagedOrderImportLineItemStateActionQueryBuilderDsl of() {
        return new StagedOrderImportLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderImportLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderImportLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderImportLineItemStateActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderImportLineItemStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderImportLineItemStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            StagedOrderImportLineItemStateActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderImportLineItemStateActionQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderImportLineItemStateActionQueryBuilderDsl::of));
    }

}
