package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeRemoveEnumValuesActionImpl implements ProductTypeRemoveEnumValuesAction {

   private String action;
   
   private java.util.List<String> keys;
   
   private String attributeName;

   @JsonCreator
   ProductTypeRemoveEnumValuesActionImpl(@JsonProperty("keys") final java.util.List<String> keys, @JsonProperty("attributeName") final String attributeName) {
      this.keys = keys;
      this.attributeName = attributeName;
      this.action = "removeEnumValues";
   }
   public ProductTypeRemoveEnumValuesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getKeys(){
      return this.keys;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public void setKeys(final java.util.List<String> keys){
      this.keys = keys;
   }
   
   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }

}