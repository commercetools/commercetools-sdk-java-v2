
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
 *  <p>Generated after adding a Custom Field to a PaymentMethodInfo using the Set MethodInfo CustomField update action on Payments and the Set MethodInfo CustomField update action on My Payments. If a Custom Field already exists with the same name, a PaymentMethodInfoCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldAddedMessage paymentMethodInfoCustomFieldAddedMessage = PaymentMethodInfoCustomFieldAddedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldAddedMessageImpl.class)
public interface PaymentMethodInfoCustomFieldAddedMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldAddedMessage
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_ADDED = "PaymentMethodInfoCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomFieldAddedMessage
     */
    public static PaymentMethodInfoCustomFieldAddedMessage of() {
        return new PaymentMethodInfoCustomFieldAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldAddedMessage of(final PaymentMethodInfoCustomFieldAddedMessage template) {
        PaymentMethodInfoCustomFieldAddedMessageImpl instance = new PaymentMethodInfoCustomFieldAddedMessageImpl();
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
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodInfoCustomFieldAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldAddedMessage deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldAddedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldAddedMessageImpl instance = new PaymentMethodInfoCustomFieldAddedMessageImpl();
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
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomFieldAddedMessage
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessageBuilder builder() {
        return PaymentMethodInfoCustomFieldAddedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessageBuilder builder(
            final PaymentMethodInfoCustomFieldAddedMessage template) {
        return PaymentMethodInfoCustomFieldAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldAddedMessage(
            Function<PaymentMethodInfoCustomFieldAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldAddedMessage>";
            }
        };
    }
}
