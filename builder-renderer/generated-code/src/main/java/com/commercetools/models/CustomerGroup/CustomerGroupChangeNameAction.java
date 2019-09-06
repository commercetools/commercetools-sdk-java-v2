package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.String;
import com.commercetools.models.CustomerGroup.CustomerGroupChangeNameActionImpl;

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
@JsonDeserialize(as = CustomerGroupChangeNameActionImpl.class)
public interface CustomerGroupChangeNameAction extends CustomerGroupUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static CustomerGroupChangeNameActionImpl of(){
      return new CustomerGroupChangeNameActionImpl();
   }
   

   public static CustomerGroupChangeNameActionImpl of(final CustomerGroupChangeNameAction template) {
      CustomerGroupChangeNameActionImpl instance = new CustomerGroupChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}