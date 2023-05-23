
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderQueryBuilderDsl {
    public OrderQueryBuilderDsl() {
    }

    public static OrderQueryBuilderDsl of() {
        return new OrderQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<OrderQueryBuilderDsl> completedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("completedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> customLineItems(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> taxedShippingPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedShippingPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> shippingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMode")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> shippingCustomFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingCustomFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> shipping(
            Function<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shipping"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> shipping() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> shippingInfo(
            Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> syncInfo(
            Function<com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("syncInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> syncInfo() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("syncInfo")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> returnInfo(
            Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("returnInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> returnInfo() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnInfo")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> discountCodes(
            Function<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountCodes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> discountCodes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodes")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderQueryBuilderDsl> lastMessageSequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastMessageSequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> quote(
            Function<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("quote"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> paymentInfo(
            Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> origin() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("origin")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> refusedGifts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("refusedGifts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of())),
            OrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderQueryBuilderDsl> refusedGifts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refusedGifts")),
            p -> new CombinationQueryPredicate<>(p, OrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderQueryBuilderDsl> asStagedOrder(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl.of()),
            OrderQueryBuilderDsl::of);
    }
}
