
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetMethodAction" rel="nofollow">Set Method</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodMethodSetMessage paymentMethodMethodSetMessage = PaymentMethodMethodSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodMethodSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodMethodSetMessageImpl.class)
public interface PaymentMethodMethodSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodMethodSetMessage
     */
    String PAYMENT_METHOD_METHOD_SET = "PaymentMethodMethodSet";

    /**
     *  <p>Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetMethodAction" rel="nofollow">Set Method</a> update action.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetMethodAction" rel="nofollow">Set Method</a> update action.</p>
     * @return oldMethod
     */

    @JsonProperty("oldMethod")
    public String getOldMethod();

    /**
     *  <p>Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetMethodAction" rel="nofollow">Set Method</a> update action.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetMethodAction" rel="nofollow">Set Method</a> update action.</p>
     * @param oldMethod value to be set
     */

    public void setOldMethod(final String oldMethod);

    /**
     * factory method
     * @return instance of PaymentMethodMethodSetMessage
     */
    public static PaymentMethodMethodSetMessage of() {
        return new PaymentMethodMethodSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodMethodSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodMethodSetMessage of(final PaymentMethodMethodSetMessage template) {
        PaymentMethodMethodSetMessageImpl instance = new PaymentMethodMethodSetMessageImpl();
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

    public PaymentMethodMethodSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodMethodSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodMethodSetMessage deepCopy(@Nullable final PaymentMethodMethodSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodMethodSetMessageImpl instance = new PaymentMethodMethodSetMessageImpl();
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
     * builder factory method for PaymentMethodMethodSetMessage
     * @return builder
     */
    public static PaymentMethodMethodSetMessageBuilder builder() {
        return PaymentMethodMethodSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodMethodSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodMethodSetMessageBuilder builder(final PaymentMethodMethodSetMessage template) {
        return PaymentMethodMethodSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodMethodSetMessage(Function<PaymentMethodMethodSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodMethodSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodMethodSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodMethodSetMessage>";
            }
        };
    }
}
