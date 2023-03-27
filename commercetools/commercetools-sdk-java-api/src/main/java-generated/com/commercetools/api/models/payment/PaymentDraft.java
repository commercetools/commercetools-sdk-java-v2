
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
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

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
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountAuthorized
     */
    @Valid
    @JsonProperty("amountAuthorized")
    public Money getAmountAuthorized();

    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     * @return authorizedUntil
     */

    @JsonProperty("authorizedUntil")
    public String getAuthorizedUntil();

    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountPaid
     */
    @Valid
    @JsonProperty("amountPaid")
    public Money getAmountPaid();

    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountRefunded
     */
    @Valid
    @JsonProperty("amountRefunded")
    public Money getAmountRefunded();

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
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

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
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountAuthorized value to be set
     */

    public void setAmountAuthorized(final Money amountAuthorized);

    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     * @param authorizedUntil value to be set
     */

    public void setAuthorizedUntil(final String authorizedUntil);

    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountPaid value to be set
     */

    public void setAmountPaid(final Money amountPaid);

    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountRefunded value to be set
     */

    public void setAmountRefunded(final Money amountRefunded);

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
     * factory method to copy an instance of PaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
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
