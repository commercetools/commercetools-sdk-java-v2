
package com.commercetools.api.models;

import java.lang.reflect.InvocationTargetException;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.ReferenceBuilder;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.common.ResourceIdentifierBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneReference;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;

public interface ReferenceConverter {

    static <T extends ResourceIdentifier> T toResourceIdentifier(Identifiable<?> reference, Class<T> clazz) {
        try {
            T resourceIdentifier = clazz.getDeclaredConstructor().newInstance();
            resourceIdentifier.setId(reference.getId());
            return resourceIdentifier;
        }
        catch (InstantiationException | IllegalAccessException | NoSuchMethodException
                | InvocationTargetException ignored) {
        }
        return null;
    }

    static CartResourceIdentifier toResourceIdentifier(CartReference reference) {
        return ResourceIdentifierBuilder.of().cartBuilder().id(reference.getId()).build();
    }

    static CartDiscountResourceIdentifier toResourceIdentifier(CartDiscountReference reference) {
        return ResourceIdentifierBuilder.of().cartDiscountBuilder().id(reference.getId()).build();
    }

    static CategoryResourceIdentifier toResourceIdentifier(CategoryReference reference) {
        return ResourceIdentifierBuilder.of().categoryBuilder().id(reference.getId()).build();
    }

    static ChannelResourceIdentifier toResourceIdentifier(ChannelReference reference) {
        return ResourceIdentifierBuilder.of().channelBuilder().id(reference.getId()).build();
    }

    static CustomerResourceIdentifier toResourceIdentifier(CustomerReference reference) {
        return ResourceIdentifierBuilder.of().customerBuilder().id(reference.getId()).build();
    }

    static CustomerGroupResourceIdentifier toResourceIdentifier(CustomerGroupReference reference) {
        return ResourceIdentifierBuilder.of().customerGroupBuilder().id(reference.getId()).build();
    }

    static DiscountCodeResourceIdentifier toResourceIdentifier(DiscountCodeReference reference) {
        return ResourceIdentifierBuilder.of().discountCodeBuilder().id(reference.getId()).build();
    }

    static InventoryEntryResourceIdentifier toResourceIdentifier(InventoryEntryReference reference) {
        return ResourceIdentifierBuilder.of().inventoryEntryBuilder().id(reference.getId()).build();
    }

    static OrderResourceIdentifier toResourceIdentifier(OrderReference reference) {
        return ResourceIdentifierBuilder.of().orderBuilder().id(reference.getId()).build();
    }

    static OrderEditResourceIdentifier toResourceIdentifier(OrderEditReference reference) {
        return ResourceIdentifierBuilder.of().orderEditBuilder().id(reference.getId()).build();
    }

    static PaymentResourceIdentifier toResourceIdentifier(PaymentReference reference) {
        return ResourceIdentifierBuilder.of().paymentBuilder().id(reference.getId()).build();
    }

    static ProductResourceIdentifier toResourceIdentifier(ProductReference reference) {
        return ResourceIdentifierBuilder.of().productBuilder().id(reference.getId()).build();
    }

    static ProductDiscountResourceIdentifier toResourceIdentifier(ProductDiscountReference reference) {
        return ResourceIdentifierBuilder.of().productDiscountBuilder().id(reference.getId()).build();
    }

    static ProductTypeResourceIdentifier toResourceIdentifier(ProductTypeReference reference) {
        return ResourceIdentifierBuilder.of().productTypeBuilder().id(reference.getId()).build();
    }

    static ReviewResourceIdentifier toResourceIdentifier(ReviewReference reference) {
        return ResourceIdentifierBuilder.of().reviewBuilder().id(reference.getId()).build();
    }

    static ShippingMethodResourceIdentifier toResourceIdentifier(ShippingMethodReference reference) {
        return ResourceIdentifierBuilder.of().shippingMethodBuilder().id(reference.getId()).build();
    }

    static ShoppingListResourceIdentifier toResourceIdentifier(ShoppingListReference reference) {
        return ResourceIdentifierBuilder.of().shoppingListBuilder().id(reference.getId()).build();
    }

    static StateResourceIdentifier toResourceIdentifier(StateReference reference) {
        return ResourceIdentifierBuilder.of().stateBuilder().id(reference.getId()).build();
    }

    static StoreResourceIdentifier toResourceIdentifier(StoreReference reference) {
        return ResourceIdentifierBuilder.of().storeBuilder().id(reference.getId()).build();
    }

    static StoreResourceIdentifier toResourceIdentifier(StoreKeyReference reference) {
        return ResourceIdentifierBuilder.of().storeBuilder().key(reference.getKey()).build();
    }

    static TaxCategoryResourceIdentifier toResourceIdentifier(TaxCategoryReference reference) {
        return ResourceIdentifierBuilder.of().taxCategoryBuilder().id(reference.getId()).build();
    }

    static TypeResourceIdentifier toResourceIdentifier(TypeReference reference) {
        return ResourceIdentifierBuilder.of().typeBuilder().id(reference.getId()).build();
    }

    static ZoneResourceIdentifier toResourceIdentifier(ZoneReference reference) {
        return ResourceIdentifierBuilder.of().zoneBuilder().id(reference.getId()).build();
    }

    static CartResourceIdentifier toResourceIdentifier(Cart reference) {
        return ResourceIdentifierBuilder.of().cartBuilder().id(reference.getId()).build();
    }

    static CartDiscountResourceIdentifier toResourceIdentifier(CartDiscount reference) {
        return ResourceIdentifierBuilder.of().cartDiscountBuilder().id(reference.getId()).build();
    }

    static CategoryResourceIdentifier toResourceIdentifier(Category reference) {
        return ResourceIdentifierBuilder.of().categoryBuilder().id(reference.getId()).build();
    }

    static ChannelResourceIdentifier toResourceIdentifier(Channel reference) {
        return ResourceIdentifierBuilder.of().channelBuilder().id(reference.getId()).build();
    }

    static CustomerResourceIdentifier toResourceIdentifier(Customer reference) {
        return ResourceIdentifierBuilder.of().customerBuilder().id(reference.getId()).build();
    }

    static CustomerGroupResourceIdentifier toResourceIdentifier(CustomerGroup reference) {
        return ResourceIdentifierBuilder.of().customerGroupBuilder().id(reference.getId()).build();
    }

    static DiscountCodeResourceIdentifier toResourceIdentifier(DiscountCode reference) {
        return ResourceIdentifierBuilder.of().discountCodeBuilder().id(reference.getId()).build();
    }

    static InventoryEntryResourceIdentifier toResourceIdentifier(InventoryEntry reference) {
        return ResourceIdentifierBuilder.of().inventoryEntryBuilder().id(reference.getId()).build();
    }

    static OrderResourceIdentifier toResourceIdentifier(Order reference) {
        return ResourceIdentifierBuilder.of().orderBuilder().id(reference.getId()).build();
    }

    static OrderEditResourceIdentifier toResourceIdentifier(OrderEdit reference) {
        return ResourceIdentifierBuilder.of().orderEditBuilder().id(reference.getId()).build();
    }

    static PaymentResourceIdentifier toResourceIdentifier(Payment reference) {
        return ResourceIdentifierBuilder.of().paymentBuilder().id(reference.getId()).build();
    }

    static ProductResourceIdentifier toResourceIdentifier(Product reference) {
        return ResourceIdentifierBuilder.of().productBuilder().id(reference.getId()).build();
    }

    static ProductDiscountResourceIdentifier toResourceIdentifier(ProductDiscount reference) {
        return ResourceIdentifierBuilder.of().productDiscountBuilder().id(reference.getId()).build();
    }

    static ProductTypeResourceIdentifier toResourceIdentifier(ProductType reference) {
        return ResourceIdentifierBuilder.of().productTypeBuilder().id(reference.getId()).build();
    }

    static ReviewResourceIdentifier toResourceIdentifier(Review reference) {
        return ResourceIdentifierBuilder.of().reviewBuilder().id(reference.getId()).build();
    }

    static ShippingMethodResourceIdentifier toResourceIdentifier(ShippingMethod reference) {
        return ResourceIdentifierBuilder.of().shippingMethodBuilder().id(reference.getId()).build();
    }

    static ShoppingListResourceIdentifier toResourceIdentifier(ShoppingList reference) {
        return ResourceIdentifierBuilder.of().shoppingListBuilder().id(reference.getId()).build();
    }

    static StateResourceIdentifier toResourceIdentifier(State reference) {
        return ResourceIdentifierBuilder.of().stateBuilder().id(reference.getId()).build();
    }

    static StoreResourceIdentifier toResourceIdentifier(Store reference) {
        return ResourceIdentifierBuilder.of().storeBuilder().id(reference.getId()).build();
    }

    static TaxCategoryResourceIdentifier toResourceIdentifier(TaxCategory reference) {
        return ResourceIdentifierBuilder.of().taxCategoryBuilder().id(reference.getId()).build();
    }

    static TypeResourceIdentifier toResourceIdentifier(Type reference) {
        return ResourceIdentifierBuilder.of().typeBuilder().id(reference.getId()).build();
    }

    static ZoneResourceIdentifier toResourceIdentifier(Zone reference) {
        return ResourceIdentifierBuilder.of().zoneBuilder().id(reference.getId()).build();
    }

    static CartReference toReference(Cart reference) {
        return ReferenceBuilder.of().cartBuilder().id(reference.getId()).build();
    }

    static CartDiscountReference toReference(CartDiscount reference) {
        return ReferenceBuilder.of().cartDiscountBuilder().id(reference.getId()).build();
    }

    static CategoryReference toReference(Category reference) {
        return ReferenceBuilder.of().categoryBuilder().id(reference.getId()).build();
    }

    static ChannelReference toReference(Channel reference) {
        return ReferenceBuilder.of().channelBuilder().id(reference.getId()).build();
    }

    static CustomerReference toReference(Customer reference) {
        return ReferenceBuilder.of().customerBuilder().id(reference.getId()).build();
    }

    static CustomerGroupReference toReference(CustomerGroup reference) {
        return ReferenceBuilder.of().customerGroupBuilder().id(reference.getId()).build();
    }

    static DiscountCodeReference toReference(DiscountCode reference) {
        return ReferenceBuilder.of().discountCodeBuilder().id(reference.getId()).build();
    }

    static InventoryEntryReference toReference(InventoryEntry reference) {
        return ReferenceBuilder.of().inventoryEntryBuilder().id(reference.getId()).build();
    }

    static OrderReference toReference(Order reference) {
        return ReferenceBuilder.of().orderBuilder().id(reference.getId()).build();
    }

    static OrderEditReference toReference(OrderEdit reference) {
        return ReferenceBuilder.of().orderEditBuilder().id(reference.getId()).build();
    }

    static PaymentReference toReference(Payment reference) {
        return ReferenceBuilder.of().paymentBuilder().id(reference.getId()).build();
    }

    static ProductReference toReference(Product reference) {
        return ReferenceBuilder.of().productBuilder().id(reference.getId()).build();
    }

    static ProductDiscountReference toReference(ProductDiscount reference) {
        return ReferenceBuilder.of().productDiscountBuilder().id(reference.getId()).build();
    }

    static ProductTypeReference toReference(ProductType reference) {
        return ReferenceBuilder.of().productTypeBuilder().id(reference.getId()).build();
    }

    static ReviewReference toReference(Review reference) {
        return ReferenceBuilder.of().reviewBuilder().id(reference.getId()).build();
    }

    static ShippingMethodReference toReference(ShippingMethod reference) {
        return ReferenceBuilder.of().shippingMethodBuilder().id(reference.getId()).build();
    }

    static ShoppingListReference toReference(ShoppingList reference) {
        return ReferenceBuilder.of().shoppingListBuilder().id(reference.getId()).build();
    }

    static StateReference toReference(State reference) {
        return ReferenceBuilder.of().stateBuilder().id(reference.getId()).build();
    }

    static StoreReference toReference(Store reference) {
        return ReferenceBuilder.of().storeBuilder().id(reference.getId()).build();
    }

    static TaxCategoryReference toReference(TaxCategory reference) {
        return ReferenceBuilder.of().taxCategoryBuilder().id(reference.getId()).build();
    }

    static TypeReference toReference(Type reference) {
        return ReferenceBuilder.of().typeBuilder().id(reference.getId()).build();
    }

    static ZoneReference toReference(Zone reference) {
        return ReferenceBuilder.of().zoneBuilder().id(reference.getId()).build();
    }
}
