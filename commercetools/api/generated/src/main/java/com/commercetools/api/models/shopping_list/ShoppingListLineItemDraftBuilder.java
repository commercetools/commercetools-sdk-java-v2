package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListLineItemDraftBuilder {
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private Integer quantity;
   
   @Nullable
   private String productId;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ShoppingListLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public ShoppingListLineItemDraftBuilder quantity(@Nullable final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListLineItemDraftBuilder productId(@Nullable final String productId) {
      this.productId = productId;
      return this;
   }
   
   public ShoppingListLineItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListLineItemDraftBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ShoppingListLineItemDraftBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   @Nullable
   public Integer getQuantity(){
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

   public ShoppingListLineItemDraft build() {
       return new ShoppingListLineItemDraftImpl(addedAt, quantity, productId, custom, variantId, sku);
   }
   
   public static ShoppingListLineItemDraftBuilder of() {
      return new ShoppingListLineItemDraftBuilder();
   }
   
   public static ShoppingListLineItemDraftBuilder of(final ShoppingListLineItemDraft template) {
      ShoppingListLineItemDraftBuilder builder = new ShoppingListLineItemDraftBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.productId = template.getProductId();
      builder.custom = template.getCustom();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}
