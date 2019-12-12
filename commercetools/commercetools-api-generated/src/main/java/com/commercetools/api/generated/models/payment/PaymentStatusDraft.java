package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentStatusDraftImpl;

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
@JsonDeserialize(as = PaymentStatusDraftImpl.class)
public interface PaymentStatusDraft  {

   
   
   @JsonProperty("interfaceCode")
   public String getInterfaceCode();
   
   
   @JsonProperty("interfaceText")
   public String getInterfaceText();
   
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();

   public void setInterfaceCode(final String interfaceCode);
   
   public void setInterfaceText(final String interfaceText);
   
   public void setState(final StateResourceIdentifier state);
   
   public static PaymentStatusDraftImpl of(){
      return new PaymentStatusDraftImpl();
   }
   

   public static PaymentStatusDraftImpl of(final PaymentStatusDraft template) {
      PaymentStatusDraftImpl instance = new PaymentStatusDraftImpl();
      instance.setInterfaceText(template.getInterfaceText());
      instance.setState(template.getState());
      instance.setInterfaceCode(template.getInterfaceCode());
      return instance;
   }

}