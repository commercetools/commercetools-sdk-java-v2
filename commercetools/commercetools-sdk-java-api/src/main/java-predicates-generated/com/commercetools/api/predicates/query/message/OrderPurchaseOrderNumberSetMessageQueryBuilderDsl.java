package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPurchaseOrderNumberSetMessageQueryBuilderDsl  {
    public OrderPurchaseOrderNumberSetMessageQueryBuilderDsl() {
    }

    public static OrderPurchaseOrderNumberSetMessageQueryBuilderDsl of() {
        return new OrderPurchaseOrderNumberSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessageQueryBuilderDsl> oldPurchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPurchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }
    
}
