
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodNameSetMessage paymentMethodNameSetMessage = PaymentMethodNameSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodNameSetMessageImpl.class)
public interface PaymentMethodNameSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodNameSetMessage
     */
    String PAYMENT_METHOD_NAME_SET = "PaymentMethodNameSet";

    /**
     *  <p>Name of the Payment Method after the Set Name update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Name of the Payment Method before the Set Name update action.</p>
     * @return oldName
     */
    @Valid
    @JsonProperty("oldName")
    public LocalizedString getOldName();

    /**
     *  <p>Name of the Payment Method after the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Name of the Payment Method before the Set Name update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of PaymentMethodNameSetMessage
     */
    public static PaymentMethodNameSetMessage of() {
        return new PaymentMethodNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodNameSetMessage of(final PaymentMethodNameSetMessage template) {
        PaymentMethodNameSetMessageImpl instance = new PaymentMethodNameSetMessageImpl();
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
        instance.setOldName(template.getOldName());
        return instance;
    }

    public PaymentMethodNameSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodNameSetMessage deepCopy(@Nullable final PaymentMethodNameSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodNameSetMessageImpl instance = new PaymentMethodNameSetMessageImpl();
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
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setOldName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldName()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodNameSetMessage
     * @return builder
     */
    public static PaymentMethodNameSetMessageBuilder builder() {
        return PaymentMethodNameSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodNameSetMessageBuilder builder(final PaymentMethodNameSetMessage template) {
        return PaymentMethodNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodNameSetMessage(Function<PaymentMethodNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodNameSetMessage>";
            }
        };
    }
}
