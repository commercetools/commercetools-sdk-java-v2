
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
 *  <p>Generated after a successful <span>Delete PaymentMethod</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDeletedMessage paymentMethodDeletedMessage = PaymentMethodDeletedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodDeletedMessageImpl.class)
public interface PaymentMethodDeletedMessage extends Message {

    /**
     * discriminator value for PaymentMethodDeletedMessage
     */
    String PAYMENT_METHOD_DELETED = "PaymentMethodDeleted";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethod getPaymentMethod();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethod paymentMethod);

    /**
     * factory method
     * @return instance of PaymentMethodDeletedMessage
     */
    public static PaymentMethodDeletedMessage of() {
        return new PaymentMethodDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodDeletedMessage of(final PaymentMethodDeletedMessage template) {
        PaymentMethodDeletedMessageImpl instance = new PaymentMethodDeletedMessageImpl();
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

    public PaymentMethodDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodDeletedMessage deepCopy(@Nullable final PaymentMethodDeletedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodDeletedMessageImpl instance = new PaymentMethodDeletedMessageImpl();
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
     * builder factory method for PaymentMethodDeletedMessage
     * @return builder
     */
    public static PaymentMethodDeletedMessageBuilder builder() {
        return PaymentMethodDeletedMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDeletedMessageBuilder builder(final PaymentMethodDeletedMessage template) {
        return PaymentMethodDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodDeletedMessage(Function<PaymentMethodDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodDeletedMessage>";
            }
        };
    }
}
