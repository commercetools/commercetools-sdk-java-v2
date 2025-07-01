
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from a Payment Method using the Set Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomTypeRemovedMessage paymentMethodCustomTypeRemovedMessage = PaymentMethodCustomTypeRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomTypeRemovedMessageImpl.class)
public interface PaymentMethodCustomTypeRemovedMessage extends Message {

    /**
     * discriminator value for PaymentMethodCustomTypeRemovedMessage
     */
    String PAYMENT_METHOD_CUSTOM_TYPE_REMOVED = "PaymentMethodCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodCustomTypeRemovedMessage
     */
    public static PaymentMethodCustomTypeRemovedMessage of() {
        return new PaymentMethodCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomTypeRemovedMessage of(final PaymentMethodCustomTypeRemovedMessage template) {
        PaymentMethodCustomTypeRemovedMessageImpl instance = new PaymentMethodCustomTypeRemovedMessageImpl();
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
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public PaymentMethodCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomTypeRemovedMessage deepCopy(
            @Nullable final PaymentMethodCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomTypeRemovedMessageImpl instance = new PaymentMethodCustomTypeRemovedMessageImpl();
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
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomTypeRemovedMessage
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessageBuilder builder() {
        return PaymentMethodCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessageBuilder builder(
            final PaymentMethodCustomTypeRemovedMessage template) {
        return PaymentMethodCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomTypeRemovedMessage(Function<PaymentMethodCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomTypeRemovedMessage>";
            }
        };
    }
}
