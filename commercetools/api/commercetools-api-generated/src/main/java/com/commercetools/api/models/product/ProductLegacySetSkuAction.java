package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductLegacySetSkuActionImpl;

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
@JsonDeserialize(as = ProductLegacySetSkuActionImpl.class)
public interface ProductLegacySetSkuAction extends ProductUpdateAction {

   
   
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @JsonProperty("variantId")
   public Integer getVariantId();

   public void setSku(final String sku);
   
   public void setVariantId(final Integer variantId);
   
   public static ProductLegacySetSkuActionImpl of(){
      return new ProductLegacySetSkuActionImpl();
   }
   

   public static ProductLegacySetSkuActionImpl of(final ProductLegacySetSkuAction template) {
      ProductLegacySetSkuActionImpl instance = new ProductLegacySetSkuActionImpl();
      instance.setSku(template.getSku());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}
