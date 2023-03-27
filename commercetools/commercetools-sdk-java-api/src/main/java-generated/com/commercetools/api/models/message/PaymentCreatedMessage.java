
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.Payment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Payment request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCreatedMessage paymentCreatedMessage = PaymentCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentCreatedMessageImpl.class)
public interface PaymentCreatedMessage extends Message {

    /**
     * discriminator value for PaymentCreatedMessage
     */
    String PAYMENT_CREATED = "PaymentCreated";

    /**
     *  <p>Payment that was created.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public Payment getPayment();

    /**
     *  <p>Payment that was created.</p>
     * @param payment value to be set
     */

    public void setPayment(final Payment payment);

    /**
     * factory method
     * @return instance of PaymentCreatedMessage
     */
    public static PaymentCreatedMessage of() {
        return new PaymentCreatedMessageImpl();
    }

    /**
     * factory method to copy an instance of PaymentCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentCreatedMessage of(final PaymentCreatedMessage template) {
        PaymentCreatedMessageImpl instance = new PaymentCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * builder factory method for PaymentCreatedMessage
     * @return builder
     */
    public static PaymentCreatedMessageBuilder builder() {
        return PaymentCreatedMessageBuilder.of();
    }

    /**
     * create builder for PaymentCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentCreatedMessageBuilder builder(final PaymentCreatedMessage template) {
        return PaymentCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentCreatedMessage(Function<PaymentCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentCreatedMessage>";
            }
        };
    }
}
