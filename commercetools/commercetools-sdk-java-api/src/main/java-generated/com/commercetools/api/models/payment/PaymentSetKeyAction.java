
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

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static PaymentSetKeyAction of() {
        return new PaymentSetKeyActionImpl();
    }

    public static PaymentSetKeyAction of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionImpl instance = new PaymentSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentSetKeyActionBuilder builder() {
        return PaymentSetKeyActionBuilder.of();
    }

    public static PaymentSetKeyActionBuilder builder(final PaymentSetKeyAction template) {
        return PaymentSetKeyActionBuilder.of(template);
    }

    default <T> T withPaymentSetKeyAction(Function<PaymentSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static PaymentSetKeyAction ofUnset() {
        return new PaymentSetKeyActionImpl(null);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetKeyAction>";
            }
        };
    }
}
