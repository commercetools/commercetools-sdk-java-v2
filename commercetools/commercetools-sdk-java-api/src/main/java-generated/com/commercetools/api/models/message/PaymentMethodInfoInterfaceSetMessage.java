
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set MethodInfo Interface update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceSetMessage paymentMethodInfoInterfaceSetMessage = PaymentMethodInfoInterfaceSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoInterfaceSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoInterfaceSetMessageImpl.class)
public interface PaymentMethodInfoInterfaceSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoInterfaceSetMessage
     */
    String PAYMENT_METHOD_INFO_INTERFACE_SET = "PaymentMethodInfoInterfaceSet";

    /**
     *  <p>Payment interface of the Payment Method after the Set MethodInfo Interface update action.</p>
     * @return interface
     */

    @JsonProperty("interface")
    public String getInterface();

    /**
     *  <p>Payment interface of the Payment Method before the Set MethodInfo Interface update action.</p>
     * @return oldInterface
     */

    @JsonProperty("oldInterface")
    public String getOldInterface();

    /**
     *  <p>Payment interface of the Payment Method after the Set MethodInfo Interface update action.</p>
     * @param _interface value to be set
     */

    public void setInterface(final String _interface);

    /**
     *  <p>Payment interface of the Payment Method before the Set MethodInfo Interface update action.</p>
     * @param oldInterface value to be set
     */

    public void setOldInterface(final String oldInterface);

    /**
     * factory method
     * @return instance of PaymentMethodInfoInterfaceSetMessage
     */
    public static PaymentMethodInfoInterfaceSetMessage of() {
        return new PaymentMethodInfoInterfaceSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoInterfaceSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoInterfaceSetMessage of(final PaymentMethodInfoInterfaceSetMessage template) {
        PaymentMethodInfoInterfaceSetMessageImpl instance = new PaymentMethodInfoInterfaceSetMessageImpl();
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
        instance.setInterface(template.getInterface());
        instance.setOldInterface(template.getOldInterface());
        return instance;
    }

    public PaymentMethodInfoInterfaceSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoInterfaceSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoInterfaceSetMessage deepCopy(
            @Nullable final PaymentMethodInfoInterfaceSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoInterfaceSetMessageImpl instance = new PaymentMethodInfoInterfaceSetMessageImpl();
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
        instance.setInterface(template.getInterface());
        instance.setOldInterface(template.getOldInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoInterfaceSetMessage
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessageBuilder builder() {
        return PaymentMethodInfoInterfaceSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessageBuilder builder(
            final PaymentMethodInfoInterfaceSetMessage template) {
        return PaymentMethodInfoInterfaceSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoInterfaceSetMessage(Function<PaymentMethodInfoInterfaceSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoInterfaceSetMessage>";
            }
        };
    }
}
