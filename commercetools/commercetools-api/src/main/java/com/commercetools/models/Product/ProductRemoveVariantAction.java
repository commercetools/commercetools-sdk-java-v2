package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductRemoveVariantActionImpl;

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
@JsonDeserialize(as = ProductRemoveVariantActionImpl.class)
public interface ProductRemoveVariantAction extends ProductUpdateAction {

   
   
   @JsonProperty("id")
   public Long getId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setId(final Long id);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemoveVariantActionImpl of(){
      return new ProductRemoveVariantActionImpl();
   }
   

   public static ProductRemoveVariantActionImpl of(final ProductRemoveVariantAction template) {
      ProductRemoveVariantActionImpl instance = new ProductRemoveVariantActionImpl();
      instance.setStaged(template.getStaged());
      instance.setId(template.getId());
      instance.setSku(template.getSku());
      return instance;
   }

}