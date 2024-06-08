
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentDraft paymentDraft = PaymentDraft.builder()
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentDraftImpl.class)
public interface PaymentDraft extends com.commercetools.api.models.CustomizableDraft<PaymentDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<PaymentDraft> {

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique. Once set, it cannot be changed.</p>
     * @return interfaceId
     */

    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @return amountPlanned
     */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public Money getAmountPlanned();

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @return paymentMethodInfo
     */
    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    /**
     *  <p>Current status of the Payment.</p>
     * @return paymentStatus
     */
    @Valid
    @JsonProperty("paymentStatus")
    public PaymentStatusDraft getPaymentStatus();

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @return transactions
     */
    @Valid
    @JsonProperty("transactions")
    public List<TransactionDraft> getTransactions();

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @return interfaceInteractions
     */
    @Valid
    @JsonProperty("interfaceInteractions")
    public List<CustomFieldsDraft> getInterfaceInteractions();

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the Payment.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique. Once set, it cannot be changed.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     */

    public void setAmountPlanned(final Money amountPlanned);

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     */

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    /**
     *  <p>Current status of the Payment.</p>
     * @param paymentStatus value to be set
     */

    public void setPaymentStatus(final PaymentStatusDraft paymentStatus);

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions values to be set
     */

    @JsonIgnore
    public void setTransactions(final TransactionDraft... transactions);

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions values to be set
     */

    public void setTransactions(final List<TransactionDraft> transactions);

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions values to be set
     */

    @JsonIgnore
    public void setInterfaceInteractions(final CustomFieldsDraft... interfaceInteractions);

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions values to be set
     */

    public void setInterfaceInteractions(final List<CustomFieldsDraft> interfaceInteractions);

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>User-defined unique identifier for the Payment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PaymentDraft
     */
    public static PaymentDraft of() {
        return new PaymentDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentDraft of(final PaymentDraft template) {
        PaymentDraftImpl instance = new PaymentDraftImpl();
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

    /**
     * factory method to create a deep copy of PaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentDraft deepCopy(@Nullable final PaymentDraft template) {
        if (template == null) {
            return null;
        }
        PaymentDraftImpl instance = new PaymentDraftImpl();
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setInterfaceId(template.getInterfaceId());
        instance.setAmountPlanned(com.commercetools.api.models.common.Money.deepCopy(template.getAmountPlanned()));
        instance.setPaymentMethodInfo(
            com.commercetools.api.models.payment.PaymentMethodInfo.deepCopy(template.getPaymentMethodInfo()));
        instance.setPaymentStatus(
            com.commercetools.api.models.payment.PaymentStatusDraft.deepCopy(template.getPaymentStatus()));
        instance.setTransactions(Optional.ofNullable(template.getTransactions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment.TransactionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInterfaceInteractions(Optional.ofNullable(template.getInterfaceInteractions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentDraft
     * @return builder
     */
    public static PaymentDraftBuilder builder() {
        return PaymentDraftBuilder.of();
    }

    /**
     * create builder for PaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentDraftBuilder builder(final PaymentDraft template) {
        return PaymentDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentDraft(Function<PaymentDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentDraft>";
            }
        };
    }
}
