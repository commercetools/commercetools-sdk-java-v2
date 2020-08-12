package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
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
public final class CustomerGroupUpdateImpl implements CustomerGroupUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions;

   @JsonCreator
   CustomerGroupUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
      this.version = version;
      this.actions = actions;
   }
   public CustomerGroupUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> getActions(){
      return this.actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions){
      this.actions = actions;
   }

}
