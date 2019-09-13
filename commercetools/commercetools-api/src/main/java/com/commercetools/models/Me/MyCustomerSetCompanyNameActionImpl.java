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
public final class MyCustomerSetCompanyNameActionImpl implements MyCustomerSetCompanyNameAction {

   private java.lang.String action;
   
   private java.lang.String companyName;

   @JsonCreator
   MyCustomerSetCompanyNameActionImpl(@JsonProperty("companyName") final java.lang.String companyName) {
      this.companyName = companyName;
      this.action = "setCompanyName";
   }
   public MyCustomerSetCompanyNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCompanyName(){
      return this.companyName;
   }

   public void setCompanyName(final java.lang.String companyName){
      this.companyName = companyName;
   }

}