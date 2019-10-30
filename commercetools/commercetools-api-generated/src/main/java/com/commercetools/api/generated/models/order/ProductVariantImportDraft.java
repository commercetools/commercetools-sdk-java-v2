package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.order.ProductVariantImportDraftImpl;

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
@JsonDeserialize(as = ProductVariantImportDraftImpl.class)
public interface ProductVariantImportDraft  {

   
   
   @JsonProperty("id")
   public Long getId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @Valid
   @JsonProperty("prices")
   public List<PriceDraft> getPrices();
   
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();
   
   @Valid
   @JsonProperty("images")
   public List<Image> getImages();

   public void setId(final Long id);
   
   public void setSku(final String sku);
   
   public void setPrices(final List<PriceDraft> prices);
   
   public void setAttributes(final List<Attribute> attributes);
   
   public void setImages(final List<Image> images);
   
   public static ProductVariantImportDraftImpl of(){
      return new ProductVariantImportDraftImpl();
   }
   

   public static ProductVariantImportDraftImpl of(final ProductVariantImportDraft template) {
      ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
      instance.setImages(template.getImages());
      instance.setAttributes(template.getAttributes());
      instance.setId(template.getId());
      instance.setPrices(template.getPrices());
      instance.setSku(template.getSku());
      return instance;
   }

}