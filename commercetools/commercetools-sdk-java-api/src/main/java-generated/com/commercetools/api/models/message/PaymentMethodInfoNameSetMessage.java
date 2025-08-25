
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoNameSetMessage paymentMethodInfoNameSetMessage = PaymentMethodInfoNameSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoNameSetMessageImpl.class)
public interface PaymentMethodInfoNameSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoNameSetMessage
     */
    String PAYMENT_METHOD_INFO_NAME_SET = "PaymentMethodInfoNameSet";

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @return oldName
     */
    @Valid
    @JsonProperty("oldName")
    public LocalizedString getOldName();

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of PaymentMethodInfoNameSetMessage
     */
    public static PaymentMethodInfoNameSetMessage of() {
        return new PaymentMethodInfoNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoNameSetMessage of(final PaymentMethodInfoNameSetMessage template) {
        PaymentMethodInfoNameSetMessageImpl instance = new PaymentMethodInfoNameSetMessageImpl();
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

    public PaymentMethodInfoNameSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoNameSetMessage deepCopy(@Nullable final PaymentMethodInfoNameSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoNameSetMessageImpl instance = new PaymentMethodInfoNameSetMessageImpl();
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
     * builder factory method for PaymentMethodInfoNameSetMessage
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessageBuilder builder() {
        return PaymentMethodInfoNameSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessageBuilder builder(final PaymentMethodInfoNameSetMessage template) {
        return PaymentMethodInfoNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoNameSetMessage(Function<PaymentMethodInfoNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoNameSetMessage>";
            }
        };
    }
}
