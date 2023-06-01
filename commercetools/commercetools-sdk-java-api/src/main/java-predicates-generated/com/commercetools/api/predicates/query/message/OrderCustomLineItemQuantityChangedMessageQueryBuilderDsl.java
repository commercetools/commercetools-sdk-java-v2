package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl  {
    public OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl() {
    }

    public static OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl of() {
        return new OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl> oldQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuantity")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl::of));
    }
    
}
