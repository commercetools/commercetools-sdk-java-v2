package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.FieldContainer;
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
public final class StagedOrderSetLineItemCustomTypeActionImpl implements StagedOrderSetLineItemCustomTypeAction {

   private String action;
   
   private String lineItemId;
   
   private com.commercetools.models.type.FieldContainer fields;
   
   private com.commercetools.models.type.TypeResourceIdentifier type;

   @JsonCreator
   StagedOrderSetLineItemCustomTypeActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("fields") final com.commercetools.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.lineItemId = lineItemId;
      this.fields = fields;
      this.type = type;
      this.action = "setLineItemCustomType";
   }
   public StagedOrderSetLineItemCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setFields(final com.commercetools.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}