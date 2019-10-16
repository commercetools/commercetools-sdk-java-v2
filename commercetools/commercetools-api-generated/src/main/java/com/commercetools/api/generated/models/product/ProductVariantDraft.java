package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.AssetDraft;
import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.product.ProductVariantDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantDraftImpl.class)
public interface ProductVariantDraft  {

   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("prices")
   public List<PriceDraft> getPrices();
   
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();
   
   @Valid
   @JsonProperty("images")
   public List<Image> getImages();
   
   @Valid
   @JsonProperty("assets")
   public List<AssetDraft> getAssets();

   public void setSku(final String sku);
   
   public void setKey(final String key);
   
   public void setPrices(final List<PriceDraft> prices);
   
   public void setAttributes(final List<Attribute> attributes);
   
   public void setImages(final List<Image> images);
   
   public void setAssets(final List<AssetDraft> assets);
   
   public static ProductVariantDraftImpl of(){
      return new ProductVariantDraftImpl();
   }
   

   public static ProductVariantDraftImpl of(final ProductVariantDraft template) {
      ProductVariantDraftImpl instance = new ProductVariantDraftImpl();
      instance.setImages(template.getImages());
      instance.setAssets(template.getAssets());
      instance.setAttributes(template.getAttributes());
      instance.setPrices(template.getPrices());
      instance.setSku(template.getSku());
      instance.setKey(template.getKey());
      return instance;
   }

}