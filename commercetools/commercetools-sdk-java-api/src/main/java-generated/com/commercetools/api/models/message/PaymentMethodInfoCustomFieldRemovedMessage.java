
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
 *  <p>Generated after removing a Custom Field from a PaymentMethodInfo using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on Payments and the <a href="https://docs.commercetools.com/apis/ctp:api:type:MyPaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldRemovedMessage paymentMethodInfoCustomFieldRemovedMessage = PaymentMethodInfoCustomFieldRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldRemovedMessageImpl.class)
public interface PaymentMethodInfoCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldRemovedMessage
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_REMOVED = "PaymentMethodInfoCustomFieldRemoved";

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
     * @return instance of PaymentMethodInfoCustomFieldRemovedMessage
     */
    public static PaymentMethodInfoCustomFieldRemovedMessage of() {
        return new PaymentMethodInfoCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldRemovedMessage of(
            final PaymentMethodInfoCustomFieldRemovedMessage template) {
        PaymentMethodInfoCustomFieldRemovedMessageImpl instance = new PaymentMethodInfoCustomFieldRemovedMessageImpl();
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

    public PaymentMethodInfoCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldRemovedMessage deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldRemovedMessageImpl instance = new PaymentMethodInfoCustomFieldRemovedMessageImpl();
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
     * builder factory method for PaymentMethodInfoCustomFieldRemovedMessage
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessageBuilder builder() {
        return PaymentMethodInfoCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessageBuilder builder(
            final PaymentMethodInfoCustomFieldRemovedMessage template) {
        return PaymentMethodInfoCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldRemovedMessage(
            Function<PaymentMethodInfoCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldRemovedMessage>";
            }
        };
    }
}
