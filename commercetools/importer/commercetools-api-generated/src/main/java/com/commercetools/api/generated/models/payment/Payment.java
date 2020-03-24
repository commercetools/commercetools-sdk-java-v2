package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.PaymentStatus;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
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

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>A reference to the customer this payment belongs to.</p>
   */
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   /**
   *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   /**
   *  <p>The identifier that is used by the interface that manages the payment (usually the PSP).
   *  Cannot be changed once it has been set.
   *  The combination of this ID and the PaymentMethodInfo <code>paymentInterface</code> must be unique.</p>
   */
   
   @JsonProperty("interfaceId")
   public String getInterfaceId();
   /**
   *  <p>How much money this payment intends to receive from the customer.
   *  The value usually matches the cart or order gross total.</p>
   */
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
   /**
   *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("transactions")
   public List<Transaction> getTransactions();
   /**
   *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP.
   *  Some interactions may result in a transaction.
   *  If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction.
   *  Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("interfaceInteractions")
   public List<CustomFields> getInterfaceInteractions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   *  <p>User-specific unique identifier for the payment (max.
   *  256 characters).</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
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