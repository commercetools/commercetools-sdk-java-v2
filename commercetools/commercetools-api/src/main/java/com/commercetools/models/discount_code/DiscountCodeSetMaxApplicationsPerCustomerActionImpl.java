package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.Long;
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
public final class DiscountCodeSetMaxApplicationsPerCustomerActionImpl implements DiscountCodeSetMaxApplicationsPerCustomerAction {

   private java.lang.String action;
   
   private java.lang.Long maxApplicationsPerCustomer;

   @JsonCreator
   DiscountCodeSetMaxApplicationsPerCustomerActionImpl(@JsonProperty("maxApplicationsPerCustomer") final java.lang.Long maxApplicationsPerCustomer) {
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      this.action = "setMaxApplicationsPerCustomer";
   }
   public DiscountCodeSetMaxApplicationsPerCustomerActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }

   public void setMaxApplicationsPerCustomer(final java.lang.Long maxApplicationsPerCustomer){
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
   }

}