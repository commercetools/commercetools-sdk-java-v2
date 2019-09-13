package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.shopping_list.ShoppingListAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListAddLineItemActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private java.lang.Long quantity;
   
   @Nullable
   private java.lang.String productId;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder productId(@Nullable final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   @Nullable
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ShoppingListAddLineItemAction build() {
       return new ShoppingListAddLineItemActionImpl(addedAt, quantity, productId, custom, variantId, sku);
   }
   
   public static ShoppingListAddLineItemActionBuilder of() {
      return new ShoppingListAddLineItemActionBuilder();
   }
   
   public static ShoppingListAddLineItemActionBuilder of(final ShoppingListAddLineItemAction template) {
      ShoppingListAddLineItemActionBuilder builder = new ShoppingListAddLineItemActionBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.productId = template.getProductId();
      builder.custom = template.getCustom();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}