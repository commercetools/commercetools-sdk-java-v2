package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListRemoveLineItemActionImpl implements MyShoppingListRemoveLineItemAction {

   private String action;
   
   private Long quantity;
   
   private String lineItemId;

   @JsonCreator
   MyShoppingListRemoveLineItemActionImpl(@JsonProperty("quantity") final Long quantity, @JsonProperty("lineItemId") final String lineItemId) {
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.action = "removeLineItem";
   }
   public MyShoppingListRemoveLineItemActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}