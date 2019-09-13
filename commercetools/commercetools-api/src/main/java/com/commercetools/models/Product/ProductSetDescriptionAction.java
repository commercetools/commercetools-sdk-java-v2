package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetDescriptionActionImpl;

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
@JsonDeserialize(as = ProductSetDescriptionActionImpl.class)
public interface ProductSetDescriptionAction extends ProductUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setDescription(final LocalizedString description);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetDescriptionActionImpl of(){
      return new ProductSetDescriptionActionImpl();
   }
   

   public static ProductSetDescriptionActionImpl of(final ProductSetDescriptionAction template) {
      ProductSetDescriptionActionImpl instance = new ProductSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      instance.setStaged(template.getStaged());
      return instance;
   }

}