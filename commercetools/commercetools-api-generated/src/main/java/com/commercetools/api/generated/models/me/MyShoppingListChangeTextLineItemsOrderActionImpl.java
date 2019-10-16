package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListChangeTextLineItemsOrderActionImpl implements MyShoppingListChangeTextLineItemsOrderAction {

   private String action;
   
   private java.util.List<String> textLineItemOrder;

   @JsonCreator
   MyShoppingListChangeTextLineItemsOrderActionImpl(@JsonProperty("textLineItemOrder") final java.util.List<String> textLineItemOrder) {
      this.textLineItemOrder = textLineItemOrder;
      this.action = "changeTextLineItemsOrder";
   }
   public MyShoppingListChangeTextLineItemsOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getTextLineItemOrder(){
      return this.textLineItemOrder;
   }

   public void setTextLineItemOrder(final java.util.List<String> textLineItemOrder){
      this.textLineItemOrder = textLineItemOrder;
   }

}