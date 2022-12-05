
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Payment.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Anonymous session associated with the Payment. Set automatically with a token for an anonymous session. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public CentPrecisionMoney getAmountPlanned();

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("transactions")
    public List<Transaction> getTransactions();

    /**
     *  <p>Custom Fields defined for the Payment.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public void setAmountPlanned(final CentPrecisionMoney amountPlanned);

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    @JsonIgnore
    public void setTransactions(final Transaction... transactions);

    public void setTransactions(final List<Transaction> transactions);

    public void setCustom(final CustomFields custom);

    public static MyPayment of() {
        return new MyPaymentImpl();
    }

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

    public static MyPaymentBuilder builder() {
        return MyPaymentBuilder.of();
    }

    public static MyPaymentBuilder builder(final MyPayment template) {
        return MyPaymentBuilder.of(template);
    }

    default <T> T withMyPayment(Function<MyPayment, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPayment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPayment>() {
            @Override
            public String toString() {
                return "TypeReference<MyPayment>";
            }
        };
    }
}
