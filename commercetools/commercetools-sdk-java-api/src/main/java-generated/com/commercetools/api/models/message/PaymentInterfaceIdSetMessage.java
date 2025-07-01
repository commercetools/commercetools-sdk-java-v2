
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set InterfaceId update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInterfaceIdSetMessage paymentInterfaceIdSetMessage = PaymentInterfaceIdSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentInterfaceIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentInterfaceIdSetMessageImpl.class)
public interface PaymentInterfaceIdSetMessage extends Message {

    /**
     * discriminator value for PaymentInterfaceIdSetMessage
     */
    String PAYMENT_INTERFACE_ID_SET = "PaymentInterfaceIdSet";

    /**
     *  <p>Interface ID of the Payment after the Set InterfaceId update action.</p>
     * @return interfaceId
     */

    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Interface ID of the Payment before the Set InterfaceId update action.</p>
     * @return oldInterfaceId
     */

    @JsonProperty("oldInterfaceId")
    public String getOldInterfaceId();

    /**
     *  <p>Interface ID of the Payment after the Set InterfaceId update action.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     *  <p>Interface ID of the Payment before the Set InterfaceId update action.</p>
     * @param oldInterfaceId value to be set
     */

    public void setOldInterfaceId(final String oldInterfaceId);

    /**
     * factory method
     * @return instance of PaymentInterfaceIdSetMessage
     */
    public static PaymentInterfaceIdSetMessage of() {
        return new PaymentInterfaceIdSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentInterfaceIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentInterfaceIdSetMessage of(final PaymentInterfaceIdSetMessage template) {
        PaymentInterfaceIdSetMessageImpl instance = new PaymentInterfaceIdSetMessageImpl();
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
        instance.setInterfaceId(template.getInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    public PaymentInterfaceIdSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentInterfaceIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentInterfaceIdSetMessage deepCopy(@Nullable final PaymentInterfaceIdSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentInterfaceIdSetMessageImpl instance = new PaymentInterfaceIdSetMessageImpl();
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
        instance.setInterfaceId(template.getInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentInterfaceIdSetMessage
     * @return builder
     */
    public static PaymentInterfaceIdSetMessageBuilder builder() {
        return PaymentInterfaceIdSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentInterfaceIdSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInterfaceIdSetMessageBuilder builder(final PaymentInterfaceIdSetMessage template) {
        return PaymentInterfaceIdSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentInterfaceIdSetMessage(Function<PaymentInterfaceIdSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInterfaceIdSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInterfaceIdSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInterfaceIdSetMessage>";
            }
        };
    }
}
