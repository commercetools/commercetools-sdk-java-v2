
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set MethodInfo Method update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoMethodSetMessage paymentMethodInfoMethodSetMessage = PaymentMethodInfoMethodSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoMethodSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoMethodSetMessageImpl.class)
public interface PaymentMethodInfoMethodSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoMethodSetMessage
     */
    String PAYMENT_METHOD_INFO_METHOD_SET = "PaymentMethodInfoMethodSet";

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @return oldMethod
     */

    @JsonProperty("oldMethod")
    public String getOldMethod();

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @param oldMethod value to be set
     */

    public void setOldMethod(final String oldMethod);

    /**
     * factory method
     * @return instance of PaymentMethodInfoMethodSetMessage
     */
    public static PaymentMethodInfoMethodSetMessage of() {
        return new PaymentMethodInfoMethodSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoMethodSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoMethodSetMessage of(final PaymentMethodInfoMethodSetMessage template) {
        PaymentMethodInfoMethodSetMessageImpl instance = new PaymentMethodInfoMethodSetMessageImpl();
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
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    public PaymentMethodInfoMethodSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoMethodSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoMethodSetMessage deepCopy(
            @Nullable final PaymentMethodInfoMethodSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoMethodSetMessageImpl instance = new PaymentMethodInfoMethodSetMessageImpl();
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
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoMethodSetMessage
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessageBuilder builder() {
        return PaymentMethodInfoMethodSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoMethodSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessageBuilder builder(final PaymentMethodInfoMethodSetMessage template) {
        return PaymentMethodInfoMethodSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoMethodSetMessage(Function<PaymentMethodInfoMethodSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoMethodSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoMethodSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoMethodSetMessage>";
            }
        };
    }
}
