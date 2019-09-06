package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLabelActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeLabelActionImpl.class)
public interface ProductTypeChangeLabelAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();

   public void setAttributeName(final String attributeName);
   
   public void setLabel(final LocalizedString label);
   
   public static ProductTypeChangeLabelActionImpl of(){
      return new ProductTypeChangeLabelActionImpl();
   }
   

   public static ProductTypeChangeLabelActionImpl of(final ProductTypeChangeLabelAction template) {
      ProductTypeChangeLabelActionImpl instance = new ProductTypeChangeLabelActionImpl();
      instance.setAttributeName(template.getAttributeName());
      instance.setLabel(template.getLabel());
      return instance;
   }

}