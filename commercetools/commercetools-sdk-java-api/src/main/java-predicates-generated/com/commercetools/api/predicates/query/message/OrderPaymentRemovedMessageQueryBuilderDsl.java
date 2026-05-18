
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderPaymentRemovedMessageQueryBuilderDsl {
    public OrderPaymentRemovedMessageQueryBuilderDsl() {
    }

    public static OrderPaymentRemovedMessageQueryBuilderDsl of() {
        return new OrderPaymentRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderPaymentRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderPaymentRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderPaymentRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderPaymentRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessageQueryBuilderDsl> paymentRef(
            Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentRef"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            OrderPaymentRemovedMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<OrderPaymentRemovedMessageQueryBuilderDsl> removedPaymentInfo() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedPaymentInfo")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessageQueryBuilderDsl::of));
    }

}
