
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
 *  <p>Generated after adding a Custom Field to a Payment Method using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. If a Custom Field already exists with the same name, a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodCustomFieldChangedMessage" rel="nofollow">PaymentMethodCustomFieldChanged</a> Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldAddedMessage paymentMethodCustomFieldAddedMessage = PaymentMethodCustomFieldAddedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomFieldAddedMessageImpl.class)
public interface PaymentMethodCustomFieldAddedMessage extends Message {

    /**
     * discriminator value for PaymentMethodCustomFieldAddedMessage
     */
    String PAYMENT_METHOD_CUSTOM_FIELD_ADDED = "PaymentMethodCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
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
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodCustomFieldAddedMessage
     */
    public static PaymentMethodCustomFieldAddedMessage of() {
        return new PaymentMethodCustomFieldAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomFieldAddedMessage of(final PaymentMethodCustomFieldAddedMessage template) {
        PaymentMethodCustomFieldAddedMessageImpl instance = new PaymentMethodCustomFieldAddedMessageImpl();
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

    public PaymentMethodCustomFieldAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomFieldAddedMessage deepCopy(
            @Nullable final PaymentMethodCustomFieldAddedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomFieldAddedMessageImpl instance = new PaymentMethodCustomFieldAddedMessageImpl();
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
     * builder factory method for PaymentMethodCustomFieldAddedMessage
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessageBuilder builder() {
        return PaymentMethodCustomFieldAddedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomFieldAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessageBuilder builder(
            final PaymentMethodCustomFieldAddedMessage template) {
        return PaymentMethodCustomFieldAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomFieldAddedMessage(Function<PaymentMethodCustomFieldAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomFieldAddedMessage>";
            }
        };
    }
}
