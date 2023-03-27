
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetInterfaceIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = PaymentSetInterfaceIdAction.builder()
 *             .interfaceId("{interfaceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetInterfaceIdActionImpl.class)
public interface PaymentSetInterfaceIdAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetInterfaceIdAction
     */
    String SET_INTERFACE_ID = "setInterfaceId";

    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     * @return interfaceId
     */
    @NotNull
    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     * factory method
     * @return instance of PaymentSetInterfaceIdAction
     */
    public static PaymentSetInterfaceIdAction of() {
        return new PaymentSetInterfaceIdActionImpl();
    }

    /**
     * factory method to copy an instance of PaymentSetInterfaceIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetInterfaceIdAction of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionImpl instance = new PaymentSetInterfaceIdActionImpl();
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentSetInterfaceIdAction
     * @return builder
     */
    public static PaymentSetInterfaceIdActionBuilder builder() {
        return PaymentSetInterfaceIdActionBuilder.of();
    }

    /**
     * create builder for PaymentSetInterfaceIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetInterfaceIdActionBuilder builder(final PaymentSetInterfaceIdAction template) {
        return PaymentSetInterfaceIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetInterfaceIdAction(Function<PaymentSetInterfaceIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetInterfaceIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetInterfaceIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetInterfaceIdAction>";
            }
        };
    }
}
