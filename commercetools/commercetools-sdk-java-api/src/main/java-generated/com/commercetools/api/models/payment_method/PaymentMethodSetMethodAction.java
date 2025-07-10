
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the PaymentMethodMethodSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetMethodAction paymentMethodSetMethodAction = PaymentMethodSetMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethod")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetMethodActionImpl.class)
public interface PaymentMethodSetMethodAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetMethodAction
     */
    String SET_METHOD = "setMethod";

    /**
     *  <p>New payment method—for example, a credit card or direct debit. If empty, any existing value will be removed.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>New payment method—for example, a credit card or direct debit. If empty, any existing value will be removed.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     * factory method
     * @return instance of PaymentMethodSetMethodAction
     */
    public static PaymentMethodSetMethodAction of() {
        return new PaymentMethodSetMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetMethodAction of(final PaymentMethodSetMethodAction template) {
        PaymentMethodSetMethodActionImpl instance = new PaymentMethodSetMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    public PaymentMethodSetMethodAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetMethodAction deepCopy(@Nullable final PaymentMethodSetMethodAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetMethodActionImpl instance = new PaymentMethodSetMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetMethodAction
     * @return builder
     */
    public static PaymentMethodSetMethodActionBuilder builder() {
        return PaymentMethodSetMethodActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetMethodActionBuilder builder(final PaymentMethodSetMethodAction template) {
        return PaymentMethodSetMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetMethodAction(Function<PaymentMethodSetMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetMethodAction>";
            }
        };
    }
}
