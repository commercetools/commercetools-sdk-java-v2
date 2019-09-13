package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetCompanyNameActionImpl;

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
@JsonDeserialize(as = MyCustomerSetCompanyNameActionImpl.class)
public interface MyCustomerSetCompanyNameAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("companyName")
   public String getCompanyName();

   public void setCompanyName(final String companyName);
   
   public static MyCustomerSetCompanyNameActionImpl of(){
      return new MyCustomerSetCompanyNameActionImpl();
   }
   

   public static MyCustomerSetCompanyNameActionImpl of(final MyCustomerSetCompanyNameAction template) {
      MyCustomerSetCompanyNameActionImpl instance = new MyCustomerSetCompanyNameActionImpl();
      instance.setCompanyName(template.getCompanyName());
      return instance;
   }

}