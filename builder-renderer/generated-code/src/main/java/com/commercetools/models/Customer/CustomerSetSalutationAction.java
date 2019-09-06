package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetSalutationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetSalutationActionImpl.class)
public interface CustomerSetSalutationAction extends CustomerUpdateAction {

   
   
   @JsonProperty("salutation")
   public String getSalutation();

   public void setSalutation(final String salutation);
   
   public static CustomerSetSalutationActionImpl of(){
      return new CustomerSetSalutationActionImpl();
   }
   

   public static CustomerSetSalutationActionImpl of(final CustomerSetSalutationAction template) {
      CustomerSetSalutationActionImpl instance = new CustomerSetSalutationActionImpl();
      instance.setSalutation(template.getSalutation());
      return instance;
   }

}