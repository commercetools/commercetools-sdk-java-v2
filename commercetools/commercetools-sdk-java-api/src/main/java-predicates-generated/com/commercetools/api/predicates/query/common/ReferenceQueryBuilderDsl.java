
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReferenceQueryBuilderDsl {
    public ReferenceQueryBuilderDsl() {
    }

    public static ReferenceQueryBuilderDsl of() {
        return new ReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asAssociateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asAttributeGroup(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.attribute_group.AttributeGroupReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asBusinessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCartDiscount(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCategory(
            Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asKeyValueDocument(
            Function<com.commercetools.api.predicates.query.custom_object.CustomObjectReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.custom_object.CustomObjectReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.custom_object.CustomObjectReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCustomerEmailToken(
            Function<com.commercetools.api.predicates.query.customer.CustomerEmailTokenReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerEmailTokenReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer.CustomerEmailTokenReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCustomerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCustomerPasswordToken(
            Function<com.commercetools.api.predicates.query.customer.CustomerPasswordTokenReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerPasswordTokenReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.customer.CustomerPasswordTokenReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asDirectDiscount(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asDiscountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asDiscountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.discount_group.DiscountGroupReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asInventoryEntry(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asOrderEdit(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asOrder(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asPaymentMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asPayment(
            Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asProductDiscount(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asProduct(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asProductSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asProductTailoring(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_tailoring.ProductTailoringReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asProductType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asQuote(
            Function<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asQuoteRequest(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asReview(
            Function<com.commercetools.api.predicates.query.review.ReviewReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.review.ReviewReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asShippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asShoppingList(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asStagedQuote(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asStore(
            Function<com.commercetools.api.predicates.query.store.StoreReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asTaxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asType(
            Function<com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReferenceQueryBuilderDsl> asZone(
            Function<com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl.of()),
            ReferenceQueryBuilderDsl::of);
    }
}
