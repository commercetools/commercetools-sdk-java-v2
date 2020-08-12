package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListSetTextLineItemCustomFieldActionImpl implements MyShoppingListSetTextLineItemCustomFieldAction {

   private String action;
   
   private String textLineItemId;
   
   private String name;
   
   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   MyShoppingListSetTextLineItemCustomFieldActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.textLineItemId = textLineItemId;
      this.name = name;
      this.value = value;
      this.action = "setTextLineItemCustomField";
   }
   public MyShoppingListSetTextLineItemCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}
