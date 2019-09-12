package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import com.commercetools.models.ProductType.TextInputHint;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeInputHintActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeInputHintActionImpl.class)
public interface ProductTypeChangeInputHintAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("newValue")
   public TextInputHint getNewValue();

   public void setAttributeName(final String attributeName);
   
   public void setNewValue(final TextInputHint newValue);
   
   public static ProductTypeChangeInputHintActionImpl of(){
      return new ProductTypeChangeInputHintActionImpl();
   }
   

   public static ProductTypeChangeInputHintActionImpl of(final ProductTypeChangeInputHintAction template) {
      ProductTypeChangeInputHintActionImpl instance = new ProductTypeChangeInputHintActionImpl();
      instance.setNewValue(template.getNewValue());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}