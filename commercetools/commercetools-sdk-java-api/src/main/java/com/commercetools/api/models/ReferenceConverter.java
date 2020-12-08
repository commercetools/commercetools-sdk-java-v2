package com.commercetools.api.models;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart.CartResourceIdentifierImpl;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifierImpl;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifierImpl;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifierImpl;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierImpl;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifierImpl;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifierImpl;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifierImpl;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifierImpl;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifierImpl;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifierImpl;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifierImpl;
import com.commercetools.api.models.zone.ZoneReference;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifierImpl;

public interface ReferenceConverter {

    static <T extends ResourceIdentifier> T toResourceIdentifier(Reference reference, Class<T> clazz) {
        try {
            T resourceIdentifier = clazz.newInstance();
            resourceIdentifier.setId(reference.getId());
            return resourceIdentifier;
        } catch (InstantiationException | IllegalAccessException ignored) {
        }
        return null;
    }

    static CartResourceIdentifier toResourceIdentifier(CartReference reference) {
        return toResourceIdentifier(reference, CartResourceIdentifierImpl.class);
    }

    static CartDiscountResourceIdentifier toResourceIdentifier(CartDiscountReference reference) {
        return toResourceIdentifier(reference, CartDiscountResourceIdentifierImpl.class);
    }

    static CategoryResourceIdentifier toResourceIdentifier(CategoryReference reference) {
        return toResourceIdentifier(reference, CategoryResourceIdentifierImpl.class);
    }

    static ChannelResourceIdentifier toResourceIdentifier(ChannelReference reference) {
        return toResourceIdentifier(reference, ChannelResourceIdentifierImpl.class);
    }

    static CustomerResourceIdentifier toResourceIdentifier(CustomerReference reference) {
        return toResourceIdentifier(reference, CustomerResourceIdentifierImpl.class);
    }

    static CustomerGroupResourceIdentifier toResourceIdentifier(CustomerGroupReference reference) {
        return toResourceIdentifier(reference, CustomerGroupResourceIdentifierImpl.class);
    }

    static DiscountCodeResourceIdentifier toResourceIdentifier(DiscountCodeReference reference) {
        return toResourceIdentifier(reference, DiscountCodeResourceIdentifierImpl.class);
    }

    static InventoryEntryResourceIdentifier toResourceIdentifier(InventoryEntryReference reference) {
        return toResourceIdentifier(reference, InventoryEntryResourceIdentifierImpl.class);
    }

    static OrderResourceIdentifier toResourceIdentifier(OrderReference reference) {
        return toResourceIdentifier(reference, OrderResourceIdentifierImpl.class);
    }

    static OrderEditResourceIdentifier toResourceIdentifier(OrderEditReference reference) {
        return toResourceIdentifier(reference, OrderEditResourceIdentifierImpl.class);
    }

    static PaymentResourceIdentifier toResourceIdentifier(PaymentReference reference) {
        return toResourceIdentifier(reference, PaymentResourceIdentifierImpl.class);
    }

    static ProductResourceIdentifier toResourceIdentifier(ProductReference reference) {
        return toResourceIdentifier(reference, ProductResourceIdentifierImpl.class);
    }

    static ProductDiscountResourceIdentifier toResourceIdentifier(ProductDiscountReference reference) {
        return toResourceIdentifier(reference, ProductDiscountResourceIdentifierImpl.class);
    }

    static ProductTypeResourceIdentifier toResourceIdentifier(ProductTypeReference reference) {
        return toResourceIdentifier(reference, ProductTypeResourceIdentifierImpl.class);
    }

    static ReviewResourceIdentifier toResourceIdentifier(ReviewReference reference) {
        return toResourceIdentifier(reference, ReviewResourceIdentifierImpl.class);
    }

    static ShippingMethodResourceIdentifier toResourceIdentifier(ShippingMethodReference reference) {
        return toResourceIdentifier(reference, ShippingMethodResourceIdentifierImpl.class);
    }

    static ShoppingListResourceIdentifier toResourceIdentifier(ShoppingListReference reference) {
        return toResourceIdentifier(reference, ShoppingListResourceIdentifierImpl.class);
    }

    static StateResourceIdentifier toResourceIdentifier(StateReference reference) {
        return toResourceIdentifier(reference, StateResourceIdentifierImpl.class);
    }

    static StoreResourceIdentifier toResourceIdentifier(StoreReference reference) {
        return toResourceIdentifier(reference, StoreResourceIdentifierImpl.class);
    }

    static TaxCategoryResourceIdentifier toResourceIdentifier(TaxCategoryReference reference) {
        return toResourceIdentifier(reference, TaxCategoryResourceIdentifierImpl.class);
    }

    static TypeResourceIdentifier toResourceIdentifier(TypeReference reference) {
        return toResourceIdentifier(reference, TypeResourceIdentifierImpl.class);
    }

    static ZoneResourceIdentifier toResourceIdentifier(ZoneReference reference) {
        return toResourceIdentifier(reference, ZoneResourceIdentifierImpl.class);
    }
}
