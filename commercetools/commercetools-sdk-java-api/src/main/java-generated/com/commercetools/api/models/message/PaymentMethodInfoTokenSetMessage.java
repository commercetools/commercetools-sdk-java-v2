
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment_method.PaymentMethodToken;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoTokenSetMessage paymentMethodInfoTokenSetMessage = PaymentMethodInfoTokenSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoTokenSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoTokenSetMessageImpl.class)
public interface PaymentMethodInfoTokenSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoTokenSetMessage
     */
    String PAYMENT_METHOD_INFO_TOKEN_SET = "PaymentMethodInfoTokenSet";

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @return oldToken
     */
    @Valid
    @JsonProperty("oldToken")
    public PaymentMethodToken getOldToken();

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param oldToken value to be set
     */

    public void setOldToken(final PaymentMethodToken oldToken);

    /**
     * factory method
     * @return instance of PaymentMethodInfoTokenSetMessage
     */
    public static PaymentMethodInfoTokenSetMessage of() {
        return new PaymentMethodInfoTokenSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoTokenSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoTokenSetMessage of(final PaymentMethodInfoTokenSetMessage template) {
        PaymentMethodInfoTokenSetMessageImpl instance = new PaymentMethodInfoTokenSetMessageImpl();
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
        instance.setToken(template.getToken());
        instance.setOldToken(template.getOldToken());
        return instance;
    }

    public PaymentMethodInfoTokenSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoTokenSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoTokenSetMessage deepCopy(@Nullable final PaymentMethodInfoTokenSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoTokenSetMessageImpl instance = new PaymentMethodInfoTokenSetMessageImpl();
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
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setOldToken(
            com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getOldToken()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoTokenSetMessage
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessageBuilder builder() {
        return PaymentMethodInfoTokenSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoTokenSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessageBuilder builder(final PaymentMethodInfoTokenSetMessage template) {
        return PaymentMethodInfoTokenSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoTokenSetMessage(Function<PaymentMethodInfoTokenSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoTokenSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoTokenSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoTokenSetMessage>";
            }
        };
    }
}
