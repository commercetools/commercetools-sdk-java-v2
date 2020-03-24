package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListRemoveTextLineItemActionImpl implements MyShoppingListRemoveTextLineItemAction {

   private String action;
   
   private Long quantity;
   
   private String textLineItemId;

   @JsonCreator
   MyShoppingListRemoveTextLineItemActionImpl(@JsonProperty("quantity") final Long quantity, @JsonProperty("textLineItemId") final String textLineItemId) {
      this.quantity = quantity;
      this.textLineItemId = textLineItemId;
      this.action = "removeTextLineItem";
   }
   public MyShoppingListRemoveTextLineItemActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}