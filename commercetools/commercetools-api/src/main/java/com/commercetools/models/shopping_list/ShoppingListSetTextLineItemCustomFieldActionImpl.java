package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
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
public final class ShoppingListSetTextLineItemCustomFieldActionImpl implements ShoppingListSetTextLineItemCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String name;
   
   private java.lang.Object value;
   
   private java.lang.String textLineItemId;

   @JsonCreator
   ShoppingListSetTextLineItemCustomFieldActionImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("value") final java.lang.Object value, @JsonProperty("textLineItemId") final java.lang.String textLineItemId) {
      this.name = name;
      this.value = value;
      this.textLineItemId = textLineItemId;
      this.action = "setTextLineItemCustomField";
   }
   public ShoppingListSetTextLineItemCustomFieldActionImpl() {
      
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
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }
   
   public void setTextLineItemId(final java.lang.String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}