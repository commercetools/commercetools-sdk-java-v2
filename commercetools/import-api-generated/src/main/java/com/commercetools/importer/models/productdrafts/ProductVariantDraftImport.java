package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.Image;
import com.commercetools.importer.models.productdrafts.PriceDraftImport;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productdrafts.ProductVariantDraftImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ProductVariantDraftImportImpl.class)
public interface ProductVariantDraftImport  {

   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("prices")
   public List<PriceDraftImport> getPrices();
   
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();
   
   @Valid
   @JsonProperty("images")
   public List<Image> getImages();
   
   @Valid
   @JsonProperty("assets")
   public List<Asset> getAssets();

   public void setSku(final String sku);
   
   public void setKey(final String key);
   
   public void setPrices(final List<PriceDraftImport> prices);
   
   public void setAttributes(final List<Attribute> attributes);
   
   public void setImages(final List<Image> images);
   
   public void setAssets(final List<Asset> assets);
   
   public static ProductVariantDraftImportImpl of(){
      return new ProductVariantDraftImportImpl();
   }
   

   public static ProductVariantDraftImportImpl of(final ProductVariantDraftImport template) {
      ProductVariantDraftImportImpl instance = new ProductVariantDraftImportImpl();
      instance.setSku(template.getSku());
      instance.setKey(template.getKey());
      instance.setPrices(template.getPrices());
      instance.setAttributes(template.getAttributes());
      instance.setImages(template.getImages());
      instance.setAssets(template.getAssets());
      return instance;
   }

}