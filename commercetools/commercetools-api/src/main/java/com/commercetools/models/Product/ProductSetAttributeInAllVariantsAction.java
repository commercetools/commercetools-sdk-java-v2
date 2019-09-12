package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Product.ProductSetAttributeInAllVariantsActionImpl;

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
@JsonDeserialize(as = ProductSetAttributeInAllVariantsActionImpl.class)
public interface ProductSetAttributeInAllVariantsAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetAttributeInAllVariantsActionImpl of(){
      return new ProductSetAttributeInAllVariantsActionImpl();
   }
   

   public static ProductSetAttributeInAllVariantsActionImpl of(final ProductSetAttributeInAllVariantsAction template) {
      ProductSetAttributeInAllVariantsActionImpl instance = new ProductSetAttributeInAllVariantsActionImpl();
      instance.setName(template.getName());
      instance.setStaged(template.getStaged());
      instance.setValue(template.getValue());
      return instance;
   }

}