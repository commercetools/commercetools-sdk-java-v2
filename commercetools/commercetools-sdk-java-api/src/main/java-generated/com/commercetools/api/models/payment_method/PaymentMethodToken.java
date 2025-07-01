
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PaymentMethodToken
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodToken paymentMethodToken = PaymentMethodToken.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodTokenImpl.class)
public interface PaymentMethodToken {

    /**
     *  <p>Tokenized representation of the Payment Method.</p>
     *  <p>It is <em>displayed</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of an API Extension for Payments and PaymentMethods</li>
     *   <li>when querying Payments and PaymentMethods</li>
     *  </ul>
     *  <p>It is <em>masked</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of Payment and PaymentMethod messages</li>
     *   <li>when querying MyPayments</li>
     *   <li>in referenced Payments and PaymentMethods embedded through Reference Expansion</li>
     *  </ul>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>Tokenized representation of the Payment Method.</p>
     *  <p>It is <em>displayed</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of an API Extension for Payments and PaymentMethods</li>
     *   <li>when querying Payments and PaymentMethods</li>
     *  </ul>
     *  <p>It is <em>masked</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of Payment and PaymentMethod messages</li>
     *   <li>when querying MyPayments</li>
     *   <li>in referenced Payments and PaymentMethods embedded through Reference Expansion</li>
     *  </ul>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of PaymentMethodToken
     */
    public static PaymentMethodToken of() {
        return new PaymentMethodTokenImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodToken
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodToken of(final PaymentMethodToken template) {
        PaymentMethodTokenImpl instance = new PaymentMethodTokenImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodToken copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodToken
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodToken deepCopy(@Nullable final PaymentMethodToken template) {
        if (template == null) {
            return null;
        }
        PaymentMethodTokenImpl instance = new PaymentMethodTokenImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodToken
     * @return builder
     */
    public static PaymentMethodTokenBuilder builder() {
        return PaymentMethodTokenBuilder.of();
    }

    /**
     * create builder for PaymentMethodToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodTokenBuilder builder(final PaymentMethodToken template) {
        return PaymentMethodTokenBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodToken(Function<PaymentMethodToken, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodToken>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodToken>";
            }
        };
    }
}
