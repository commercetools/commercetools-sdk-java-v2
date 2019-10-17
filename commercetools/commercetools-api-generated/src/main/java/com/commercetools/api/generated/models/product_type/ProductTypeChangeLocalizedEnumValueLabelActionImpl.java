package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLocalizedEnumValueLabelActionImpl implements ProductTypeChangeLocalizedEnumValueLabelAction {

   private String action;
   
   private com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue newValue;
   
   private String attributeName;

   @JsonCreator
   ProductTypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("newValue") final com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue newValue, @JsonProperty("attributeName") final String attributeName) {
      this.newValue = newValue;
      this.attributeName = attributeName;
      this.action = "changeLocalizedEnumValueLabel";
   }
   public ProductTypeChangeLocalizedEnumValueLabelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue getNewValue(){
      return this.newValue;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public void setNewValue(final com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue newValue){
      this.newValue = newValue;
   }
   
   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }

}