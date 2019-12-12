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
public final class CustomerSetCompanyNameActionImpl implements CustomerSetCompanyNameAction {

   private String action;
   
   private String companyName;

   @JsonCreator
   CustomerSetCompanyNameActionImpl(@JsonProperty("companyName") final String companyName) {
      this.companyName = companyName;
      this.action = "setCompanyName";
   }
   public CustomerSetCompanyNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If not defined, the company name is unset.</p>
   */
   public String getCompanyName(){
      return this.companyName;
   }

   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }

}