
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment_method.PaymentMethodStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set PaymentMethodStatus update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentMethodStatusSetMessage paymentMethodPaymentMethodStatusSetMessage = PaymentMethodPaymentMethodStatusSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodPaymentMethodStatusSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodPaymentMethodStatusSetMessageImpl.class)
public interface PaymentMethodPaymentMethodStatusSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodPaymentMethodStatusSetMessage
     */
    String PAYMENT_METHOD_PAYMENT_METHOD_STATUS_SET = "PaymentMethodPaymentMethodStatusSet";

    /**
     *  <p>Status of the Payment Method after the Set PaymentMethodStatus update action.</p>
     * @return status
     */

    @JsonProperty("status")
    public PaymentMethodStatus getStatus();

    /**
     *  <p>Status of the Payment Method before the Set PaymentMethodStatus update action.</p>
     * @return oldStatus
     */

    @JsonProperty("oldStatus")
    public PaymentMethodStatus getOldStatus();

    /**
     *  <p>Status of the Payment Method after the Set PaymentMethodStatus update action.</p>
     * @param status value to be set
     */

    public void setStatus(final PaymentMethodStatus status);

    /**
     *  <p>Status of the Payment Method before the Set PaymentMethodStatus update action.</p>
     * @param oldStatus value to be set
     */

    public void setOldStatus(final PaymentMethodStatus oldStatus);

    /**
     * factory method
     * @return instance of PaymentMethodPaymentMethodStatusSetMessage
     */
    public static PaymentMethodPaymentMethodStatusSetMessage of() {
        return new PaymentMethodPaymentMethodStatusSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodPaymentMethodStatusSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodPaymentMethodStatusSetMessage of(
            final PaymentMethodPaymentMethodStatusSetMessage template) {
        PaymentMethodPaymentMethodStatusSetMessageImpl instance = new PaymentMethodPaymentMethodStatusSetMessageImpl();
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
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    public PaymentMethodPaymentMethodStatusSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodPaymentMethodStatusSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodPaymentMethodStatusSetMessage deepCopy(
            @Nullable final PaymentMethodPaymentMethodStatusSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodPaymentMethodStatusSetMessageImpl instance = new PaymentMethodPaymentMethodStatusSetMessageImpl();
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
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodPaymentMethodStatusSetMessage
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessageBuilder builder() {
        return PaymentMethodPaymentMethodStatusSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodPaymentMethodStatusSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessageBuilder builder(
            final PaymentMethodPaymentMethodStatusSetMessage template) {
        return PaymentMethodPaymentMethodStatusSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodPaymentMethodStatusSetMessage(
            Function<PaymentMethodPaymentMethodStatusSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentMethodStatusSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentMethodStatusSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodPaymentMethodStatusSetMessage>";
            }
        };
    }
}
