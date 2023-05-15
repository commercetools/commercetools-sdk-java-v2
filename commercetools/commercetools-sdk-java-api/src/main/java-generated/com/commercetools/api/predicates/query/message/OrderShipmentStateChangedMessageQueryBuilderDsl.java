
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderShipmentStateChangedMessageQueryBuilderDsl {
    public OrderShipmentStateChangedMessageQueryBuilderDsl() {
    }

    public static OrderShipmentStateChangedMessageQueryBuilderDsl of() {
        return new OrderShipmentStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShipmentStateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderShipmentStateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShipmentStateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShipmentStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderShipmentStateChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessageQueryBuilderDsl> oldShipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldShipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessageQueryBuilderDsl::of));
    }
}
