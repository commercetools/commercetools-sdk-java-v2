package com.commercetools.models.common;

import com.commercetools.models.cart.CartResourceIdentifier;
import com.commercetools.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.models.order.OrderResourceIdentifier;
import com.commercetools.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.product.ProductResourceIdentifier;
import com.commercetools.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.models.review.ReviewResourceIdentifier;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.store.StoreResourceIdentifier;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.zone.ZoneResourceIdentifier;


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
   @JsonSubTypes.Type(value = com.commercetools.models.customer_group.CustomerGroupResourceIdentifierImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerResourceIdentifierImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeResourceIdentifierImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntryResourceIdentifierImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.models.order_edit.OrderEditResourceIdentifierImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderResourceIdentifierImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentResourceIdentifierImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.models.product_discount.ProductDiscountResourceIdentifierImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.product_type.ProductTypeResourceIdentifierImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductResourceIdentifierImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewResourceIdentifierImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.models.shipping_method.ShippingMethodResourceIdentifierImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.models.shopping_list.ShoppingListResourceIdentifierImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateResourceIdentifierImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.models.store.StoreResourceIdentifierImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.models.tax_category.TaxCategoryResourceIdentifierImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeResourceIdentifierImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneResourceIdentifierImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.CartDiscountResourceIdentifierImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartResourceIdentifierImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryResourceIdentifierImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelResourceIdentifierImpl.class, name = "channel")
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
public interface ResourceIdentifier  {

   
   
   @JsonProperty("id")
   public String getId();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setId(final String id);
   
   public void setKey(final String key);
   


}