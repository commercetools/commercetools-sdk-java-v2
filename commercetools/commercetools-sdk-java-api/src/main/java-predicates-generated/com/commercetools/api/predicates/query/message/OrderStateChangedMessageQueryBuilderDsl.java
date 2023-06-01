package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderStateChangedMessageQueryBuilderDsl  {
    public OrderStateChangedMessageQueryBuilderDsl() {
    }

    public static OrderStateChangedMessageQueryBuilderDsl of() {
        return new OrderStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderStateChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderStateChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderStateChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderStateChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderStateChangedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderStateChangedMessageQueryBuilderDsl> oldOrderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldOrderState")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessageQueryBuilderDsl::of));
    }
    
}
