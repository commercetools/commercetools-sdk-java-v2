package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetCustomFieldActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomFieldActionImpl.class)
public interface CustomerSetCustomFieldAction extends CustomerUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static CustomerSetCustomFieldActionImpl of(){
      return new CustomerSetCustomFieldActionImpl();
   }
   

   public static CustomerSetCustomFieldActionImpl of(final CustomerSetCustomFieldAction template) {
      CustomerSetCustomFieldActionImpl instance = new CustomerSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}