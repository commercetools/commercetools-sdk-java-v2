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
public final class ProductTypeChangeNameActionImpl implements ProductTypeChangeNameAction {

   private String action;
   
   private String name;

   @JsonCreator
   ProductTypeChangeNameActionImpl(@JsonProperty("name") final String name) {
      this.name = name;
      this.action = "changeName";
   }
   public ProductTypeChangeNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }

   public void setName(final String name){
      this.name = name;
   }

}