package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerSetExternalIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetExternalIdActionImpl.class)
public interface CustomerSetExternalIdAction extends CustomerUpdateAction {

   
   
   @JsonProperty("externalId")
   public String getExternalId();

   public void setExternalId(final String externalId);
   
   public static CustomerSetExternalIdActionImpl of(){
      return new CustomerSetExternalIdActionImpl();
   }
   

   public static CustomerSetExternalIdActionImpl of(final CustomerSetExternalIdAction template) {
      CustomerSetExternalIdActionImpl instance = new CustomerSetExternalIdActionImpl();
      instance.setExternalId(template.getExternalId());
      return instance;
   }

}