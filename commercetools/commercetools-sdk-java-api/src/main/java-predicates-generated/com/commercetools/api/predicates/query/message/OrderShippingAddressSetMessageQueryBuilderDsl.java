package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderShippingAddressSetMessageQueryBuilderDsl  {
    public OrderShippingAddressSetMessageQueryBuilderDsl() {
    }

    public static OrderShippingAddressSetMessageQueryBuilderDsl of() {
        return new OrderShippingAddressSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderShippingAddressSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderShippingAddressSetMessageQueryBuilderDsl> oldAddress(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    
}
