package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
public final class ShoppingListSetTextLineItemCustomTypeActionImpl implements ShoppingListSetTextLineItemCustomTypeAction {

   private String action;
   
   private com.commercetools.api.models.type.FieldContainer fields;
   
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   private String textLineItemId;

   @JsonCreator
   ShoppingListSetTextLineItemCustomTypeActionImpl(@JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("textLineItemId") final String textLineItemId) {
      this.fields = fields;
      this.type = type;
      this.textLineItemId = textLineItemId;
      this.action = "setTextLineItemCustomType";
   }
   public ShoppingListSetTextLineItemCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}
