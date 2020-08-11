package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetCompanyNameActionImpl implements MyCustomerSetCompanyNameAction {

   private String action;

   private String companyName;

   @JsonCreator
   MyCustomerSetCompanyNameActionImpl(@JsonProperty("companyName") final String companyName) {
      this.companyName = companyName;
      this.action = "setCompanyName";
   }
   public MyCustomerSetCompanyNameActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getCompanyName(){
      return this.companyName;
   }

   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }

}
