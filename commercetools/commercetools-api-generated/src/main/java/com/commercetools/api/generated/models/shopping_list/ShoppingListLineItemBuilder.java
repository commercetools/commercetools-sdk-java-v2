package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListLineItemBuilder {
   
   
   private java.time.ZonedDateTime addedAt;
   
   
   private Integer quantity;
   
   
   private String productId;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.api.generated.models.product.ProductVariant variant;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private Long variantId;
   
   
   private String id;
   
   @Nullable
   private java.time.ZonedDateTime deactivatedAt;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString productSlug;
   
   
   private com.commercetools.api.generated.models.product_type.ProductTypeReference productType;
   
   public ShoppingListLineItemBuilder addedAt( final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public ShoppingListLineItemBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListLineItemBuilder productId( final String productId) {
      this.productId = productId;
      return this;
   }
   
   public ShoppingListLineItemBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListLineItemBuilder variant(@Nullable final com.commercetools.api.generated.models.product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   public ShoppingListLineItemBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListLineItemBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ShoppingListLineItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListLineItemBuilder deactivatedAt(@Nullable final java.time.ZonedDateTime deactivatedAt) {
      this.deactivatedAt = deactivatedAt;
      return this;
   }
   
   public ShoppingListLineItemBuilder productSlug(@Nullable final com.commercetools.api.generated.models.common.LocalizedString productSlug) {
      this.productSlug = productSlug;
      return this;
   }
   
   public ShoppingListLineItemBuilder productType( final com.commercetools.api.generated.models.product_type.ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public java.time.ZonedDateTime getDeactivatedAt(){
      return this.deactivatedAt;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }

   public ShoppingListLineItem build() {
       return new ShoppingListLineItemImpl(addedAt, quantity, productId, custom, variant, name, variantId, id, deactivatedAt, productSlug, productType);
   }
   
   public static ShoppingListLineItemBuilder of() {
      return new ShoppingListLineItemBuilder();
   }
   
   public static ShoppingListLineItemBuilder of(final ShoppingListLineItem template) {
      ShoppingListLineItemBuilder builder = new ShoppingListLineItemBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.productId = template.getProductId();
      builder.custom = template.getCustom();
      builder.variant = template.getVariant();
      builder.name = template.getName();
      builder.variantId = template.getVariantId();
      builder.id = template.getId();
      builder.deactivatedAt = template.getDeactivatedAt();
      builder.productSlug = template.getProductSlug();
      builder.productType = template.getProductType();
      return builder;
   }
   
}