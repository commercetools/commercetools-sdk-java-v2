
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetKeyAction paymentSetKeyAction = PaymentSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetKeyActionImpl.class)
public interface PaymentSetKeyAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PaymentSetKeyAction
     */
    public static PaymentSetKeyAction of() {
        return new PaymentSetKeyActionImpl();
    }

    /**
     * factory method to copy an instance of PaymentSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetKeyAction of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionImpl instance = new PaymentSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentSetKeyAction
     * @return builder
     */
    public static PaymentSetKeyActionBuilder builder() {
        return PaymentSetKeyActionBuilder.of();
    }

    /**
     * create builder for PaymentSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetKeyActionBuilder builder(final PaymentSetKeyAction template) {
        return PaymentSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetKeyAction(Function<PaymentSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static PaymentSetKeyAction ofUnset() {
        return PaymentSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetKeyAction>";
            }
        };
    }
}
