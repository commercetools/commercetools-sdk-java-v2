
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
 *     PaymentMethodInfoTokenSetMessagePayload paymentMethodInfoTokenSetMessagePayload = PaymentMethodInfoTokenSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoTokenSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoTokenSetMessagePayloadImpl.class)
public interface PaymentMethodInfoTokenSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoTokenSetMessagePayload
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
     * @return instance of PaymentMethodInfoTokenSetMessagePayload
     */
    public static PaymentMethodInfoTokenSetMessagePayload of() {
        return new PaymentMethodInfoTokenSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoTokenSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoTokenSetMessagePayload of(final PaymentMethodInfoTokenSetMessagePayload template) {
        PaymentMethodInfoTokenSetMessagePayloadImpl instance = new PaymentMethodInfoTokenSetMessagePayloadImpl();
        instance.setToken(template.getToken());
        instance.setOldToken(template.getOldToken());
        return instance;
    }

    public PaymentMethodInfoTokenSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoTokenSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoTokenSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoTokenSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoTokenSetMessagePayloadImpl instance = new PaymentMethodInfoTokenSetMessagePayloadImpl();
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setOldToken(
            com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getOldToken()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoTokenSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoTokenSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoTokenSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessagePayloadBuilder builder(
            final PaymentMethodInfoTokenSetMessagePayload template) {
        return PaymentMethodInfoTokenSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoTokenSetMessagePayload(
            Function<PaymentMethodInfoTokenSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoTokenSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoTokenSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoTokenSetMessagePayload>";
            }
        };
    }
}
