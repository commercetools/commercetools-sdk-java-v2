package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantImportDraftImpl implements ProductVariantImportDraft {

   private java.util.List<com.commercetools.api.generated.models.common.Image> images;
   
   private java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes;
   
   private Long id;
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices;
   
   private String sku;

   @JsonCreator
   ProductVariantImportDraftImpl(@JsonProperty("images") final java.util.List<com.commercetools.api.generated.models.common.Image> images, @JsonProperty("attributes") final java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes, @JsonProperty("id") final Long id, @JsonProperty("prices") final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices, @JsonProperty("sku") final String sku) {
      this.images = images;
      this.attributes = attributes;
      this.id = id;
      this.prices = prices;
      this.sku = sku;
   }
   public ProductVariantImportDraftImpl() {
      
   }
   
   /**
   *  <p>If this property is defined, then it will override the <code>images</code> property from the original
   *  product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.Image> getImages(){
      return this.images;
   }
   
   /**
   *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original
   *  product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   /**
   *  <p>The sequential ID of the variant within the product.
   *  The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set,
   *  or alternatively you can just specify SKU of the product variant.</p>
   */
   public Long getId(){
      return this.id;
   }
   
   /**
   *  <p>The prices of the variant.
   *  The prices should not contain two prices for the same price scope (same currency, country and customer group).
   *  If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   /**
   *  <p>The SKU of the existing variant.</p>
   */
   public String getSku(){
      return this.sku;
   }

   public void setImages(final java.util.List<com.commercetools.api.generated.models.common.Image> images){
      this.images = images;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setId(final Long id){
      this.id = id;
   }
   
   public void setPrices(final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}