package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction;
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
public final class OrderEditUpdateImpl implements OrderEditUpdate {

   private Boolean dryRun;
   
   private java.util.List<com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction> actions;
   
   private Long version;

   @JsonCreator
   OrderEditUpdateImpl(@JsonProperty("dryRun") final Boolean dryRun, @JsonProperty("actions") final java.util.List<com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.dryRun = dryRun;
      this.actions = actions;
      this.version = version;
   }
   public OrderEditUpdateImpl() {
      
   }
   
   
   public Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setDryRun(final Boolean dryRun){
      this.dryRun = dryRun;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}