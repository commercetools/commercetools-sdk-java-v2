package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetMetaTitleActionImpl;

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
@JsonDeserialize(as = ProductSetMetaTitleActionImpl.class)
public interface ProductSetMetaTitleAction extends ProductUpdateAction {

   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetMetaTitleActionImpl of(){
      return new ProductSetMetaTitleActionImpl();
   }
   

   public static ProductSetMetaTitleActionImpl of(final ProductSetMetaTitleAction template) {
      ProductSetMetaTitleActionImpl instance = new ProductSetMetaTitleActionImpl();
      instance.setMetaTitle(template.getMetaTitle());
      instance.setStaged(template.getStaged());
      return instance;
   }

}