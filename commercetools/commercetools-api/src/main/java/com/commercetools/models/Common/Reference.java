package com.commercetools.models.common;

import com.commercetools.models.cart.CartReference;
import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.custom_object.CustomObjectReference;
import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.inventory.InventoryEntryReference;
import com.commercetools.models.order.OrderReference;
import com.commercetools.models.order_edit.OrderEditReference;
import com.commercetools.models.payment.PaymentReference;
import com.commercetools.models.product.ProductReference;
import com.commercetools.models.product_discount.ProductDiscountReference;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.review.ReviewReference;
import com.commercetools.models.shipping_method.ShippingMethodReference;
import com.commercetools.models.shopping_list.ShoppingListReference;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.store.StoreReference;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.type.TypeReference;
import com.commercetools.models.zone.ZoneReference;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.custom_object.CustomObjectReferenceImpl.class, name = "key-value-document"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer_group.CustomerGroupReferenceImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerReferenceImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeReferenceImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntryReferenceImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.models.order_edit.OrderEditReferenceImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderReferenceImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentReferenceImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.models.product_discount.ProductDiscountReferenceImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.product_type.ProductTypeReferenceImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewReferenceImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.models.shipping_method.ShippingMethodReferenceImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.models.shopping_list.ShoppingListReferenceImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateReferenceImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.models.store.StoreReferenceImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.models.tax_category.TaxCategoryReferenceImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeReferenceImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneReferenceImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.CartDiscountReferenceImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartReferenceImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelReferenceImpl.class, name = "channel")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId"
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
   


}