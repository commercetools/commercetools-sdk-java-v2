package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetLastNameActionImpl implements MyCustomerSetLastNameAction {

   private java.lang.String action;
   
   private java.lang.String lastName;

   @JsonCreator
   MyCustomerSetLastNameActionImpl(@JsonProperty("lastName") final java.lang.String lastName) {
      this.lastName = lastName;
      this.action = "setLastName";
   }
   public MyCustomerSetLastNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLastName(){
      return this.lastName;
   }

   public void setLastName(final java.lang.String lastName){
      this.lastName = lastName;
   }

}