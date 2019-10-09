package com.commercetools.models.customer_group;

import com.commercetools.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.models.customer_group.CustomerGroupUpdateImpl;

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
@JsonDeserialize(as = CustomerGroupUpdateImpl.class)
public interface CustomerGroupUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<CustomerGroupUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<CustomerGroupUpdateAction> actions);
   
   public static CustomerGroupUpdateImpl of(){
      return new CustomerGroupUpdateImpl();
   }
   

   public static CustomerGroupUpdateImpl of(final CustomerGroupUpdate template) {
      CustomerGroupUpdateImpl instance = new CustomerGroupUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}