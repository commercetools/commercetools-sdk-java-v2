package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductRemovePriceActionImpl;

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
@JsonDeserialize(as = ProductRemovePriceActionImpl.class)
public interface ProductRemovePriceAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setPriceId(final String priceId);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemovePriceActionImpl of(){
      return new ProductRemovePriceActionImpl();
   }
   

   public static ProductRemovePriceActionImpl of(final ProductRemovePriceAction template) {
      ProductRemovePriceActionImpl instance = new ProductRemovePriceActionImpl();
      instance.setStaged(template.getStaged());
      instance.setPriceId(template.getPriceId());
      return instance;
   }

}