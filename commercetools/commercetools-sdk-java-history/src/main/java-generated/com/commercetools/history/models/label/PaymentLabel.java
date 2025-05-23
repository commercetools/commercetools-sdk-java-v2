
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentLabel paymentLabel = PaymentLabel.builder()
 *             .key("{key}")
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentLabelImpl.class)
public interface PaymentLabel extends Label {

    /**
     * discriminator value for PaymentLabel
     */
    String PAYMENT_LABEL = "PaymentLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @return amountPlanned
     */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public Money getAmountPlanned();

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @param amountPlanned value to be set
     */

    public void setAmountPlanned(final Money amountPlanned);

    /**
     * factory method
     * @return instance of PaymentLabel
     */
    public static PaymentLabel of() {
        return new PaymentLabelImpl();
    }

    /**
     * factory method to create a shallow copy PaymentLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentLabel of(final PaymentLabel template) {
        PaymentLabelImpl instance = new PaymentLabelImpl();
        instance.setKey(template.getKey());
        instance.setAmountPlanned(template.getAmountPlanned());
        return instance;
    }

    public PaymentLabel copyDeep();

    /**
     * factory method to create a deep copy of PaymentLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentLabel deepCopy(@Nullable final PaymentLabel template) {
        if (template == null) {
            return null;
        }
        PaymentLabelImpl instance = new PaymentLabelImpl();
        instance.setKey(template.getKey());
        instance.setAmountPlanned(com.commercetools.history.models.common.Money.deepCopy(template.getAmountPlanned()));
        return instance;
    }

    /**
     * builder factory method for PaymentLabel
     * @return builder
     */
    public static PaymentLabelBuilder builder() {
        return PaymentLabelBuilder.of();
    }

    /**
     * create builder for PaymentLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentLabelBuilder builder(final PaymentLabel template) {
        return PaymentLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentLabel(Function<PaymentLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentLabel>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentLabel>";
            }
        };
    }
}
