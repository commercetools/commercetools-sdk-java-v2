
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the Payment is already associated with a Customer, an InvalidOperation error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetAnonymousIdAction paymentSetAnonymousIdAction = PaymentSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAnonymousId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetAnonymousIdActionImpl.class)
public interface PaymentSetAnonymousIdAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetAnonymousIdAction
     */
    String SET_ANONYMOUS_ID = "setAnonymousId";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     * factory method
     * @return instance of PaymentSetAnonymousIdAction
     */
    public static PaymentSetAnonymousIdAction of() {
        return new PaymentSetAnonymousIdActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetAnonymousIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetAnonymousIdAction of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionImpl instance = new PaymentSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public PaymentSetAnonymousIdAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetAnonymousIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetAnonymousIdAction deepCopy(@Nullable final PaymentSetAnonymousIdAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetAnonymousIdActionImpl instance = new PaymentSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    /**
     * builder factory method for PaymentSetAnonymousIdAction
     * @return builder
     */
    public static PaymentSetAnonymousIdActionBuilder builder() {
        return PaymentSetAnonymousIdActionBuilder.of();
    }

    /**
     * create builder for PaymentSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetAnonymousIdActionBuilder builder(final PaymentSetAnonymousIdAction template) {
        return PaymentSetAnonymousIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetAnonymousIdAction(Function<PaymentSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetAnonymousIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetAnonymousIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetAnonymousIdAction>";
            }
        };
    }
}
