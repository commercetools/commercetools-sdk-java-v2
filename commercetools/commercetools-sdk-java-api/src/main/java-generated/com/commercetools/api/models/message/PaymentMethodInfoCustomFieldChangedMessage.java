
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
 *  <p>Generated after changing an existing Custom Field on a PaymentMethodInfo using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on Payments and the <a href="https://docs.commercetools.com/apis/ctp:api:type:MyPaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldChangedMessage paymentMethodInfoCustomFieldChangedMessage = PaymentMethodInfoCustomFieldChangedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldChangedMessageImpl.class)
public interface PaymentMethodInfoCustomFieldChangedMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldChangedMessage
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_CHANGED = "PaymentMethodInfoCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomFieldChangedMessage
     */
    public static PaymentMethodInfoCustomFieldChangedMessage of() {
        return new PaymentMethodInfoCustomFieldChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldChangedMessage of(
            final PaymentMethodInfoCustomFieldChangedMessage template) {
        PaymentMethodInfoCustomFieldChangedMessageImpl instance = new PaymentMethodInfoCustomFieldChangedMessageImpl();
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

    public PaymentMethodInfoCustomFieldChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldChangedMessage deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldChangedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldChangedMessageImpl instance = new PaymentMethodInfoCustomFieldChangedMessageImpl();
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
     * builder factory method for PaymentMethodInfoCustomFieldChangedMessage
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessageBuilder builder() {
        return PaymentMethodInfoCustomFieldChangedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessageBuilder builder(
            final PaymentMethodInfoCustomFieldChangedMessage template) {
        return PaymentMethodInfoCustomFieldChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldChangedMessage(
            Function<PaymentMethodInfoCustomFieldChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldChangedMessage>";
            }
        };
    }
}
