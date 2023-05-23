
package com.commercetools.api.predicates.query;

import com.commercetools.api.predicates.query.api_client.ApiClientQueryBuilderDsl;
import com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl;
import com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl;
import com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl;
import com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl;
import com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl;
import com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl;
import com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl;
import com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl;
import com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl;
import com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl;
import com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl;
import com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl;
import com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl;
import com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl;
import com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl;
import com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl;
import com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl;
import com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl;
import com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl;
import com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl;
import com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl;
import com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl;
import com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl;
import com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl;
import com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl;
import com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl;
import com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl;
import com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl;
import com.commercetools.api.predicates.query.state.StateQueryBuilderDsl;
import com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl;
import com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl;
import com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl;
import com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl;
import com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl;

public final class QueryPredicateDsl {

    public static CartQueryBuilderDsl cart() {
        return CartQueryBuilderDsl.of();
    }

    public static CategoryQueryBuilderDsl category() {
        return CategoryQueryBuilderDsl.of();
    }

    public static CartDiscountQueryBuilderDsl cartDiscount() {
        return CartDiscountQueryBuilderDsl.of();
    }

    public static CustomerQueryBuilderDsl customer() {
        return CustomerQueryBuilderDsl.of();
    }

    public static DiscountCodeQueryBuilderDsl discountCode() {
        return DiscountCodeQueryBuilderDsl.of();
    }

    public static OrderQueryBuilderDsl order() {
        return OrderQueryBuilderDsl.of();
    }

    public static ProductQueryBuilderDsl product() {
        return ProductQueryBuilderDsl.of();
    }

    public static ProductSelectionQueryBuilderDsl productSelection() {
        return ProductSelectionQueryBuilderDsl.of();
    }

    public static ProductProjectionQueryBuilderDsl productProjection() {
        return ProductProjectionQueryBuilderDsl.of();
    }

    public static InventoryEntryQueryBuilderDsl inventory() {
        return InventoryEntryQueryBuilderDsl.of();
    }

    public static ReviewQueryBuilderDsl review() {
        return ReviewQueryBuilderDsl.of();
    }

    public static AttributeGroupQueryBuilderDsl attributeGroup() {
        return AttributeGroupQueryBuilderDsl.of();
    }

    public static TaxCategoryQueryBuilderDsl taxCategory() {
        return TaxCategoryQueryBuilderDsl.of();
    }

    public static ProductDiscountQueryBuilderDsl productDiscount() {
        return ProductDiscountQueryBuilderDsl.of();
    }

    public static StandalonePriceQueryBuilderDsl standalonePrice() {
        return StandalonePriceQueryBuilderDsl.of();
    }

    public static ShoppingListQueryBuilderDsl shoppingList() {
        return ShoppingListQueryBuilderDsl.of();
    }

    public static ShippingMethodQueryBuilderDsl shippingMethod() {
        return ShippingMethodQueryBuilderDsl.of();
    }

    public static ZoneQueryBuilderDsl zone() {
        return ZoneQueryBuilderDsl.of();
    }

    public static PaymentQueryBuilderDsl payment() {
        return PaymentQueryBuilderDsl.of();
    }

    public static OrderEditQueryBuilderDsl orderEdit() {
        return OrderEditQueryBuilderDsl.of();
    }

    public static QuoteQueryBuilderDsl quote() {
        return QuoteQueryBuilderDsl.of();
    }

    public static StagedQuoteQueryBuilderDsl stagedQuote() {
        return StagedQuoteQueryBuilderDsl.of();
    }

    public static CustomerGroupQueryBuilderDsl customerGroup() {
        return CustomerGroupQueryBuilderDsl.of();
    }

    public static BusinessUnitQueryBuilderDsl businessUnit() {
        return BusinessUnitQueryBuilderDsl.of();
    }

    public static AssociateRoleQueryBuilderDsl associateRole() {
        return AssociateRoleQueryBuilderDsl.of();
    }

    public static ApiClientQueryBuilderDsl apiClient() {
        return ApiClientQueryBuilderDsl.of();
    }

    public static ChannelQueryBuilderDsl channel() {
        return ChannelQueryBuilderDsl.of();
    }

    public static StateQueryBuilderDsl state() {
        return StateQueryBuilderDsl.of();
    }

    public static StoreQueryBuilderDsl store() {
        return StoreQueryBuilderDsl.of();
    }

    public static ProductTypeQueryBuilderDsl productType() {
        return ProductTypeQueryBuilderDsl.of();
    }

    public static TypeQueryBuilderDsl type() {
        return TypeQueryBuilderDsl.of();
    }

    public static CustomObjectQueryBuilderDsl customObject() {
        return CustomObjectQueryBuilderDsl.of();
    }

    public static ExtensionQueryBuilderDsl extension() {
        return ExtensionQueryBuilderDsl.of();
    }

    public static SubscriptionQueryBuilderDsl subscription() {
        return SubscriptionQueryBuilderDsl.of();
    }

    public static MessageQueryBuilderDsl message() {
        return MessageQueryBuilderDsl.of();
    }
}
