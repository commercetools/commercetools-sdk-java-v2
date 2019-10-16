package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetSalutationActionImpl;

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
@JsonDeserialize(as = MyCustomerSetSalutationActionImpl.class)
public interface MyCustomerSetSalutationAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("salutation")
   public String getSalutation();

   public void setSalutation(final String salutation);
   
   public static MyCustomerSetSalutationActionImpl of(){
      return new MyCustomerSetSalutationActionImpl();
   }
   

   public static MyCustomerSetSalutationActionImpl of(final MyCustomerSetSalutationAction template) {
      MyCustomerSetSalutationActionImpl instance = new MyCustomerSetSalutationActionImpl();
      instance.setSalutation(template.getSalutation());
      return instance;
   }

}