package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditApplied;
import com.commercetools.models.OrderEdit.OrderEditReference;
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
public final class OrderEditAppliedMessagePayloadImpl implements OrderEditAppliedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.OrderEdit.OrderEditApplied result;
   
   private com.commercetools.models.OrderEdit.OrderEditReference edit;

   @JsonCreator
   OrderEditAppliedMessagePayloadImpl(@JsonProperty("result") final com.commercetools.models.OrderEdit.OrderEditApplied result, @JsonProperty("edit") final com.commercetools.models.OrderEdit.OrderEditReference edit) {
      this.result = result;
      this.edit = edit;
      this.type = "OrderEditApplied";
   }
   public OrderEditAppliedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditApplied getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditReference getEdit(){
      return this.edit;
   }

   public void setResult(final com.commercetools.models.OrderEdit.OrderEditApplied result){
      this.result = result;
   }
   
   public void setEdit(final com.commercetools.models.OrderEdit.OrderEditReference edit){
      this.edit = edit;
   }

}