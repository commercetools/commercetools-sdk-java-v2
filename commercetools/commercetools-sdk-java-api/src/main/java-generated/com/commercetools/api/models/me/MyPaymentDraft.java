
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentDraft myPaymentDraft = MyPaymentDraft.builder()
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentDraftImpl.class)
public interface MyPaymentDraft extends com.commercetools.api.models.CustomizableDraft<MyPaymentDraft>,
        io.vrap.rmf.base.client.Draft<MyPaymentDraft> {

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
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
     *  <p>Custom Fields for the Payment.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @return transaction
     */
    @Valid
    @JsonProperty("transaction")
    public MyTransactionDraft getTransaction();

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     */

    public void setAmountPlanned(final Money amountPlanned);

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     */

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final MyTransactionDraft transaction);

    /**
     * factory method
     * @return instance of MyPaymentDraft
     */
    public static MyPaymentDraft of() {
        return new MyPaymentDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentDraft of(final MyPaymentDraft template) {
        MyPaymentDraftImpl instance = new MyPaymentDraftImpl();
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setCustom(template.getCustom());
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentDraft deepCopy(@Nullable final MyPaymentDraft template) {
        if (template == null) {
            return null;
        }
        MyPaymentDraftImpl instance = new MyPaymentDraftImpl();
        instance.setAmountPlanned(Optional.ofNullable(template.getAmountPlanned())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setPaymentMethodInfo(Optional.ofNullable(template.getPaymentMethodInfo())
                .map(com.commercetools.api.models.payment.PaymentMethodInfo::deepCopy)
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        instance.setTransaction(Optional.ofNullable(template.getTransaction())
                .map(com.commercetools.api.models.me.MyTransactionDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyPaymentDraft
     * @return builder
     */
    public static MyPaymentDraftBuilder builder() {
        return MyPaymentDraftBuilder.of();
    }

    /**
     * create builder for MyPaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentDraftBuilder builder(final MyPaymentDraft template) {
        return MyPaymentDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentDraft(Function<MyPaymentDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentDraft>";
            }
        };
    }
}
