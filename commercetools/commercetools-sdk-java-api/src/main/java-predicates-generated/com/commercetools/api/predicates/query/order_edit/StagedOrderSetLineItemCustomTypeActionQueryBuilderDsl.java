
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl {
    public StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedOrderSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }

}
