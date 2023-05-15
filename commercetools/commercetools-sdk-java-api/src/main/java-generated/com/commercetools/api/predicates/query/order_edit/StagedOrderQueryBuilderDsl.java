
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderQueryBuilderDsl {
    public StagedOrderQueryBuilderDsl() {
    }

    public static StagedOrderQueryBuilderDsl of() {
        return new StagedOrderQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> completedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("completedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> customLineItems(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> taxedShippingPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedShippingPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> shippingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> shippingCustomFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingCustomFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> shipping(
            Function<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shipping"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> shipping() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> shippingInfo(
            Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> syncInfo(
            Function<com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("syncInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.SyncInfoQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> syncInfo() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("syncInfo")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> returnInfo(
            Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("returnInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> returnInfo() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnInfo")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> discountCodes(
            Function<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountCodes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> discountCodes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodes")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> lastMessageSequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastMessageSequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> quote(
            Function<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("quote"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> paymentInfo(
            Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> origin() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("origin")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderQueryBuilderDsl> refusedGifts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("refusedGifts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of())),
            StagedOrderQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderQueryBuilderDsl> refusedGifts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refusedGifts")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderQueryBuilderDsl::of));
    }
}
