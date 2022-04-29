
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.custom_object.CustomObjectReference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.zone.ZoneReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl.class, name = CartDiscountReference.CART_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartReferenceImpl.class, name = CartReference.CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryReferenceImpl.class, name = CategoryReference.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelReferenceImpl.class, name = ChannelReference.CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.custom_object.CustomObjectReferenceImpl.class, name = CustomObjectReference.KEY_VALUE_DOCUMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl.class, name = CustomerGroupReference.CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerReferenceImpl.class, name = CustomerReference.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl.class, name = DiscountCodeReference.DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryReferenceImpl.class, name = InventoryEntryReference.INVENTORY_ENTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditReferenceImpl.class, name = OrderEditReference.ORDER_EDIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderReferenceImpl.class, name = OrderReference.ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentReferenceImpl.class, name = PaymentReference.PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl.class, name = ProductDiscountReference.PRODUCT_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductReferenceImpl.class, name = ProductReference.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl.class, name = ProductSelectionReference.PRODUCT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeReferenceImpl.class, name = ProductTypeReference.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewReferenceImpl.class, name = ReviewReference.REVIEW),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl.class, name = ShippingMethodReference.SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListReferenceImpl.class, name = ShoppingListReference.SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateReferenceImpl.class, name = StateReference.STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreReferenceImpl.class, name = StoreReference.STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl.class, name = TaxCategoryReference.TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeReferenceImpl.class, name = TypeReference.TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneReferenceImpl.class, name = ZoneReference.ZONE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ReferenceImpl.class, visible = true)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Reference {

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
    *  <p>Unique ID of the referenced resource.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);

    public static com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder cartDiscountBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartReferenceBuilder cartBuilder() {
        return com.commercetools.api.models.cart.CartReferenceBuilder.of();
    }

    public static com.commercetools.api.models.category.CategoryReferenceBuilder categoryBuilder() {
        return com.commercetools.api.models.category.CategoryReferenceBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelReferenceBuilder channelBuilder() {
        return com.commercetools.api.models.channel.ChannelReferenceBuilder.of();
    }

    public static com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder keyValueDocumentBuilder() {
        return com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder.of();
    }

    public static com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder customerGroupBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of();
    }

    public static com.commercetools.api.models.customer.CustomerReferenceBuilder customerBuilder() {
        return com.commercetools.api.models.customer.CustomerReferenceBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder discountCodeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder inventoryEntryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.OrderEditReferenceBuilder orderEditBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditReferenceBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderReferenceBuilder orderBuilder() {
        return com.commercetools.api.models.order.OrderReferenceBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentReferenceBuilder paymentBuilder() {
        return com.commercetools.api.models.payment.PaymentReferenceBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder productDiscountBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductReferenceBuilder productBuilder() {
        return com.commercetools.api.models.product.ProductReferenceBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder productSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of();
    }

    public static com.commercetools.api.models.product_type.ProductTypeReferenceBuilder productTypeBuilder() {
        return com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of();
    }

    public static com.commercetools.api.models.review.ReviewReferenceBuilder reviewBuilder() {
        return com.commercetools.api.models.review.ReviewReferenceBuilder.of();
    }

    public static com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder shippingMethodBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder shoppingListBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder.of();
    }

    public static com.commercetools.api.models.state.StateReferenceBuilder stateBuilder() {
        return com.commercetools.api.models.state.StateReferenceBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreReferenceBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreReferenceBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder taxCategoryBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of();
    }

    public static com.commercetools.api.models.type.TypeReferenceBuilder typeBuilder() {
        return com.commercetools.api.models.type.TypeReferenceBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneReferenceBuilder zoneBuilder() {
        return com.commercetools.api.models.zone.ZoneReferenceBuilder.of();
    }

    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
