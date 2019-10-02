package com.commercetools.models.me;

import com.commercetools.models.me.MyPaymentUpdateAction;
import com.commercetools.models.me.MyPaymentSetMethodInfoMethodActionImpl;

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
@JsonDeserialize(as = MyPaymentSetMethodInfoMethodActionImpl.class)
public interface MyPaymentSetMethodInfoMethodAction extends MyPaymentUpdateAction {

   
   
   @JsonProperty("method")
   public String getMethod();

   public void setMethod(final String method);
   
   public static MyPaymentSetMethodInfoMethodActionImpl of(){
      return new MyPaymentSetMethodInfoMethodActionImpl();
   }
   

   public static MyPaymentSetMethodInfoMethodActionImpl of(final MyPaymentSetMethodInfoMethodAction template) {
      MyPaymentSetMethodInfoMethodActionImpl instance = new MyPaymentSetMethodInfoMethodActionImpl();
      instance.setMethod(template.getMethod());
      return instance;
   }

}