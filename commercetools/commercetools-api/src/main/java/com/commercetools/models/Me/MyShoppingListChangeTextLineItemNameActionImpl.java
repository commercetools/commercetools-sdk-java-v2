package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Me.MyShoppingListUpdateAction;
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
public final class MyShoppingListChangeTextLineItemNameActionImpl implements MyShoppingListChangeTextLineItemNameAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.lang.String textLineItemId;

   @JsonCreator
   MyShoppingListChangeTextLineItemNameActionImpl(@JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("textLineItemId") final java.lang.String textLineItemId) {
      this.name = name;
      this.textLineItemId = textLineItemId;
      this.action = "changeTextLineItemName";
   }
   public MyShoppingListChangeTextLineItemNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setTextLineItemId(final java.lang.String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}