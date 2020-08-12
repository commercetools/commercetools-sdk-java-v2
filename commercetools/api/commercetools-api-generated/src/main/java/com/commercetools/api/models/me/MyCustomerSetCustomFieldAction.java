package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyCustomerSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = MyCustomerSetCustomFieldActionImpl.class)
public interface MyCustomerSetCustomFieldAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static MyCustomerSetCustomFieldActionImpl of(){
      return new MyCustomerSetCustomFieldActionImpl();
   }
   

   public static MyCustomerSetCustomFieldActionImpl of(final MyCustomerSetCustomFieldAction template) {
      MyCustomerSetCustomFieldActionImpl instance = new MyCustomerSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}
