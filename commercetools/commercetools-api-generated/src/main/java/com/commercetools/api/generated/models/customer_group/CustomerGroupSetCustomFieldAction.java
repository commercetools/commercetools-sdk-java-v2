package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.generated.models.customer_group.CustomerGroupSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = CustomerGroupSetCustomFieldActionImpl.class)
public interface CustomerGroupSetCustomFieldAction extends CustomerGroupUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static CustomerGroupSetCustomFieldActionImpl of(){
      return new CustomerGroupSetCustomFieldActionImpl();
   }
   

   public static CustomerGroupSetCustomFieldActionImpl of(final CustomerGroupSetCustomFieldAction template) {
      CustomerGroupSetCustomFieldActionImpl instance = new CustomerGroupSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}