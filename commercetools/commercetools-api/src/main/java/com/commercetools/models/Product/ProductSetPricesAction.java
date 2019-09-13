package com.commercetools.models.product;

import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductSetPricesActionImpl;

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
@JsonDeserialize(as = ProductSetPricesActionImpl.class)
public interface ProductSetPricesAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @Valid
   @JsonProperty("prices")
   public List<PriceDraft> getPrices();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setPrices(final List<PriceDraft> prices);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetPricesActionImpl of(){
      return new ProductSetPricesActionImpl();
   }
   

   public static ProductSetPricesActionImpl of(final ProductSetPricesAction template) {
      ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setPrices(template.getPrices());
      instance.setSku(template.getSku());
      return instance;
   }

}