
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartQueryBuilderDsl {
    public CartQueryBuilderDsl() {
    }

    public static CartQueryBuilderDsl of() {
        return new CartQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> customLineItems(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartQueryBuilderDsl> totalLineItemQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("totalLineItemQuantity")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> taxedShippingPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedShippingPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> discountOnTotalPrice(
            Function<com.commercetools.api.predicates.query.cart.DiscountOnTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountOnTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountOnTotalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.DiscountOnTotalPriceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> priceRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> cartState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartState")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> shippingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMode")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> shippingInfo(
            Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> shippingCustomFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingCustomFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> shipping(
            Function<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shipping"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> shipping() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> discountCodes(
            Function<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountCodes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.DiscountCodeInfoQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> discountCodes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodes")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> directDiscounts(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("directDiscounts"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> directDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("directDiscounts")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> refusedGifts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("refusedGifts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartQueryBuilderDsl> refusedGifts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refusedGifts")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> paymentInfo(
            Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> origin() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("origin")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> discountTypeCombination(
            Function<com.commercetools.api.predicates.query.cart.DiscountTypeCombinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountTypeCombinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountTypeCombination"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.DiscountTypeCombinationQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> lock(
            Function<com.commercetools.api.predicates.query.cart.CartLockQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartLockQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lock"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartLockQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CartQueryBuilderDsl::of);
    }

}
