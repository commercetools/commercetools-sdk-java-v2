package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.cart.CartResourceIdentifier;
import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.generated.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.generated.models.order.OrderResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductResourceIdentifier;
import com.commercetools.api.generated.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.generated.models.review.ReviewResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifier;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifierImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.customer.CustomerResourceIdentifierImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.discount_code.DiscountCodeResourceIdentifierImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.inventory.InventoryEntryResourceIdentifierImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditResourceIdentifierImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderResourceIdentifierImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.payment.PaymentResourceIdentifierImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountResourceIdentifierImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifierImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductResourceIdentifierImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.review.ReviewResourceIdentifierImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifierImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shopping_list.ShoppingListResourceIdentifierImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateResourceIdentifierImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.store.StoreResourceIdentifierImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifierImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeResourceIdentifierImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.zone.ZoneResourceIdentifierImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifierImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartResourceIdentifierImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryResourceIdentifierImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelResourceIdentifierImpl.class, name = "channel")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId",
   defaultImpl = ResourceIdentifierImpl.class
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