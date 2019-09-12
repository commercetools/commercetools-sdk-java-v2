package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.PaymentStatusDraft;
import com.commercetools.models.Payment.TransactionDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import com.commercetools.models.Payment.PaymentDraftImpl;

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
@JsonDeserialize(as = PaymentDraftImpl.class)
public interface PaymentDraft  {

   
   @Valid
   @JsonProperty("customer")
   public CustomerResourceIdentifier getCustomer();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   
   @JsonProperty("interfaceId")
   public String getInterfaceId();
   
   @NotNull
   @Valid
   @JsonProperty("amountPlanned")
   public Money getAmountPlanned();
   
   @Valid
   @JsonProperty("amountAuthorized")
   public Money getAmountAuthorized();
   
   
   @JsonProperty("authorizedUntil")
   public String getAuthorizedUntil();
   
   @Valid
   @JsonProperty("amountPaid")
   public Money getAmountPaid();
   
   @Valid
   @JsonProperty("amountRefunded")
   public Money getAmountRefunded();
   
   @Valid
   @JsonProperty("paymentMethodInfo")
   public PaymentMethodInfo getPaymentMethodInfo();
   
   @Valid
   @JsonProperty("paymentStatus")
   public PaymentStatusDraft getPaymentStatus();
   
   @Valid
   @JsonProperty("transactions")
   public List<TransactionDraft> getTransactions();
   
   @Valid
   @JsonProperty("interfaceInteractions")
   public List<CustomFieldsDraft> getInterfaceInteractions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setCustomer(final CustomerResourceIdentifier customer);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setExternalId(final String externalId);
   
   public void setInterfaceId(final String interfaceId);
   
   public void setAmountPlanned(final Money amountPlanned);
   
   public void setAmountAuthorized(final Money amountAuthorized);
   
   public void setAuthorizedUntil(final String authorizedUntil);
   
   public void setAmountPaid(final Money amountPaid);
   
   public void setAmountRefunded(final Money amountRefunded);
   
   public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);
   
   public void setPaymentStatus(final PaymentStatusDraft paymentStatus);
   
   public void setTransactions(final List<TransactionDraft> transactions);
   
   public void setInterfaceInteractions(final List<CustomFieldsDraft> interfaceInteractions);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setKey(final String key);
   
   public static PaymentDraftImpl of(){
      return new PaymentDraftImpl();
   }
   

   public static PaymentDraftImpl of(final PaymentDraft template) {
      PaymentDraftImpl instance = new PaymentDraftImpl();
      instance.setAmountAuthorized(template.getAmountAuthorized());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
      instance.setCustom(template.getCustom());
      instance.setAuthorizedUntil(template.getAuthorizedUntil());
      instance.setExternalId(template.getExternalId());
      instance.setTransactions(template.getTransactions());
      instance.setAmountPaid(template.getAmountPaid());
      instance.setAmountRefunded(template.getAmountRefunded());
      instance.setAmountPlanned(template.getAmountPlanned());
      instance.setInterfaceInteractions(template.getInterfaceInteractions());
      instance.setInterfaceId(template.getInterfaceId());
      instance.setKey(template.getKey());
      instance.setPaymentStatus(template.getPaymentStatus());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}