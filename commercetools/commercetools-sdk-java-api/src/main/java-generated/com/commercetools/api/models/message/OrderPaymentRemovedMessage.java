
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemovePaymentAction" rel="nofollow">Remove Payment</a> update action or when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> is removed via <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemovePaymentAction" rel="nofollow">Order Edits</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentRemovedMessage orderPaymentRemovedMessage = OrderPaymentRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .paymentRef(paymentRefBuilder -> paymentRefBuilder)
 *             .removedPaymentInfo(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderPaymentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPaymentRemovedMessageImpl.class)
public interface OrderPaymentRemovedMessage extends Message {

    /**
     * discriminator value for OrderPaymentRemovedMessage
     */
    String ORDER_PAYMENT_REMOVED = "OrderPaymentRemoved";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return paymentRef
     */
    @NotNull
    @Valid
    @JsonProperty("paymentRef")
    public PaymentReference getPaymentRef();

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @return removedPaymentInfo
     */
    @NotNull
    @JsonProperty("removedPaymentInfo")
    public Boolean getRemovedPaymentInfo();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param paymentRef value to be set
     */

    public void setPaymentRef(final PaymentReference paymentRef);

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @param removedPaymentInfo value to be set
     */

    public void setRemovedPaymentInfo(final Boolean removedPaymentInfo);

    /**
     * factory method
     * @return instance of OrderPaymentRemovedMessage
     */
    public static OrderPaymentRemovedMessage of() {
        return new OrderPaymentRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderPaymentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentRemovedMessage of(final OrderPaymentRemovedMessage template) {
        OrderPaymentRemovedMessageImpl instance = new OrderPaymentRemovedMessageImpl();
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
        instance.setPaymentRef(template.getPaymentRef());
        instance.setRemovedPaymentInfo(template.getRemovedPaymentInfo());
        return instance;
    }

    public OrderPaymentRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderPaymentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentRemovedMessage deepCopy(@Nullable final OrderPaymentRemovedMessage template) {
        if (template == null) {
            return null;
        }
        OrderPaymentRemovedMessageImpl instance = new OrderPaymentRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setPaymentRef(
            com.commercetools.api.models.payment.PaymentReference.deepCopy(template.getPaymentRef()));
        instance.setRemovedPaymentInfo(template.getRemovedPaymentInfo());
        return instance;
    }

    /**
     * builder factory method for OrderPaymentRemovedMessage
     * @return builder
     */
    public static OrderPaymentRemovedMessageBuilder builder() {
        return OrderPaymentRemovedMessageBuilder.of();
    }

    /**
     * create builder for OrderPaymentRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentRemovedMessageBuilder builder(final OrderPaymentRemovedMessage template) {
        return OrderPaymentRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentRemovedMessage(Function<OrderPaymentRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentRemovedMessage>";
            }
        };
    }
}
