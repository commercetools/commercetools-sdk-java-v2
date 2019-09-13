package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
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
public final class OrderEditUpdateImpl implements OrderEditUpdate {

   private java.lang.Boolean dryRun;
   
   private java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> actions;
   
   private java.lang.Long version;

   @JsonCreator
   OrderEditUpdateImpl(@JsonProperty("dryRun") final java.lang.Boolean dryRun, @JsonProperty("actions") final java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> actions, @JsonProperty("version") final java.lang.Long version) {
      this.dryRun = dryRun;
      this.actions = actions;
      this.version = version;
   }
   public OrderEditUpdateImpl() {
      
   }
   
   
   public java.lang.Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setDryRun(final java.lang.Boolean dryRun){
      this.dryRun = dryRun;
   }
   
   public void setActions(final java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}