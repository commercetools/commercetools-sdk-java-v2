package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
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
public final class CartSetCustomFieldActionImpl implements CartSetCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String name;
   
   private java.lang.Object value;

   @JsonCreator
   CartSetCustomFieldActionImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("value") final java.lang.Object value) {
      this.name = name;
      this.value = value;
      this.action = "setCustomField";
   }
   public CartSetCustomFieldActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }

}