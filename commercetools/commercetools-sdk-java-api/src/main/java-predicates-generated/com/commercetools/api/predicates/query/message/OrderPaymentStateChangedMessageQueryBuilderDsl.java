package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPaymentStateChangedMessageQueryBuilderDsl  {
    public OrderPaymentStateChangedMessageQueryBuilderDsl() {
    }

    public static OrderPaymentStateChangedMessageQueryBuilderDsl of() {
        return new OrderPaymentStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPaymentStateChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderPaymentStateChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderPaymentStateChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderPaymentStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPaymentStateChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderPaymentStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPaymentStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderPaymentStateChangedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessageQueryBuilderDsl> oldPaymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPaymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessageQueryBuilderDsl::of));
    }
    
}
