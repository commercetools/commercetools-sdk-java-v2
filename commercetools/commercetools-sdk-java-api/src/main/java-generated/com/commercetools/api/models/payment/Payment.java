
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Payment
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Payment payment = Payment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .paymentStatus(paymentStatusBuilder -> paymentStatusBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .plusInterfaceInteractions(interfaceInteractionsBuilder -> interfaceInteractionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentImpl.class)
public interface Payment extends BaseResource, PaymentMixin, com.commercetools.api.models.DomainResource<Payment>,
        com.commercetools.api.models.Referencable<Payment>, com.commercetools.api.models.ResourceIdentifiable<Payment>,
        com.commercetools.api.models.Customizable<Payment>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Payment.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Payment.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Payment was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Payment was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

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
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique.</p>
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
    public CentPrecisionMoney getAmountPlanned();

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountAuthorized
     */
    @Valid
    @JsonProperty("amountAuthorized")
    public TypedMoney getAmountAuthorized();

    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     * @return authorizedUntil
     */

    @JsonProperty("authorizedUntil")
    public String getAuthorizedUntil();

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountPaid
     */
    @Valid
    @JsonProperty("amountPaid")
    public TypedMoney getAmountPaid();

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @return amountRefunded
     */
    @Valid
    @JsonProperty("amountRefunded")
    public TypedMoney getAmountRefunded();

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @return paymentMethodInfo
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    /**
     *  <p>Current status of the Payment.</p>
     * @return paymentStatus
     */
    @NotNull
    @Valid
    @JsonProperty("paymentStatus")
    public PaymentStatus getPaymentStatus();

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @return transactions
     */
    @NotNull
    @Valid
    @JsonProperty("transactions")
    public List<Transaction> getTransactions();

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @return interfaceInteractions
     */
    @NotNull
    @Valid
    @JsonProperty("interfaceInteractions")
    public List<CustomFields> getInterfaceInteractions();

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the Payment.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Payment.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Payment was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Payment was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

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
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     */

    public void setAmountPlanned(final CentPrecisionMoney amountPlanned);

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountAuthorized value to be set
     */

    public void setAmountAuthorized(final TypedMoney amountAuthorized);

    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     * @param authorizedUntil value to be set
     */

    public void setAuthorizedUntil(final String authorizedUntil);

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountPaid value to be set
     */

    public void setAmountPaid(final TypedMoney amountPaid);

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountRefunded value to be set
     */

    public void setAmountRefunded(final TypedMoney amountRefunded);

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     */

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    /**
     *  <p>Current status of the Payment.</p>
     * @param paymentStatus value to be set
     */

    public void setPaymentStatus(final PaymentStatus paymentStatus);

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions values to be set
     */

    @JsonIgnore
    public void setTransactions(final Transaction... transactions);

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions values to be set
     */

    public void setTransactions(final List<Transaction> transactions);

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions values to be set
     */

    @JsonIgnore
    public void setInterfaceInteractions(final CustomFields... interfaceInteractions);

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions values to be set
     */

    public void setInterfaceInteractions(final List<CustomFields> interfaceInteractions);

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of Payment
     */
    public static Payment of() {
        return new PaymentImpl();
    }

    /**
     * factory method to create a shallow copy Payment
     * @param template instance to be copied
     * @return copy instance
     */
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
     * factory method to create a deep copy of Payment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Payment deepCopy(@Nullable final Payment template) {
        if (template == null) {
            return null;
        }
        PaymentImpl instance = new PaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setExternalId(template.getExternalId());
        instance.setInterfaceId(template.getInterfaceId());
        instance.setAmountPlanned(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getAmountPlanned()));
        instance.setAmountAuthorized(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getAmountAuthorized()));
        instance.setAuthorizedUntil(template.getAuthorizedUntil());
        instance.setAmountPaid(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getAmountPaid()));
        instance.setAmountRefunded(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getAmountRefunded()));
        instance.setPaymentMethodInfo(
            com.commercetools.api.models.payment.PaymentMethodInfo.deepCopy(template.getPaymentMethodInfo()));
        instance.setPaymentStatus(
            com.commercetools.api.models.payment.PaymentStatus.deepCopy(template.getPaymentStatus()));
        instance.setTransactions(Optional.ofNullable(template.getTransactions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment.Transaction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInterfaceInteractions(Optional.ofNullable(template.getInterfaceInteractions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for Payment
     * @return builder
     */
    public static PaymentBuilder builder() {
        return PaymentBuilder.of();
    }

    /**
     * create builder for Payment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentBuilder builder(final Payment template) {
        return PaymentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPayment(Function<Payment, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PAYMENT;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Payment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Payment>() {
            @Override
            public String toString() {
                return "TypeReference<Payment>";
            }
        };
    }
}
