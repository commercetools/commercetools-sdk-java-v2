package com.commercetools.models.Common;

import com.commercetools.models.Cart.CartResourceIdentifier;
import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier;
import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.DiscountCode.DiscountCodeResourceIdentifier;
import com.commercetools.models.Inventory.InventoryEntryResourceIdentifier;
import com.commercetools.models.Order.OrderResourceIdentifier;
import com.commercetools.models.OrderEdit.OrderEditResourceIdentifier;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import com.commercetools.models.Product.ProductResourceIdentifier;
import com.commercetools.models.ProductDiscount.ProductDiscountResourceIdentifier;
import com.commercetools.models.ProductType.ProductTypeResourceIdentifier;
import com.commercetools.models.Review.ReviewResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
import com.commercetools.models.State.StateResourceIdentifier;
import com.commercetools.models.Store.StoreResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.Type.TypeResourceIdentifier;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
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
   @JsonSubTypes.Type(value = com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifierImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerResourceIdentifierImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeResourceIdentifierImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntryResourceIdentifierImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditResourceIdentifierImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderResourceIdentifierImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentResourceIdentifierImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountResourceIdentifierImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeResourceIdentifierImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductResourceIdentifierImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewResourceIdentifierImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifierImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListResourceIdentifierImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateResourceIdentifierImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.models.Store.StoreResourceIdentifierImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifierImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeResourceIdentifierImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneResourceIdentifierImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountResourceIdentifierImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartResourceIdentifierImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryResourceIdentifierImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelResourceIdentifierImpl.class, name = "channel")
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