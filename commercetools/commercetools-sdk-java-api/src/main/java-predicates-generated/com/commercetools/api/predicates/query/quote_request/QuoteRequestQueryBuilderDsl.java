
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestQueryBuilderDsl {
    public QuoteRequestQueryBuilderDsl() {
    }

    public static QuoteRequestQueryBuilderDsl of() {
        return new QuoteRequestQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> quoteRequestState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestState")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QuoteRequestQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> customLineItems(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QuoteRequestQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> shippingInfo(
            Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> paymentInfo(
            Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QuoteRequestQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> directDiscounts(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("directDiscounts"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QuoteRequestQueryBuilderDsl> directDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("directDiscounts")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteRequestQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            QuoteRequestQueryBuilderDsl::of);
    }

}
