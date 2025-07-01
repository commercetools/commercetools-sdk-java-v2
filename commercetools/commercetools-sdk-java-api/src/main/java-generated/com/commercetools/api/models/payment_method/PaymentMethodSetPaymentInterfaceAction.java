
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the PaymentMethodPaymentInterfaceSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetPaymentInterfaceAction paymentMethodSetPaymentInterfaceAction = PaymentMethodSetPaymentInterfaceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPaymentInterface")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetPaymentInterfaceActionImpl.class)
public interface PaymentMethodSetPaymentInterfaceAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetPaymentInterfaceAction
     */
    String SET_PAYMENT_INTERFACE = "setPaymentInterface";

    /**
     *  <p>New payment service that processes the Payment—for example, a PSP. If empty, any existing value will be removed.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>New payment service that processes the Payment—for example, a PSP. If empty, any existing value will be removed.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     * factory method
     * @return instance of PaymentMethodSetPaymentInterfaceAction
     */
    public static PaymentMethodSetPaymentInterfaceAction of() {
        return new PaymentMethodSetPaymentInterfaceActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetPaymentInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetPaymentInterfaceAction of(final PaymentMethodSetPaymentInterfaceAction template) {
        PaymentMethodSetPaymentInterfaceActionImpl instance = new PaymentMethodSetPaymentInterfaceActionImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        return instance;
    }

    public PaymentMethodSetPaymentInterfaceAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetPaymentInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetPaymentInterfaceAction deepCopy(
            @Nullable final PaymentMethodSetPaymentInterfaceAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetPaymentInterfaceActionImpl instance = new PaymentMethodSetPaymentInterfaceActionImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetPaymentInterfaceAction
     * @return builder
     */
    public static PaymentMethodSetPaymentInterfaceActionBuilder builder() {
        return PaymentMethodSetPaymentInterfaceActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetPaymentInterfaceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetPaymentInterfaceActionBuilder builder(
            final PaymentMethodSetPaymentInterfaceAction template) {
        return PaymentMethodSetPaymentInterfaceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetPaymentInterfaceAction(
            Function<PaymentMethodSetPaymentInterfaceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetPaymentInterfaceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetPaymentInterfaceAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetPaymentInterfaceAction>";
            }
        };
    }
}
