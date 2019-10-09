package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order_edit.OrderEditApplied;
import com.commercetools.models.order_edit.OrderEditReference;
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
public final class OrderEditAppliedMessagePayloadImpl implements OrderEditAppliedMessagePayload {

   private String type;
   
   private com.commercetools.models.order_edit.OrderEditApplied result;
   
   private com.commercetools.models.order_edit.OrderEditReference edit;

   @JsonCreator
   OrderEditAppliedMessagePayloadImpl(@JsonProperty("result") final com.commercetools.models.order_edit.OrderEditApplied result, @JsonProperty("edit") final com.commercetools.models.order_edit.OrderEditReference edit) {
      this.result = result;
      this.edit = edit;
      this.type = "OrderEditApplied";
   }
   public OrderEditAppliedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.order_edit.OrderEditApplied getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.order_edit.OrderEditReference getEdit(){
      return this.edit;
   }

   public void setResult(final com.commercetools.models.order_edit.OrderEditApplied result){
      this.result = result;
   }
   
   public void setEdit(final com.commercetools.models.order_edit.OrderEditReference edit){
      this.edit = edit;
   }

}