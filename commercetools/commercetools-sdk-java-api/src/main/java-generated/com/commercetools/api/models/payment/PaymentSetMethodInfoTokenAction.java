
package com.commercetools.api.models.payment;

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
 *  <p>This action generates the PaymentMethodInfoTokenSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoTokenAction paymentSetMethodInfoTokenAction = PaymentSetMethodInfoTokenAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoToken")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoTokenActionImpl.class)
public interface PaymentSetMethodInfoTokenAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoTokenAction
     */
    String SET_METHOD_INFO_TOKEN = "setMethodInfoToken";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoTokenAction
     */
    public static PaymentSetMethodInfoTokenAction of() {
        return new PaymentSetMethodInfoTokenActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoTokenAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoTokenAction of(final PaymentSetMethodInfoTokenAction template) {
        PaymentSetMethodInfoTokenActionImpl instance = new PaymentSetMethodInfoTokenActionImpl();
        instance.setToken(template.getToken());
        return instance;
    }

    public PaymentSetMethodInfoTokenAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoTokenAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoTokenAction deepCopy(@Nullable final PaymentSetMethodInfoTokenAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoTokenActionImpl instance = new PaymentSetMethodInfoTokenActionImpl();
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoTokenAction
     * @return builder
     */
    public static PaymentSetMethodInfoTokenActionBuilder builder() {
        return PaymentSetMethodInfoTokenActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoTokenAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoTokenActionBuilder builder(final PaymentSetMethodInfoTokenAction template) {
        return PaymentSetMethodInfoTokenActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoTokenAction(Function<PaymentSetMethodInfoTokenAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoTokenAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoTokenAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoTokenAction>";
            }
        };
    }
}
