package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueLabelActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueLabelAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("newValue")
   public AttributeLocalizedEnumValue getNewValue();

   public void setAttributeName(final String attributeName);
   
   public void setNewValue(final AttributeLocalizedEnumValue newValue);
   
   public static ProductTypeChangeLocalizedEnumValueLabelActionImpl of(){
      return new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
   }
   

   public static ProductTypeChangeLocalizedEnumValueLabelActionImpl of(final ProductTypeChangeLocalizedEnumValueLabelAction template) {
      ProductTypeChangeLocalizedEnumValueLabelActionImpl instance = new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
      instance.setNewValue(template.getNewValue());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}