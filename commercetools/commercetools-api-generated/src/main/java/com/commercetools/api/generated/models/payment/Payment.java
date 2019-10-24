package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.PaymentStatus;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.payment.PaymentImpl;

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
@JsonDeserialize(as = PaymentImpl.class)
public interface Payment extends LoggedResource {

   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   
   @JsonProperty("interfaceId")
   public String getInterfaceId();
   
   @NotNull
   @Valid
   @JsonProperty("amountPlanned")
   public TypedMoney getAmountPlanned();
   
   @Valid
   @JsonProperty("amountAuthorized")
   public TypedMoney getAmountAuthorized();
   
   
   @JsonProperty("authorizedUntil")
   public String getAuthorizedUntil();
   
   @Valid
   @JsonProperty("amountPaid")
   public TypedMoney getAmountPaid();
   
   @Valid
   @JsonProperty("amountRefunded")
   public TypedMoney getAmountRefunded();
   
   @NotNull
   @Valid
   @JsonProperty("paymentMethodInfo")
   public PaymentMethodInfo getPaymentMethodInfo();
   
   @NotNull
   @Valid
   @JsonProperty("paymentStatus")
   public PaymentStatus getPaymentStatus();
   
   @NotNull
   @Valid
   @JsonProperty("transactions")
   public List<Transaction> getTransactions();
   
   @NotNull
   @Valid
   @JsonProperty("interfaceInteractions")
   public List<CustomFields> getInterfaceInteractions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setCustomer(final CustomerReference customer);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setExternalId(final String externalId);
   
   public void setInterfaceId(final String interfaceId);
   
   public void setAmountPlanned(final TypedMoney amountPlanned);
   
   public void setAmountAuthorized(final TypedMoney amountAuthorized);
   
   public void setAuthorizedUntil(final String authorizedUntil);
   
   public void setAmountPaid(final TypedMoney amountPaid);
   
   public void setAmountRefunded(final TypedMoney amountRefunded);
   
   public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);
   
   public void setPaymentStatus(final PaymentStatus paymentStatus);
   
   public void setTransactions(final List<Transaction> transactions);
   
   public void setInterfaceInteractions(final List<CustomFields> interfaceInteractions);
   
   public void setCustom(final CustomFields custom);
   
   public void setKey(final String key);
   
   public static PaymentImpl of(){
      return new PaymentImpl();
   }
   

   public static PaymentImpl of(final Payment template) {
      PaymentImpl instance = new PaymentImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
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