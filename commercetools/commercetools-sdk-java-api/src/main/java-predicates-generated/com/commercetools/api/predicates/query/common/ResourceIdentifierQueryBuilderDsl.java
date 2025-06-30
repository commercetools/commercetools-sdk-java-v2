
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ResourceIdentifierQueryBuilderDsl {
    public ResourceIdentifierQueryBuilderDsl() {
    }

    public static ResourceIdentifierQueryBuilderDsl of() {
        return new ResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asAssociateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asAttributeGroup(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asBusinessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asCartDiscount(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asCart(
            Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asCategory(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asCustomerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asDiscountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.discount_code.DiscountCodeResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asDiscountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asInventoryEntry(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.inventory.InventoryEntryResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asOrderEdit(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asPayment(
            Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asProductDiscount(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asProduct(
            Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asProductSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asProductTailoring(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asProductType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asQuoteRequest(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asQuote(
            Function<com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asReview(
            Function<com.commercetools.api.predicates.query.review.ReviewResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.review.ReviewResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asShippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asShoppingList(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asStagedQuote(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceResourceIdentifierQueryBuilderDsl
                    .of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asState(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asStore(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asTaxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asType(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceIdentifierQueryBuilderDsl> asZone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of()),
            ResourceIdentifierQueryBuilderDsl::of);
    }
}
