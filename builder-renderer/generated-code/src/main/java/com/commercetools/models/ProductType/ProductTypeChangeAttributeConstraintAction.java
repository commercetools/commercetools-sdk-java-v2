package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeConstraintEnumDraft;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeConstraintActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeConstraintActionImpl.class)
public interface ProductTypeChangeAttributeConstraintAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("newValue")
   public AttributeConstraintEnumDraft getNewValue();

   public void setAttributeName(final String attributeName);
   
   public void setNewValue(final AttributeConstraintEnumDraft newValue);
   
   public static ProductTypeChangeAttributeConstraintActionImpl of(){
      return new ProductTypeChangeAttributeConstraintActionImpl();
   }
   

   public static ProductTypeChangeAttributeConstraintActionImpl of(final ProductTypeChangeAttributeConstraintAction template) {
      ProductTypeChangeAttributeConstraintActionImpl instance = new ProductTypeChangeAttributeConstraintActionImpl();
      instance.setNewValue(template.getNewValue());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}