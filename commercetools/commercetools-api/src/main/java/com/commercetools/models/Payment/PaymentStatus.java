package com.commercetools.models.payment;

import com.commercetools.models.state.StateReference;
import com.commercetools.models.payment.PaymentStatusImpl;

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
@JsonDeserialize(as = PaymentStatusImpl.class)
public interface PaymentStatus  {

   
   
   @JsonProperty("interfaceCode")
   public String getInterfaceCode();
   
   
   @JsonProperty("interfaceText")
   public String getInterfaceText();
   
   @Valid
   @JsonProperty("state")
   public StateReference getState();

   public void setInterfaceCode(final String interfaceCode);
   
   public void setInterfaceText(final String interfaceText);
   
   public void setState(final StateReference state);
   
   public static PaymentStatusImpl of(){
      return new PaymentStatusImpl();
   }
   

   public static PaymentStatusImpl of(final PaymentStatus template) {
      PaymentStatusImpl instance = new PaymentStatusImpl();
      instance.setInterfaceText(template.getInterfaceText());
      instance.setState(template.getState());
      instance.setInterfaceCode(template.getInterfaceCode());
      return instance;
   }

}