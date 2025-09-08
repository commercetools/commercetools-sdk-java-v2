
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing Custom Fields from a PaymentMethodInfo using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomTypeAction" rel="nofollow">Set MethodInfo Custom Type</a> update action on Payments and the <a href="https://docs.commercetools.com/apis/ctp:api:type:MyPaymentSetMethodInfoCustomTypeAction" rel="nofollow">Set MethodInfo Custom Type</a> update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomTypeRemovedMessage paymentMethodInfoCustomTypeRemovedMessage = PaymentMethodInfoCustomTypeRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomTypeRemovedMessageImpl.class)
public interface PaymentMethodInfoCustomTypeRemovedMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoCustomTypeRemovedMessage
     */
    String PAYMENT_METHOD_INFO_CUSTOM_TYPE_REMOVED = "PaymentMethodInfoCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomTypeRemovedMessage
     */
    public static PaymentMethodInfoCustomTypeRemovedMessage of() {
        return new PaymentMethodInfoCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomTypeRemovedMessage of(
            final PaymentMethodInfoCustomTypeRemovedMessage template) {
        PaymentMethodInfoCustomTypeRemovedMessageImpl instance = new PaymentMethodInfoCustomTypeRemovedMessageImpl();
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

    public PaymentMethodInfoCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomTypeRemovedMessage deepCopy(
            @Nullable final PaymentMethodInfoCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomTypeRemovedMessageImpl instance = new PaymentMethodInfoCustomTypeRemovedMessageImpl();
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
     * builder factory method for PaymentMethodInfoCustomTypeRemovedMessage
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessageBuilder builder() {
        return PaymentMethodInfoCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessageBuilder builder(
            final PaymentMethodInfoCustomTypeRemovedMessage template) {
        return PaymentMethodInfoCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomTypeRemovedMessage(
            Function<PaymentMethodInfoCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomTypeRemovedMessage>";
            }
        };
    }
}
