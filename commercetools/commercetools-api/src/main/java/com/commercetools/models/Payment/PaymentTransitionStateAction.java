package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.payment.PaymentTransitionStateActionImpl;

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
@JsonDeserialize(as = PaymentTransitionStateActionImpl.class)
public interface PaymentTransitionStateAction extends PaymentUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   
   
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateResourceIdentifier state);
   
   public void setForce(final Boolean force);
   
   public static PaymentTransitionStateActionImpl of(){
      return new PaymentTransitionStateActionImpl();
   }
   

   public static PaymentTransitionStateActionImpl of(final PaymentTransitionStateAction template) {
      PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}