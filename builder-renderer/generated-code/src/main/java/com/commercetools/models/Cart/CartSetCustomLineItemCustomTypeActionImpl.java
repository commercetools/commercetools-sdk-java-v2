package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
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
public final class CartSetCustomLineItemCustomTypeActionImpl implements CartSetCustomLineItemCustomTypeAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.Type.FieldContainer fields;
   
   private com.commercetools.models.Type.TypeResourceIdentifier type;

   @JsonCreator
   CartSetCustomLineItemCustomTypeActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("fields") final com.commercetools.models.Type.FieldContainer fields, @JsonProperty("type") final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.customLineItemId = customLineItemId;
      this.fields = fields;
      this.type = type;
      this.action = "setCustomLineItemCustomType";
   }
   public CartSetCustomLineItemCustomTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setFields(final com.commercetools.models.Type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.Type.TypeResourceIdentifier type){
      this.type = type;
   }

}