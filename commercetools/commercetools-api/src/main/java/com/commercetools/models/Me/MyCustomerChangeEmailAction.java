package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerChangeEmailActionImpl;

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
@JsonDeserialize(as = MyCustomerChangeEmailActionImpl.class)
public interface MyCustomerChangeEmailAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static MyCustomerChangeEmailActionImpl of(){
      return new MyCustomerChangeEmailActionImpl();
   }
   

   public static MyCustomerChangeEmailActionImpl of(final MyCustomerChangeEmailAction template) {
      MyCustomerChangeEmailActionImpl instance = new MyCustomerChangeEmailActionImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}