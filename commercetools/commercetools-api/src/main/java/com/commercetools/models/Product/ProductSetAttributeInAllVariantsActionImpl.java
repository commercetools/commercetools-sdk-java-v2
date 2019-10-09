package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
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

   private String action;
   
   private String name;
   
   private Boolean staged;
   
   private Object value;

   @JsonCreator
   ProductSetAttributeInAllVariantsActionImpl(@JsonProperty("name") final String name, @JsonProperty("staged") final Boolean staged, @JsonProperty("value") final Object value) {
      this.name = name;
      this.staged = staged;
      this.value = value;
      this.action = "setAttributeInAllVariants";
   }
   public ProductSetAttributeInAllVariantsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Object getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }

}