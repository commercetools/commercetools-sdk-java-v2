
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDefaultSetMessage paymentMethodDefaultSetMessage = PaymentMethodDefaultSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .default(true)
 *             .oldDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodDefaultSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodDefaultSetMessageImpl.class)
public interface PaymentMethodDefaultSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodDefaultSetMessage
     */
    String PAYMENT_METHOD_DEFAULT_SET = "PaymentMethodDefaultSet";

    /**
     *  <p>Default Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @return default
     */
    @NotNull
    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Default Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @return oldDefault
     */
    @NotNull
    @JsonProperty("oldDefault")
    public Boolean getOldDefault();

    /**
     *  <p>Default Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     *  <p>Default Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @param oldDefault value to be set
     */

    public void setOldDefault(final Boolean oldDefault);

    /**
     * factory method
     * @return instance of PaymentMethodDefaultSetMessage
     */
    public static PaymentMethodDefaultSetMessage of() {
        return new PaymentMethodDefaultSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodDefaultSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodDefaultSetMessage of(final PaymentMethodDefaultSetMessage template) {
        PaymentMethodDefaultSetMessageImpl instance = new PaymentMethodDefaultSetMessageImpl();
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
        instance.setDefault(template.getDefault());
        instance.setOldDefault(template.getOldDefault());
        return instance;
    }

    public PaymentMethodDefaultSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodDefaultSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodDefaultSetMessage deepCopy(@Nullable final PaymentMethodDefaultSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodDefaultSetMessageImpl instance = new PaymentMethodDefaultSetMessageImpl();
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
        instance.setDefault(template.getDefault());
        instance.setOldDefault(template.getOldDefault());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodDefaultSetMessage
     * @return builder
     */
    public static PaymentMethodDefaultSetMessageBuilder builder() {
        return PaymentMethodDefaultSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodDefaultSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDefaultSetMessageBuilder builder(final PaymentMethodDefaultSetMessage template) {
        return PaymentMethodDefaultSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodDefaultSetMessage(Function<PaymentMethodDefaultSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDefaultSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDefaultSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodDefaultSetMessage>";
            }
        };
    }
}
