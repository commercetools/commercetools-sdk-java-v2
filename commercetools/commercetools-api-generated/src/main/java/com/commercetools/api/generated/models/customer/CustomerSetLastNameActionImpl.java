package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetLastNameActionImpl implements CustomerSetLastNameAction {

   private String action;
   
   private String lastName;

   @JsonCreator
   CustomerSetLastNameActionImpl(@JsonProperty("lastName") final String lastName) {
      this.lastName = lastName;
      this.action = "setLastName";
   }
   public CustomerSetLastNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLastName(){
      return this.lastName;
   }

   public void setLastName(final String lastName){
      this.lastName = lastName;
   }

}