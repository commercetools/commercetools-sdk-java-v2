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
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetFirstNameActionImpl implements CustomerSetFirstNameAction {

   private String action;
   
   private String firstName;

   @JsonCreator
   CustomerSetFirstNameActionImpl(@JsonProperty("firstName") final String firstName) {
      this.firstName = firstName;
      this.action = "setFirstName";
   }
   public CustomerSetFirstNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }

   public void setFirstName(final String firstName){
      this.firstName = firstName;
   }

}