
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Reference {

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);

    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }
}
