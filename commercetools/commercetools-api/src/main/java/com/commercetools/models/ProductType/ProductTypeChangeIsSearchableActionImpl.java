package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.Boolean;
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
public final class ProductTypeChangeIsSearchableActionImpl implements ProductTypeChangeIsSearchableAction {

   private java.lang.String action;
   
   private java.lang.String attributeName;
   
   private java.lang.Boolean isSearchable;

   @JsonCreator
   ProductTypeChangeIsSearchableActionImpl(@JsonProperty("attributeName") final java.lang.String attributeName, @JsonProperty("isSearchable") final java.lang.Boolean isSearchable) {
      this.attributeName = attributeName;
      this.isSearchable = isSearchable;
      this.action = "changeIsSearchable";
   }
   public ProductTypeChangeIsSearchableActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public java.lang.Boolean getIsSearchable(){
      return this.isSearchable;
   }

   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setIsSearchable(final java.lang.Boolean isSearchable){
      this.isSearchable = isSearchable;
   }

}