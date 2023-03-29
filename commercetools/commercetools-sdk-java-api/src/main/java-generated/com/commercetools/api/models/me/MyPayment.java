
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPayment
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPayment myPayment = MyPayment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentImpl.class)
public interface MyPayment extends com.commercetools.api.models.DomainResource<MyPayment>,
        com.commercetools.api.models.Customizable<MyPayment> {

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
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Anonymous session associated with the Payment. Set automatically with a token for an anonymous session. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @return amountPlanned
     */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public CentPrecisionMoney getAmountPlanned();

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @return paymentMethodInfo
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @return transactions
     */
    @NotNull
    @Valid
    @JsonProperty("transactions")
    public List<Transaction> getTransactions();

    /**
     *  <p>Custom Fields defined for the Payment.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

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
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Anonymous session associated with the Payment. Set automatically with a token for an anonymous session. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     */

    public void setAmountPlanned(final CentPrecisionMoney amountPlanned);

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     */

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

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
     *  <p>Custom Fields defined for the Payment.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of MyPayment
     */
    public static MyPayment of() {
        return new MyPaymentImpl();
    }

    /**
     * factory method to create a shallow copy MyPayment
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPayment of(final MyPayment template) {
        MyPaymentImpl instance = new MyPaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setTransactions(template.getTransactions());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPayment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPayment deepCopy(@Nullable final MyPayment template) {
        if (template == null) {
            return null;
        }
        MyPaymentImpl instance = new MyPaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAmountPlanned(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getAmountPlanned()));
        instance.setPaymentMethodInfo(
            com.commercetools.api.models.payment.PaymentMethodInfo.deepCopy(template.getPaymentMethodInfo()));
        instance.setTransactions(Optional.ofNullable(template.getTransactions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment.Transaction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for MyPayment
     * @return builder
     */
    public static MyPaymentBuilder builder() {
        return MyPaymentBuilder.of();
    }

    /**
     * create builder for MyPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentBuilder builder(final MyPayment template) {
        return MyPaymentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPayment(Function<MyPayment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPayment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPayment>() {
            @Override
            public String toString() {
                return "TypeReference<MyPayment>";
            }
        };
    }
}
