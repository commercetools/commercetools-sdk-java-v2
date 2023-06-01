package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderCustomerSetMessageQueryBuilderDsl  {
    public OrderCustomerSetMessageQueryBuilderDsl() {
    }

    public static OrderCustomerSetMessageQueryBuilderDsl of() {
        return new OrderCustomerSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderCustomerSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> oldCustomer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldCustomer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderCustomerSetMessageQueryBuilderDsl> oldCustomerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldCustomerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessageQueryBuilderDsl::of);
    }
    
    
}
