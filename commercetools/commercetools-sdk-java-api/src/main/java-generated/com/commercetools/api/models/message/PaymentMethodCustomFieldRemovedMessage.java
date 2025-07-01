
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
 *  <p>Generated after removing a Custom Field from a Payment Method using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldRemovedMessage paymentMethodCustomFieldRemovedMessage = PaymentMethodCustomFieldRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomFieldRemovedMessageImpl.class)
public interface PaymentMethodCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for PaymentMethodCustomFieldRemovedMessage
     */
    String PAYMENT_METHOD_CUSTOM_FIELD_REMOVED = "PaymentMethodCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of PaymentMethodCustomFieldRemovedMessage
     */
    public static PaymentMethodCustomFieldRemovedMessage of() {
        return new PaymentMethodCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomFieldRemovedMessage of(final PaymentMethodCustomFieldRemovedMessage template) {
        PaymentMethodCustomFieldRemovedMessageImpl instance = new PaymentMethodCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    public PaymentMethodCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomFieldRemovedMessage deepCopy(
            @Nullable final PaymentMethodCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomFieldRemovedMessageImpl instance = new PaymentMethodCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomFieldRemovedMessage
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessageBuilder builder() {
        return PaymentMethodCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessageBuilder builder(
            final PaymentMethodCustomFieldRemovedMessage template) {
        return PaymentMethodCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomFieldRemovedMessage(
            Function<PaymentMethodCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomFieldRemovedMessage>";
            }
        };
    }
}
