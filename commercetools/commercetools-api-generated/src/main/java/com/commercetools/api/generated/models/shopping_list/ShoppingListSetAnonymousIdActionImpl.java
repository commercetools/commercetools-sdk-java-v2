package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ShoppingListSetAnonymousIdActionImpl implements ShoppingListSetAnonymousIdAction {

   private String action;
   
   private String anonymousId;

   @JsonCreator
   ShoppingListSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
      this.anonymousId = anonymousId;
      this.action = "setAnonymousId";
   }
   public ShoppingListSetAnonymousIdActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }

}