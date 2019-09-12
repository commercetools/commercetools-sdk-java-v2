package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetFirstNameActionImpl;

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
@JsonDeserialize(as = MyCustomerSetFirstNameActionImpl.class)
public interface MyCustomerSetFirstNameAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("firstName")
   public String getFirstName();

   public void setFirstName(final String firstName);
   
   public static MyCustomerSetFirstNameActionImpl of(){
      return new MyCustomerSetFirstNameActionImpl();
   }
   

   public static MyCustomerSetFirstNameActionImpl of(final MyCustomerSetFirstNameAction template) {
      MyCustomerSetFirstNameActionImpl instance = new MyCustomerSetFirstNameActionImpl();
      instance.setFirstName(template.getFirstName());
      return instance;
   }

}