package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Object;
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
public final class ProductSetAttributeInAllVariantsActionImpl implements ProductSetAttributeInAllVariantsAction {

   private java.lang.String action;
   
   private java.lang.String name;
   
   private java.lang.Boolean staged;
   
   private java.lang.Object value;

   @JsonCreator
   ProductSetAttributeInAllVariantsActionImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("value") final java.lang.Object value) {
      this.name = name;
      this.staged = staged;
      this.value = value;
      this.action = "setAttributeInAllVariants";
   }
   public ProductSetAttributeInAllVariantsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }

}