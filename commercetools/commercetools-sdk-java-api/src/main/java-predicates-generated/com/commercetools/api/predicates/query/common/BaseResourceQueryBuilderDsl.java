
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BaseResourceQueryBuilderDsl {
    public BaseResourceQueryBuilderDsl() {
    }

    public static BaseResourceQueryBuilderDsl of() {
        return new BaseResourceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asApprovalFlow(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asApprovalRule(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asAssociateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asAttributeGroup(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asBusinessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCart(
            Function<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCartDiscount(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCategory(
            Function<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCustomObject(
            Function<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asCustomerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asDiscountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asExtension(
            Function<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asInventoryEntry(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asMessage(
            Function<com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asOrder(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asOrderEdit(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asPayment(
            Function<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asProduct(
            Function<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asProductDiscount(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asProductProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asProductSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asProductType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asQuote(
            Function<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asQuoteRequest(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asReview(
            Function<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asShippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asShoppingList(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asStagedQuote(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asState(
            Function<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.state.StateQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asStore(
            Function<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asSubscription(
            Function<com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asTaxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asType(
            Function<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BaseResourceQueryBuilderDsl> asZone(
            Function<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl.of()),
            BaseResourceQueryBuilderDsl::of);
    }
}
