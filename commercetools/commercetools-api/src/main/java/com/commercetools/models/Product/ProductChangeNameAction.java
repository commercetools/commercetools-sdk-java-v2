package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductChangeNameActionImpl;

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
@JsonDeserialize(as = ProductChangeNameActionImpl.class)
public interface ProductChangeNameAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setName(final LocalizedString name);
   
   public void setStaged(final Boolean staged);
   
   public static ProductChangeNameActionImpl of(){
      return new ProductChangeNameActionImpl();
   }
   

   public static ProductChangeNameActionImpl of(final ProductChangeNameAction template) {
      ProductChangeNameActionImpl instance = new ProductChangeNameActionImpl();
      instance.setName(template.getName());
      instance.setStaged(template.getStaged());
      return instance;
   }

}