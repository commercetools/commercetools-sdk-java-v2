
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl {
    public StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl of() {
        return new StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedOrderSetReturnItemCustomTypeActionQueryBuilderDsl::of);
    }

}
