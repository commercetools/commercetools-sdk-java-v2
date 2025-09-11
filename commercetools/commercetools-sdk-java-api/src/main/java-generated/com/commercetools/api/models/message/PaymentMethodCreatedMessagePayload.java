
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/payment-methods:POST" rel="nofollow">Create PaymentMethod</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCreatedMessagePayload paymentMethodCreatedMessagePayload = PaymentMethodCreatedMessagePayload.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCreatedMessagePayloadImpl.class)
public interface PaymentMethodCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCreatedMessagePayload
     */
    String PAYMENT_METHOD_CREATED = "PaymentMethodCreated";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethod getPaymentMethod();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethod paymentMethod);

    /**
     * factory method
     * @return instance of PaymentMethodCreatedMessagePayload
     */
    public static PaymentMethodCreatedMessagePayload of() {
        return new PaymentMethodCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCreatedMessagePayload of(final PaymentMethodCreatedMessagePayload template) {
        PaymentMethodCreatedMessagePayloadImpl instance = new PaymentMethodCreatedMessagePayloadImpl();
        instance.setPaymentMethod(template.getPaymentMethod());
        return instance;
    }

    public PaymentMethodCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCreatedMessagePayload deepCopy(
            @Nullable final PaymentMethodCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCreatedMessagePayloadImpl instance = new PaymentMethodCreatedMessagePayloadImpl();
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethod.deepCopy(template.getPaymentMethod()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCreatedMessagePayload
     * @return builder
     */
    public static PaymentMethodCreatedMessagePayloadBuilder builder() {
        return PaymentMethodCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCreatedMessagePayloadBuilder builder(final PaymentMethodCreatedMessagePayload template) {
        return PaymentMethodCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCreatedMessagePayload(Function<PaymentMethodCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCreatedMessagePayload>";
            }
        };
    }
}
