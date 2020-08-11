package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyShoppingListAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListAddLineItemActionBuilder {

   @Nullable
   private java.time.ZonedDateTime addedAt;

   @Nullable
   private Long quantity;

   @Nullable
   private String productId;

   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   @Nullable
   private Long variantId;

   @Nullable
   private String sku;

   public MyShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }

   public MyShoppingListAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }

   public MyShoppingListAddLineItemActionBuilder productId(@Nullable final String productId) {
      this.productId = productId;
      return this;
   }

   public MyShoppingListAddLineItemActionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }

   public MyShoppingListAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }

   public MyShoppingListAddLineItemActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }

   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }

   @Nullable
   public Long getQuantity(){
      return this.quantity;
   }

   @Nullable
   public String getProductId(){
      return this.productId;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }

   @Nullable
   public String getSku(){
      return this.sku;
   }

   public MyShoppingListAddLineItemAction build() {
       return new MyShoppingListAddLineItemActionImpl(addedAt, quantity, productId, custom, variantId, sku);
   }

   public static MyShoppingListAddLineItemActionBuilder of() {
      return new MyShoppingListAddLineItemActionBuilder();
   }

   public static MyShoppingListAddLineItemActionBuilder of(final MyShoppingListAddLineItemAction template) {
      MyShoppingListAddLineItemActionBuilder builder = new MyShoppingListAddLineItemActionBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.productId = template.getProductId();
      builder.custom = template.getCustom();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }

}
