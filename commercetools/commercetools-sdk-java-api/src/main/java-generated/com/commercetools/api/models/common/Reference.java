package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.ReferenceTypeId;
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
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.custom_object.CustomObjectReferenceImpl.class, name = "key-value-document"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerReferenceImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryReferenceImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditReferenceImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderReferenceImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentReferenceImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeReferenceImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewReferenceImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListReferenceImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateReferenceImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreReferenceImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeReferenceImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneReferenceImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelReferenceImpl.class, name = "channel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartReferenceImpl.class, name = "cart")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "typeId",
    defaultImpl = ReferenceImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Reference  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);



    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }
}
