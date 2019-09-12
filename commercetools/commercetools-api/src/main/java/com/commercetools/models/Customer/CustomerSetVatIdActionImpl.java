package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
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
public final class CustomerSetVatIdActionImpl implements CustomerSetVatIdAction {

   private java.lang.String action;
   
   private java.lang.String vatId;

   @JsonCreator
   CustomerSetVatIdActionImpl(@JsonProperty("vatId") final java.lang.String vatId) {
      this.vatId = vatId;
      this.action = "setVatId";
   }
   public CustomerSetVatIdActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getVatId(){
      return this.vatId;
   }

   public void setVatId(final java.lang.String vatId){
      this.vatId = vatId;
   }

}