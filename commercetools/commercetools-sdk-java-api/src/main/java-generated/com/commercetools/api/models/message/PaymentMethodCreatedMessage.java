
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment_method.PaymentMethod;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create PaymentMethod request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCreatedMessage paymentMethodCreatedMessage = PaymentMethodCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCreatedMessageImpl.class)
public interface PaymentMethodCreatedMessage extends Message {

    /**
     * discriminator value for PaymentMethodCreatedMessage
     */
    String PAYMENT_METHOD_CREATED = "PaymentMethodCreated";

    /**
     *  <p>PaymentMethod that was created.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethod getPaymentMethod();

    /**
     *  <p>PaymentMethod that was created.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethod paymentMethod);

    /**
     * factory method
     * @return instance of PaymentMethodCreatedMessage
     */
    public static PaymentMethodCreatedMessage of() {
        return new PaymentMethodCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCreatedMessage of(final PaymentMethodCreatedMessage template) {
        PaymentMethodCreatedMessageImpl instance = new PaymentMethodCreatedMessageImpl();
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
        instance.setPaymentMethod(template.getPaymentMethod());
        return instance;
    }

    public PaymentMethodCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCreatedMessage deepCopy(@Nullable final PaymentMethodCreatedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCreatedMessageImpl instance = new PaymentMethodCreatedMessageImpl();
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
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethod.deepCopy(template.getPaymentMethod()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCreatedMessage
     * @return builder
     */
    public static PaymentMethodCreatedMessageBuilder builder() {
        return PaymentMethodCreatedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCreatedMessageBuilder builder(final PaymentMethodCreatedMessage template) {
        return PaymentMethodCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCreatedMessage(Function<PaymentMethodCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCreatedMessage>";
            }
        };
    }
}
