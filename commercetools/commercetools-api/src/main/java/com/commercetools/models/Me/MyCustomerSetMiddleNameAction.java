package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetMiddleNameActionImpl;

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
@JsonDeserialize(as = MyCustomerSetMiddleNameActionImpl.class)
public interface MyCustomerSetMiddleNameAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("middleName")
   public String getMiddleName();

   public void setMiddleName(final String middleName);
   
   public static MyCustomerSetMiddleNameActionImpl of(){
      return new MyCustomerSetMiddleNameActionImpl();
   }
   

   public static MyCustomerSetMiddleNameActionImpl of(final MyCustomerSetMiddleNameAction template) {
      MyCustomerSetMiddleNameActionImpl instance = new MyCustomerSetMiddleNameActionImpl();
      instance.setMiddleName(template.getMiddleName());
      return instance;
   }

}