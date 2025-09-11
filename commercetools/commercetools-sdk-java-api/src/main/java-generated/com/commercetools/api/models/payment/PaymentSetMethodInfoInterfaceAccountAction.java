
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceAccountSetMessage" rel="nofollow">PaymentMethodInfoInterfaceAccountSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoInterfaceAccountAction paymentSetMethodInfoInterfaceAccountAction = PaymentSetMethodInfoInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoInterfaceAccount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceAccountActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAccountAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoInterfaceAccountAction
     */
    String SET_METHOD_INFO_INTERFACE_ACCOUNT = "setMethodInfoInterfaceAccount";

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
     * @return instance of PaymentSetMethodInfoInterfaceAccountAction
     */
    public static PaymentSetMethodInfoInterfaceAccountAction of() {
        return new PaymentSetMethodInfoInterfaceAccountActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoInterfaceAccountAction of(
            final PaymentSetMethodInfoInterfaceAccountAction template) {
        PaymentSetMethodInfoInterfaceAccountActionImpl instance = new PaymentSetMethodInfoInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    public PaymentSetMethodInfoInterfaceAccountAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoInterfaceAccountAction deepCopy(
            @Nullable final PaymentSetMethodInfoInterfaceAccountAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoInterfaceAccountActionImpl instance = new PaymentSetMethodInfoInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoInterfaceAccountAction
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceAccountActionBuilder builder() {
        return PaymentSetMethodInfoInterfaceAccountActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceAccountActionBuilder builder(
            final PaymentSetMethodInfoInterfaceAccountAction template) {
        return PaymentSetMethodInfoInterfaceAccountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoInterfaceAccountAction(
            Function<PaymentSetMethodInfoInterfaceAccountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAccountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAccountAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoInterfaceAccountAction>";
            }
        };
    }
}
