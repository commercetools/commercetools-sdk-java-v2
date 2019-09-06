package com.commercetools.models.Product;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductChangePriceActionImpl;

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
@JsonDeserialize(as = ProductChangePriceActionImpl.class)
public interface ProductChangePriceAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public PriceDraft getPrice();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setPriceId(final String priceId);
   
   public void setPrice(final PriceDraft price);
   
   public void setStaged(final Boolean staged);
   
   public static ProductChangePriceActionImpl of(){
      return new ProductChangePriceActionImpl();
   }
   

   public static ProductChangePriceActionImpl of(final ProductChangePriceAction template) {
      ProductChangePriceActionImpl instance = new ProductChangePriceActionImpl();
      instance.setPrice(template.getPrice());
      instance.setStaged(template.getStaged());
      instance.setPriceId(template.getPriceId());
      return instance;
   }

}