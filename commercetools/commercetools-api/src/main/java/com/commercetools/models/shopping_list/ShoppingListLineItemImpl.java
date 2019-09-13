package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductVariant;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.type.CustomFields;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListLineItemImpl implements ShoppingListLineItem {

   private java.time.ZonedDateTime addedAt;
   
   private java.lang.Integer quantity;
   
   private java.lang.String productId;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.product.ProductVariant variant;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.lang.Long variantId;
   
   private java.lang.String id;
   
   private java.time.ZonedDateTime deactivatedAt;
   
   private com.commercetools.models.common.LocalizedString productSlug;
   
   private com.commercetools.models.product_type.ProductTypeReference productType;

   @JsonCreator
   ShoppingListLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("variant") final com.commercetools.models.product.ProductVariant variant, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("id") final java.lang.String id, @JsonProperty("deactivatedAt") final java.time.ZonedDateTime deactivatedAt, @JsonProperty("productSlug") final com.commercetools.models.common.LocalizedString productSlug, @JsonProperty("productType") final com.commercetools.models.product_type.ProductTypeReference productType) {
      this.addedAt = addedAt;
      this.quantity = quantity;
      this.productId = productId;
      this.custom = custom;
      this.variant = variant;
      this.name = name;
      this.variantId = variantId;
      this.id = id;
      this.deactivatedAt = deactivatedAt;
      this.productSlug = productSlug;
      this.productType = productType;
   }
   public ShoppingListLineItemImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.time.ZonedDateTime getDeactivatedAt(){
      return this.deactivatedAt;
   }
   
   
   public com.commercetools.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   
   public com.commercetools.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setVariant(final com.commercetools.models.product.ProductVariant variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setDeactivatedAt(final java.time.ZonedDateTime deactivatedAt){
      this.deactivatedAt = deactivatedAt;
   }
   
   public void setProductSlug(final com.commercetools.models.common.LocalizedString productSlug){
      this.productSlug = productSlug;
   }
   
   public void setProductType(final com.commercetools.models.product_type.ProductTypeReference productType){
      this.productType = productType;
   }

}