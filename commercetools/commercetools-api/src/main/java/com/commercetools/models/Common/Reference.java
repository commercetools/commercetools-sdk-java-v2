package com.commercetools.models.Common;

import com.commercetools.models.Cart.CartReference;
import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Category.CategoryReference;
import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CustomObject.CustomObjectReference;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Inventory.InventoryEntryReference;
import com.commercetools.models.Order.OrderReference;
import com.commercetools.models.OrderEdit.OrderEditReference;
import com.commercetools.models.Payment.PaymentReference;
import com.commercetools.models.Product.ProductReference;
import com.commercetools.models.ProductDiscount.ProductDiscountReference;
import com.commercetools.models.ProductType.ProductTypeReference;
import com.commercetools.models.Review.ReviewReference;
import com.commercetools.models.ShippingMethod.ShippingMethodReference;
import com.commercetools.models.ShoppingList.ShoppingListReference;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Store.StoreReference;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import com.commercetools.models.Type.TypeReference;
import com.commercetools.models.Zone.ZoneReference;
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
   @JsonSubTypes.Type(value = com.commercetools.models.CustomObject.CustomObjectReferenceImpl.class, name = "key-value-document"),
   @JsonSubTypes.Type(value = com.commercetools.models.CustomerGroup.CustomerGroupReferenceImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerReferenceImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeReferenceImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntryReferenceImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditReferenceImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderReferenceImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentReferenceImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountReferenceImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeReferenceImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewReferenceImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodReferenceImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShoppingList.ShoppingListReferenceImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateReferenceImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.models.Store.StoreReferenceImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryReferenceImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeReferenceImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneReferenceImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountReferenceImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartReferenceImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelReferenceImpl.class, name = "channel")
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