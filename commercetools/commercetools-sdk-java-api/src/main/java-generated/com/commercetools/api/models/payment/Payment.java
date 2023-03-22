
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

    public void setAmountPlanned(final CentPrecisionMoney amountPlanned);

    public void setAmountAuthorized(final TypedMoney amountAuthorized);

    public void setAuthorizedUntil(final String authorizedUntil);

    public void setAmountPaid(final TypedMoney amountPaid);

    public void setAmountRefunded(final TypedMoney amountRefunded);

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

    public static PaymentBuilder builder() {
        return PaymentBuilder.of();
    }

    public static PaymentBuilder builder(final Payment template) {
        return PaymentBuilder.of(template);
    }

    default <T> T withPayment(Function<Payment, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PAYMENT;
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
