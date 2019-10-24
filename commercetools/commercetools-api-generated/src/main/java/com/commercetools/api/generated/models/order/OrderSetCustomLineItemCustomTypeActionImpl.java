package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
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
public final class OrderSetCustomLineItemCustomTypeActionImpl implements OrderSetCustomLineItemCustomTypeAction {

   private String action;
   
   private String customLineItemId;
   
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;

   @JsonCreator
   OrderSetCustomLineItemCustomTypeActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("fields") final com.commercetools.api.generated.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.customLineItemId = customLineItemId;
      this.fields = fields;
      this.type = type;
      this.action = "setCustomLineItemCustomType";
   }
   public OrderSetCustomLineItemCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setFields(final com.commercetools.api.generated.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}