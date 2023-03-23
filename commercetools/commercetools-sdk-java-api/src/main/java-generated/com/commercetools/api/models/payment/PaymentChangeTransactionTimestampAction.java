
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentChangeTransactionTimestampActionImpl.class)
public interface PaymentChangeTransactionTimestampAction extends PaymentUpdateAction {

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

    public void setTransactionId(final String transactionId);

    public void setTimestamp(final ZonedDateTime timestamp);

    public static PaymentChangeTransactionTimestampAction of() {
        return new PaymentChangeTransactionTimestampActionImpl();
    }

    public static PaymentChangeTransactionTimestampAction of(final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionImpl instance = new PaymentChangeTransactionTimestampActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    public static PaymentChangeTransactionTimestampActionBuilder builder() {
        return PaymentChangeTransactionTimestampActionBuilder.of();
    }

    public static PaymentChangeTransactionTimestampActionBuilder builder(
            final PaymentChangeTransactionTimestampAction template) {
        return PaymentChangeTransactionTimestampActionBuilder.of(template);
    }

    default <T> T withPaymentChangeTransactionTimestampAction(
            Function<PaymentChangeTransactionTimestampAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionTimestampAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionTimestampAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentChangeTransactionTimestampAction>";
            }
        };
    }
}
