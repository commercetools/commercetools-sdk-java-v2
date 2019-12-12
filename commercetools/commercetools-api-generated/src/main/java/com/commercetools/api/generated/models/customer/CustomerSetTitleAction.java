package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetTitleActionImpl;

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
@JsonDeserialize(as = CustomerSetTitleActionImpl.class)
public interface CustomerSetTitleAction extends CustomerUpdateAction {

   
   
   @JsonProperty("title")
   public String getTitle();

   public void setTitle(final String title);
   
   public static CustomerSetTitleActionImpl of(){
      return new CustomerSetTitleActionImpl();
   }
   

   public static CustomerSetTitleActionImpl of(final CustomerSetTitleAction template) {
      CustomerSetTitleActionImpl instance = new CustomerSetTitleActionImpl();
      instance.setTitle(template.getTitle());
      return instance;
   }

}