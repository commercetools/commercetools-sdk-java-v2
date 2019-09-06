package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetProductVariantKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetProductVariantKeyActionImpl.class)
public interface ProductSetProductVariantKeyAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("key")
   public String getKey();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setKey(final String key);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetProductVariantKeyActionImpl of(){
      return new ProductSetProductVariantKeyActionImpl();
   }
   

   public static ProductSetProductVariantKeyActionImpl of(final ProductSetProductVariantKeyAction template) {
      ProductSetProductVariantKeyActionImpl instance = new ProductSetProductVariantKeyActionImpl();
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setKey(template.getKey());
      return instance;
   }

}