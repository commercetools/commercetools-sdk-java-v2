
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentInterfaceSetMessage paymentMethodPaymentInterfaceSetMessage = PaymentMethodPaymentInterfaceSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodPaymentInterfaceSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodPaymentInterfaceSetMessageImpl.class)
public interface PaymentMethodPaymentInterfaceSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodPaymentInterfaceSetMessage
     */
    String PAYMENT_METHOD_PAYMENT_INTERFACE_SET = "PaymentMethodPaymentInterfaceSet";

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @return oldPaymentInterface
     */

    @JsonProperty("oldPaymentInterface")
    public String getOldPaymentInterface();

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @param oldPaymentInterface value to be set
     */

    public void setOldPaymentInterface(final String oldPaymentInterface);

    /**
     * factory method
     * @return instance of PaymentMethodPaymentInterfaceSetMessage
     */
    public static PaymentMethodPaymentInterfaceSetMessage of() {
        return new PaymentMethodPaymentInterfaceSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodPaymentInterfaceSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodPaymentInterfaceSetMessage of(final PaymentMethodPaymentInterfaceSetMessage template) {
        PaymentMethodPaymentInterfaceSetMessageImpl instance = new PaymentMethodPaymentInterfaceSetMessageImpl();
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
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setOldPaymentInterface(template.getOldPaymentInterface());
        return instance;
    }

    public PaymentMethodPaymentInterfaceSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodPaymentInterfaceSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodPaymentInterfaceSetMessage deepCopy(
            @Nullable final PaymentMethodPaymentInterfaceSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodPaymentInterfaceSetMessageImpl instance = new PaymentMethodPaymentInterfaceSetMessageImpl();
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
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setOldPaymentInterface(template.getOldPaymentInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodPaymentInterfaceSetMessage
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessageBuilder builder() {
        return PaymentMethodPaymentInterfaceSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodPaymentInterfaceSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessageBuilder builder(
            final PaymentMethodPaymentInterfaceSetMessage template) {
        return PaymentMethodPaymentInterfaceSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodPaymentInterfaceSetMessage(
            Function<PaymentMethodPaymentInterfaceSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentInterfaceSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentInterfaceSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodPaymentInterfaceSetMessage>";
            }
        };
    }
}
