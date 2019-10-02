package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
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
public final class CartDiscountSetCustomTypeActionImpl implements CartDiscountSetCustomTypeAction {

   private String action;
   
   private Object fields;
   
   private com.commercetools.models.type.TypeResourceIdentifier type;

   @JsonCreator
   CartDiscountSetCustomTypeActionImpl(@JsonProperty("fields") final Object fields, @JsonProperty("type") final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public CartDiscountSetCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Object getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final Object fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}