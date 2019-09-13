package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributePlainEnumValue;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
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
public final class ProductTypeChangePlainEnumValueOrderActionImpl implements ProductTypeChangePlainEnumValueOrderAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.product_type.AttributePlainEnumValue> values;
   
   private java.lang.String attributeName;

   @JsonCreator
   ProductTypeChangePlainEnumValueOrderActionImpl(@JsonProperty("values") final java.util.List<com.commercetools.models.product_type.AttributePlainEnumValue> values, @JsonProperty("attributeName") final java.lang.String attributeName) {
      this.values = values;
      this.attributeName = attributeName;
      this.action = "changePlainEnumValueOrder";
   }
   public ProductTypeChangePlainEnumValueOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.product_type.AttributePlainEnumValue> getValues(){
      return this.values;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public void setValues(final java.util.List<com.commercetools.models.product_type.AttributePlainEnumValue> values){
      this.values = values;
   }
   
   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }

}