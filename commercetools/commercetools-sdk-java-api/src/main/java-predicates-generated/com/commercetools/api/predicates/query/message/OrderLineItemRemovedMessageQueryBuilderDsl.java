package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderLineItemRemovedMessageQueryBuilderDsl  {
    public OrderLineItemRemovedMessageQueryBuilderDsl() {
    }

    public static OrderLineItemRemovedMessageQueryBuilderDsl of() {
        return new OrderLineItemRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> removedQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedQuantity")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> newQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newQuantity")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> newState(
        Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderLineItemRemovedMessageQueryBuilderDsl> newState() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newState")),
                p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> newTotalPrice(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> newTaxedPrice(
        Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newTaxedPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> newPrice(
        Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderLineItemRemovedMessageQueryBuilderDsl> newShippingDetail(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newShippingDetail"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl.of())),
            OrderLineItemRemovedMessageQueryBuilderDsl::of);
    }
    
    
}
