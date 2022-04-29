
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentImpl.class)
public interface Payment extends BaseResource, com.commercetools.api.models.DomainResource<Payment>,
        com.commercetools.api.models.Referencable<Payment>, com.commercetools.api.models.ResourceIdentifiable<Payment>,
        com.commercetools.api.models.Customizable<Payment> {

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
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
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

    public void setInterfaceId(final String interfaceId);

    public void setAmountPlanned(final TypedMoney amountPlanned);

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    public void setPaymentStatus(final PaymentStatus paymentStatus);

    @JsonIgnore
    public void setTransactions(final Transaction... transactions);

    public void setTransactions(final List<Transaction> transactions);

    @JsonIgnore
    public void setInterfaceInteractions(final CustomFields... interfaceInteractions);

    public void setInterfaceInteractions(final List<CustomFields> interfaceInteractions);

    public void setCustom(final CustomFields custom);

    public void setKey(final String key);

    public static Payment of() {
        return new PaymentImpl();
    }

    public static Payment of(final Payment template) {
        PaymentImpl instance = new PaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setInterfaceId(template.getInterfaceId());
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setPaymentStatus(template.getPaymentStatus());
        instance.setTransactions(template.getTransactions());
        instance.setInterfaceInteractions(template.getInterfaceInteractions());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentBuilder builder() {
        return PaymentBuilder.of();
    }

    public static PaymentBuilder builder(final Payment template) {
        return PaymentBuilder.of(template);
    }

    default <T> T withPayment(Function<Payment, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.payment.PaymentResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.payment.PaymentReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Payment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Payment>() {
            @Override
            public String toString() {
                return "TypeReference<Payment>";
            }
        };
    }
}
