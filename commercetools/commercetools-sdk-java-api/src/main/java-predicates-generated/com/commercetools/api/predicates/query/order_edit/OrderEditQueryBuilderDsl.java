package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditQueryBuilderDsl  {
    public OrderEditQueryBuilderDsl() {
    }

    public static OrderEditQueryBuilderDsl of() {
        return new OrderEditQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderEditQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderEditQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderEditQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderEditQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> stagedActions(
        Function<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedActions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderEditQueryBuilderDsl> stagedActions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedActions")),
                p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditQueryBuilderDsl> result(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("result"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditResultQueryBuilderDsl.of())),
            OrderEditQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderEditQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
        p -> new CombinationQueryPredicate<>(p, OrderEditQueryBuilderDsl::of));
    }
    
}
