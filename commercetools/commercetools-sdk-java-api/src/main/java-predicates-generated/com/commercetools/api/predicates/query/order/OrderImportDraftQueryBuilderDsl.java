package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderImportDraftQueryBuilderDsl  {
    public OrderImportDraftQueryBuilderDsl() {
    }

    public static OrderImportDraftQueryBuilderDsl of() {
        return new OrderImportDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> lineItems(
        Function<com.commercetools.api.predicates.query.order.LineItemImportDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.LineItemImportDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.LineItemImportDraftQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderImportDraftQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
                p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> customLineItems(
        Function<com.commercetools.api.predicates.query.cart.CustomLineItemImportDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemImportDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customLineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemImportDraftQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderImportDraftQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
                p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> totalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> taxedPrice(
        Function<com.commercetools.api.predicates.query.cart.TaxedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceDraftQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> shippingAddress(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> billingAddress(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("billingAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> shippingInfo(
        Function<com.commercetools.api.predicates.query.order.ShippingInfoImportDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ShippingInfoImportDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ShippingInfoImportDraftQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> paymentInfo(
        Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> completedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("completedAt")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> itemShippingAddresses(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderImportDraftQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
                p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> businessUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("businessUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderImportDraftQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            OrderImportDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderImportDraftQueryBuilderDsl> origin() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("origin")),
        p -> new CombinationQueryPredicate<>(p, OrderImportDraftQueryBuilderDsl::of));
    }
    
}
