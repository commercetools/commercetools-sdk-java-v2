
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionInterfaceIdSetMessagePayload paymentTransactionInterfaceIdSetMessagePayload = PaymentTransactionInterfaceIdSetMessagePayload.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentTransactionInterfaceIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionInterfaceIdSetMessagePayloadImpl.class)
public interface PaymentTransactionInterfaceIdSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentTransactionInterfaceIdSetMessagePayload
     */
    String PAYMENT_TRANSACTION_INTERFACE_ID_SET = "PaymentTransactionInterfaceIdSet";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return newInterfaceId
     */

    @JsonProperty("newInterfaceId")
    public String getNewInterfaceId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return oldInterfaceId
     */

    @JsonProperty("oldInterfaceId")
    public String getOldInterfaceId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param newInterfaceId value to be set
     */

    public void setNewInterfaceId(final String newInterfaceId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param oldInterfaceId value to be set
     */

    public void setOldInterfaceId(final String oldInterfaceId);

    /**
     * factory method
     * @return instance of PaymentTransactionInterfaceIdSetMessagePayload
     */
    public static PaymentTransactionInterfaceIdSetMessagePayload of() {
        return new PaymentTransactionInterfaceIdSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentTransactionInterfaceIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentTransactionInterfaceIdSetMessagePayload of(
            final PaymentTransactionInterfaceIdSetMessagePayload template) {
        PaymentTransactionInterfaceIdSetMessagePayloadImpl instance = new PaymentTransactionInterfaceIdSetMessagePayloadImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setNewInterfaceId(template.getNewInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    public PaymentTransactionInterfaceIdSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentTransactionInterfaceIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransactionInterfaceIdSetMessagePayload deepCopy(
            @Nullable final PaymentTransactionInterfaceIdSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentTransactionInterfaceIdSetMessagePayloadImpl instance = new PaymentTransactionInterfaceIdSetMessagePayloadImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setNewInterfaceId(template.getNewInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionInterfaceIdSetMessagePayload
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessagePayloadBuilder builder() {
        return PaymentTransactionInterfaceIdSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentTransactionInterfaceIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessagePayloadBuilder builder(
            final PaymentTransactionInterfaceIdSetMessagePayload template) {
        return PaymentTransactionInterfaceIdSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionInterfaceIdSetMessagePayload(
            Function<PaymentTransactionInterfaceIdSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionInterfaceIdSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionInterfaceIdSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionInterfaceIdSetMessagePayload>";
            }
        };
    }
}
