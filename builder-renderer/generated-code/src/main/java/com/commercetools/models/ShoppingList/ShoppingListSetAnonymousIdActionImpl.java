package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetAnonymousIdActionImpl implements ShoppingListSetAnonymousIdAction {

   private java.lang.String action;
   
   private java.lang.String anonymousId;

   @JsonCreator
   ShoppingListSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      this.action = "setAnonymousId";
   }
   public ShoppingListSetAnonymousIdActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }

   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }

}