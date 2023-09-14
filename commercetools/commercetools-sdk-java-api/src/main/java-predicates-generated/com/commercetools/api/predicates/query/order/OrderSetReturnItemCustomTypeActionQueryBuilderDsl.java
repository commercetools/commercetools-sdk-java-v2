
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetReturnItemCustomTypeActionQueryBuilderDsl {
    public OrderSetReturnItemCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetReturnItemCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetReturnItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomTypeActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomTypeActionQueryBuilderDsl> returnItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetReturnItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetReturnItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSetReturnItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetReturnItemCustomTypeActionQueryBuilderDsl::of);
    }

}
