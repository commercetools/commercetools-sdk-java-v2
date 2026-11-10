
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEstimatedDeliverySetMessageQueryBuilderDsl {
    public OrderEstimatedDeliverySetMessageQueryBuilderDsl() {
    }

    public static OrderEstimatedDeliverySetMessageQueryBuilderDsl of() {
        return new OrderEstimatedDeliverySetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessageQueryBuilderDsl> estimatedDelivery(
            Function<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("estimatedDelivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderEstimatedDeliverySetMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

}
