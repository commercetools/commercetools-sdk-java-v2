
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the PaymentStatusInterfaceCodeSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceCodeAction paymentSetStatusInterfaceCodeAction = PaymentSetStatusInterfaceCodeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetStatusInterfaceCodeActionImpl.class)
public interface PaymentSetStatusInterfaceCodeAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetStatusInterfaceCodeAction
     */
    String SET_STATUS_INTERFACE_CODE = "setStatusInterfaceCode";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return interfaceCode
     */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param interfaceCode value to be set
     */

    public void setInterfaceCode(final String interfaceCode);

    /**
     * factory method
     * @return instance of PaymentSetStatusInterfaceCodeAction
     */
    public static PaymentSetStatusInterfaceCodeAction of() {
        return new PaymentSetStatusInterfaceCodeActionImpl();
    }

    /**
     * factory method to copy an instance of PaymentSetStatusInterfaceCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetStatusInterfaceCodeAction of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionImpl instance = new PaymentSetStatusInterfaceCodeActionImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    /**
     * builder factory method for PaymentSetStatusInterfaceCodeAction
     * @return builder
     */
    public static PaymentSetStatusInterfaceCodeActionBuilder builder() {
        return PaymentSetStatusInterfaceCodeActionBuilder.of();
    }

    /**
     * create builder for PaymentSetStatusInterfaceCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetStatusInterfaceCodeActionBuilder builder(
            final PaymentSetStatusInterfaceCodeAction template) {
        return PaymentSetStatusInterfaceCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetStatusInterfaceCodeAction(Function<PaymentSetStatusInterfaceCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetStatusInterfaceCodeAction>";
            }
        };
    }
}
