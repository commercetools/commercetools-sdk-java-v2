
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentDraftImpl.class)
public interface PaymentDraft extends com.commercetools.api.models.CustomizableDraft<PaymentDraft> {

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
    *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    @Deprecated
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
    public Money getAmountPlanned();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("amountAuthorized")
    public Money getAmountAuthorized();

    @JsonProperty("authorizedUntil")
    public String getAuthorizedUntil();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("amountPaid")
    public Money getAmountPaid();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("amountRefunded")
    public Money getAmountRefunded();

    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    @Valid
    @JsonProperty("paymentStatus")
    public PaymentStatusDraft getPaymentStatus();

    /**
    *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
    */
    @Valid
    @JsonProperty("transactions")
    public List<TransactionDraft> getTransactions();

    /**
    *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP.
    *  Some interactions may result in a transaction.
    *  If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction.
    *  Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
    */
    @Valid
    @JsonProperty("interfaceInteractions")
    public List<CustomFieldsDraft> getInterfaceInteractions();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>User-defined unique identifier for the Payment.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public void setAnonymousId(final String anonymousId);

    @Deprecated
    public void setExternalId(final String externalId);

    public void setInterfaceId(final String interfaceId);

    public void setAmountPlanned(final Money amountPlanned);

    public void setAmountAuthorized(final Money amountAuthorized);

    public void setAuthorizedUntil(final String authorizedUntil);

    public void setAmountPaid(final Money amountPaid);

    public void setAmountRefunded(final Money amountRefunded);

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    public void setPaymentStatus(final PaymentStatusDraft paymentStatus);

    @JsonIgnore
    public void setTransactions(final TransactionDraft... transactions);

    public void setTransactions(final List<TransactionDraft> transactions);

    @JsonIgnore
    public void setInterfaceInteractions(final CustomFieldsDraft... interfaceInteractions);

    public void setInterfaceInteractions(final List<CustomFieldsDraft> interfaceInteractions);

    public void setCustom(final CustomFieldsDraft custom);

    public void setKey(final String key);

    public static PaymentDraft of() {
        return new PaymentDraftImpl();
    }

    public static PaymentDraft of(final PaymentDraft template) {
        PaymentDraftImpl instance = new PaymentDraftImpl();
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setExternalId(template.getExternalId());
        instance.setInterfaceId(template.getInterfaceId());
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setAmountAuthorized(template.getAmountAuthorized());
        instance.setAuthorizedUntil(template.getAuthorizedUntil());
        instance.setAmountPaid(template.getAmountPaid());
        instance.setAmountRefunded(template.getAmountRefunded());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setPaymentStatus(template.getPaymentStatus());
        instance.setTransactions(template.getTransactions());
        instance.setInterfaceInteractions(template.getInterfaceInteractions());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentDraftBuilder builder() {
        return PaymentDraftBuilder.of();
    }

    public static PaymentDraftBuilder builder(final PaymentDraft template) {
        return PaymentDraftBuilder.of(template);
    }

    default <T> T withPaymentDraft(Function<PaymentDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentDraft>";
            }
        };
    }
}
