package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.Object;
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
public final class StagedOrderSetCustomLineItemCustomFieldActionImpl implements StagedOrderSetCustomLineItemCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private java.lang.String name;
   
   private java.lang.Object value;

   @JsonCreator
   StagedOrderSetCustomLineItemCustomFieldActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("name") final java.lang.String name, @JsonProperty("value") final java.lang.Object value) {
      this.customLineItemId = customLineItemId;
      this.name = name;
      this.value = value;
      this.action = "setCustomLineItemCustomField";
   }
   public StagedOrderSetCustomLineItemCustomFieldActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }

}