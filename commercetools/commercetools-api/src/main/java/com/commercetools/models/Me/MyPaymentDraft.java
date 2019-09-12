package com.commercetools.models.Me;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Me.MyTransactionDraft;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Type.CustomFieldsDraft;
import com.commercetools.models.Me.MyPaymentDraftImpl;

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
@JsonDeserialize(as = MyPaymentDraftImpl.class)
public interface MyPaymentDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("amountPlanned")
   public Money getAmountPlanned();
   
   @Valid
   @JsonProperty("paymentMethodInfo")
   public PaymentMethodInfo getPaymentMethodInfo();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("transaction")
   public MyTransactionDraft getTransaction();

   public void setAmountPlanned(final Money amountPlanned);
   
   public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setTransaction(final MyTransactionDraft transaction);
   
   public static MyPaymentDraftImpl of(){
      return new MyPaymentDraftImpl();
   }
   

   public static MyPaymentDraftImpl of(final MyPaymentDraft template) {
      MyPaymentDraftImpl instance = new MyPaymentDraftImpl();
      instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
      instance.setCustom(template.getCustom());
      instance.setAmountPlanned(template.getAmountPlanned());
      instance.setTransaction(template.getTransaction());
      return instance;
   }

}