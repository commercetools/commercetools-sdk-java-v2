package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangeEnumKeyActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeEnumKeyActionImpl.class)
public interface ProductTypeChangeEnumKeyAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("newKey")
   public String getNewKey();

   public void setAttributeName(final String attributeName);
   
   public void setKey(final String key);
   
   public void setNewKey(final String newKey);
   
   public static ProductTypeChangeEnumKeyActionImpl of(){
      return new ProductTypeChangeEnumKeyActionImpl();
   }
   

   public static ProductTypeChangeEnumKeyActionImpl of(final ProductTypeChangeEnumKeyAction template) {
      ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
      instance.setNewKey(template.getNewKey());
      instance.setAttributeName(template.getAttributeName());
      instance.setKey(template.getKey());
      return instance;
   }

}