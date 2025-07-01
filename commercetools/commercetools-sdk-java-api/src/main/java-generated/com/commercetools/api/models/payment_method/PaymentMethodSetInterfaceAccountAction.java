
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the PaymentMethodInterfaceAccountSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetInterfaceAccountAction paymentMethodSetInterfaceAccountAction = PaymentMethodSetInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setInterfaceAccount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetInterfaceAccountActionImpl.class)
public interface PaymentMethodSetInterfaceAccountAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetInterfaceAccountAction
     */
    String SET_INTERFACE_ACCOUNT = "setInterfaceAccount";

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     * factory method
     * @return instance of PaymentMethodSetInterfaceAccountAction
     */
    public static PaymentMethodSetInterfaceAccountAction of() {
        return new PaymentMethodSetInterfaceAccountActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetInterfaceAccountAction of(final PaymentMethodSetInterfaceAccountAction template) {
        PaymentMethodSetInterfaceAccountActionImpl instance = new PaymentMethodSetInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    public PaymentMethodSetInterfaceAccountAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetInterfaceAccountAction deepCopy(
            @Nullable final PaymentMethodSetInterfaceAccountAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetInterfaceAccountActionImpl instance = new PaymentMethodSetInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetInterfaceAccountAction
     * @return builder
     */
    public static PaymentMethodSetInterfaceAccountActionBuilder builder() {
        return PaymentMethodSetInterfaceAccountActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetInterfaceAccountActionBuilder builder(
            final PaymentMethodSetInterfaceAccountAction template) {
        return PaymentMethodSetInterfaceAccountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetInterfaceAccountAction(
            Function<PaymentMethodSetInterfaceAccountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetInterfaceAccountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetInterfaceAccountAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetInterfaceAccountAction>";
            }
        };
    }
}
