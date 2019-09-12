package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
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
public final class MyCustomerSetSalutationActionImpl implements MyCustomerSetSalutationAction {

   private java.lang.String action;
   
   private java.lang.String salutation;

   @JsonCreator
   MyCustomerSetSalutationActionImpl(@JsonProperty("salutation") final java.lang.String salutation) {
      this.salutation = salutation;
      this.action = "setSalutation";
   }
   public MyCustomerSetSalutationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getSalutation(){
      return this.salutation;
   }

   public void setSalutation(final java.lang.String salutation){
      this.salutation = salutation;
   }

}