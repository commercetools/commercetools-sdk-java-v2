
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetParcelCustomTypeActionQueryBuilderDsl {
    public OrderSetParcelCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetParcelCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetParcelCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetParcelCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetParcelCustomTypeActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetParcelCustomTypeActionQueryBuilderDsl> parcelKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetParcelCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetParcelCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSetParcelCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetParcelCustomTypeActionQueryBuilderDsl::of);
    }

}
