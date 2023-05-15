
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderReturnShipmentStateChangedMessageQueryBuilderDsl {
    public OrderReturnShipmentStateChangedMessageQueryBuilderDsl() {
    }

    public static OrderReturnShipmentStateChangedMessageQueryBuilderDsl of() {
        return new OrderReturnShipmentStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessageQueryBuilderDsl> returnShipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnShipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessageQueryBuilderDsl::of));
    }
}
