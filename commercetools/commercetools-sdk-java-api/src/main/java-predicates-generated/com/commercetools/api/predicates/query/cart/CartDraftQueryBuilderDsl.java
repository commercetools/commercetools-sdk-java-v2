
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDraftQueryBuilderDsl {
    public CartDraftQueryBuilderDsl() {
    }

    public static CartDraftQueryBuilderDsl of() {
        return new CartDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CartDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.cart.LineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDraftQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> customLineItems(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customLineItems"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDraftQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> externalTaxRateForShippingMethod(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRateForShippingMethod"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                            .of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> shippingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMode")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> customShipping(
            Function<com.commercetools.api.predicates.query.cart.CustomShippingDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomShippingDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customShipping"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomShippingDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDraftQueryBuilderDsl> customShipping() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customShipping")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> shipping(
            Function<com.commercetools.api.predicates.query.cart.ShippingDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shipping"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDraftQueryBuilderDsl> shipping() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDraftQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CartDraftQueryBuilderDsl> discountCodes() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodes")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDraftQueryBuilderDsl> origin() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("origin")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartDraftQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, CartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CartDraftQueryBuilderDsl::of);
    }

}
