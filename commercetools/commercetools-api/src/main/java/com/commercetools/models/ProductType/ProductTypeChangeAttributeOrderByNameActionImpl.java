package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
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
public final class ProductTypeChangeAttributeOrderByNameActionImpl implements ProductTypeChangeAttributeOrderByNameAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> attributeNames;

   @JsonCreator
   ProductTypeChangeAttributeOrderByNameActionImpl(@JsonProperty("attributeNames") final java.util.List<java.lang.String> attributeNames) {
      this.attributeNames = attributeNames;
      this.action = "changeAttributeOrderByName";
   }
   public ProductTypeChangeAttributeOrderByNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getAttributeNames(){
      return this.attributeNames;
   }

   public void setAttributeNames(final java.util.List<java.lang.String> attributeNames){
      this.attributeNames = attributeNames;
   }

}