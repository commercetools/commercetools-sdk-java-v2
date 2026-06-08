
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
 *     PaymentMethodDeletedMessagePayload paymentMethodDeletedMessagePayload = PaymentMethodDeletedMessagePayload.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodDeletedMessagePayloadImpl.class)
public interface PaymentMethodDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodDeletedMessagePayload
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
     * @return instance of PaymentMethodDeletedMessagePayload
     */
    public static PaymentMethodDeletedMessagePayload of() {
        return new PaymentMethodDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodDeletedMessagePayload of(final PaymentMethodDeletedMessagePayload template) {
        PaymentMethodDeletedMessagePayloadImpl instance = new PaymentMethodDeletedMessagePayloadImpl();
        instance.setPaymentMethod(template.getPaymentMethod());
        return instance;
    }

    public PaymentMethodDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodDeletedMessagePayload deepCopy(
            @Nullable final PaymentMethodDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodDeletedMessagePayloadImpl instance = new PaymentMethodDeletedMessagePayloadImpl();
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethod.deepCopy(template.getPaymentMethod()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodDeletedMessagePayload
     * @return builder
     */
    public static PaymentMethodDeletedMessagePayloadBuilder builder() {
        return PaymentMethodDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDeletedMessagePayloadBuilder builder(final PaymentMethodDeletedMessagePayload template) {
        return PaymentMethodDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodDeletedMessagePayload(Function<PaymentMethodDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodDeletedMessagePayload>";
            }
        };
    }
}
