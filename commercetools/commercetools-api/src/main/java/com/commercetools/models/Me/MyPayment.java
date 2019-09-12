package com.commercetools.models.Me;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Me.MyPaymentImpl;

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
@JsonDeserialize(as = MyPaymentImpl.class)
public interface MyPayment  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   @NotNull
   @Valid
   @JsonProperty("amountPlanned")
   public TypedMoney getAmountPlanned();
   
   @NotNull
   @Valid
   @JsonProperty("paymentMethodInfo")
   public PaymentMethodInfo getPaymentMethodInfo();
   
   @NotNull
   @Valid
   @JsonProperty("transactions")
   public List<Transaction> getTransactions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCustomer(final CustomerReference customer);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setAmountPlanned(final TypedMoney amountPlanned);
   
   public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);
   
   public void setTransactions(final List<Transaction> transactions);
   
   public void setCustom(final CustomFields custom);
   
   public static MyPaymentImpl of(){
      return new MyPaymentImpl();
   }
   

   public static MyPaymentImpl of(final MyPayment template) {
      MyPaymentImpl instance = new MyPaymentImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
      instance.setCustom(template.getCustom());
      instance.setAmountPlanned(template.getAmountPlanned());
      instance.setId(template.getId());
      instance.setTransactions(template.getTransactions());
      instance.setVersion(template.getVersion());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}