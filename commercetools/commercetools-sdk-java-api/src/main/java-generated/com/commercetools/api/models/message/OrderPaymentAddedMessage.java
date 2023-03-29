
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Payment update action or when a Payment is added via Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentAddedMessage orderPaymentAddedMessage = OrderPaymentAddedMessage.builder()
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
@JsonDeserialize(as = OrderPaymentAddedMessageImpl.class)
public interface OrderPaymentAddedMessage extends Message {

    /**
     * discriminator value for OrderPaymentAddedMessage
     */
    String ORDER_PAYMENT_ADDED = "OrderPaymentAdded";

    /**
     *  <p>Payment that was added to the Order.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    /**
     *  <p>Payment that was added to the Order.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentReference payment);

    /**
     * factory method
     * @return instance of OrderPaymentAddedMessage
     */
    public static OrderPaymentAddedMessage of() {
        return new OrderPaymentAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderPaymentAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentAddedMessage of(final OrderPaymentAddedMessage template) {
        OrderPaymentAddedMessageImpl instance = new OrderPaymentAddedMessageImpl();
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
     * factory method to create a deep copy of OrderPaymentAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentAddedMessage deepCopy(@Nullable final OrderPaymentAddedMessage template) {
        if (template == null) {
            return null;
        }
        OrderPaymentAddedMessageImpl instance = new OrderPaymentAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setPayment(Optional.ofNullable(template.getPayment())
                .map(com.commercetools.api.models.payment.PaymentReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderPaymentAddedMessage
     * @return builder
     */
    public static OrderPaymentAddedMessageBuilder builder() {
        return OrderPaymentAddedMessageBuilder.of();
    }

    /**
     * create builder for OrderPaymentAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentAddedMessageBuilder builder(final OrderPaymentAddedMessage template) {
        return OrderPaymentAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentAddedMessage(Function<OrderPaymentAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentAddedMessage>";
            }
        };
    }
}
