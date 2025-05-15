
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PaymentChangeTransactionTimestampAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionTimestampAction paymentChangeTransactionTimestampAction = PaymentChangeTransactionTimestampAction.builder()
 *             .transactionId("{transactionId}")
 *             .timestamp(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeTransactionTimestamp")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentChangeTransactionTimestampActionImpl.class)
public interface PaymentChangeTransactionTimestampAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentChangeTransactionTimestampAction
     */
    String CHANGE_TRANSACTION_TIMESTAMP = "changeTransactionTimestamp";

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Timestamp of the Transaction as reported by the payment service.</p>
     * @return timestamp
     */
    @NotNull
    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Timestamp of the Transaction as reported by the payment service.</p>
     * @param timestamp value to be set
     */

    public void setTimestamp(final ZonedDateTime timestamp);

    /**
     * factory method
     * @return instance of PaymentChangeTransactionTimestampAction
     */
    public static PaymentChangeTransactionTimestampAction of() {
        return new PaymentChangeTransactionTimestampActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentChangeTransactionTimestampAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentChangeTransactionTimestampAction of(final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionImpl instance = new PaymentChangeTransactionTimestampActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    public PaymentChangeTransactionTimestampAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentChangeTransactionTimestampAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentChangeTransactionTimestampAction deepCopy(
            @Nullable final PaymentChangeTransactionTimestampAction template) {
        if (template == null) {
            return null;
        }
        PaymentChangeTransactionTimestampActionImpl instance = new PaymentChangeTransactionTimestampActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    /**
     * builder factory method for PaymentChangeTransactionTimestampAction
     * @return builder
     */
    public static PaymentChangeTransactionTimestampActionBuilder builder() {
        return PaymentChangeTransactionTimestampActionBuilder.of();
    }

    /**
     * create builder for PaymentChangeTransactionTimestampAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeTransactionTimestampActionBuilder builder(
            final PaymentChangeTransactionTimestampAction template) {
        return PaymentChangeTransactionTimestampActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentChangeTransactionTimestampAction(
            Function<PaymentChangeTransactionTimestampAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionTimestampAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionTimestampAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentChangeTransactionTimestampAction>";
            }
        };
    }
}
