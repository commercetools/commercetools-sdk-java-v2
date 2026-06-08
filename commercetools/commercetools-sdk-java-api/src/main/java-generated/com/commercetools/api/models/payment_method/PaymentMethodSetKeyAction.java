
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodKeySetMessage" rel="nofollow">PaymentMethodKeySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetKeyAction paymentMethodSetKeyAction = PaymentMethodSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetKeyActionImpl.class)
public interface PaymentMethodSetKeyAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PaymentMethodSetKeyAction
     */
    public static PaymentMethodSetKeyAction of() {
        return new PaymentMethodSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetKeyAction of(final PaymentMethodSetKeyAction template) {
        PaymentMethodSetKeyActionImpl instance = new PaymentMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public PaymentMethodSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetKeyAction deepCopy(@Nullable final PaymentMethodSetKeyAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetKeyActionImpl instance = new PaymentMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetKeyAction
     * @return builder
     */
    public static PaymentMethodSetKeyActionBuilder builder() {
        return PaymentMethodSetKeyActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetKeyActionBuilder builder(final PaymentMethodSetKeyAction template) {
        return PaymentMethodSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetKeyAction(Function<PaymentMethodSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetKeyAction>";
            }
        };
    }
}
