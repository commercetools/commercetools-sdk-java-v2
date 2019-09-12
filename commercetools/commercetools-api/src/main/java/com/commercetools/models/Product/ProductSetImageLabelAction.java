package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetImageLabelActionImpl;

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
@JsonDeserialize(as = ProductSetImageLabelActionImpl.class)
public interface ProductSetImageLabelAction extends ProductUpdateAction {

   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   @NotNull
   @JsonProperty("imageUrl")
   public String getImageUrl();
   
   
   @JsonProperty("label")
   public String getLabel();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setSku(final String sku);
   
   public void setVariantId(final Long variantId);
   
   public void setImageUrl(final String imageUrl);
   
   public void setLabel(final String label);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetImageLabelActionImpl of(){
      return new ProductSetImageLabelActionImpl();
   }
   

   public static ProductSetImageLabelActionImpl of(final ProductSetImageLabelAction template) {
      ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
      instance.setImageUrl(template.getImageUrl());
      instance.setStaged(template.getStaged());
      instance.setLabel(template.getLabel());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      return instance;
   }

}