
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This action generates the PaymentMethodInfoInterfaceSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoInterfaceAction paymentSetMethodInfoInterfaceAction = PaymentSetMethodInfoInterfaceAction.builder()
 *             .interface("{interface}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoInterface")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoInterfaceAction
     */
    String SET_METHOD_INFO_INTERFACE = "setMethodInfoInterface";

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @return interface
     */
    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @param _interface value to be set
     */

    public void setInterface(final String _interface);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoInterfaceAction
     */
    public static PaymentSetMethodInfoInterfaceAction of() {
        return new PaymentSetMethodInfoInterfaceActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoInterfaceAction of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    public PaymentSetMethodInfoInterfaceAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoInterfaceAction deepCopy(
            @Nullable final PaymentSetMethodInfoInterfaceAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoInterfaceAction
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceActionBuilder builder() {
        return PaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoInterfaceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceActionBuilder builder(
            final PaymentSetMethodInfoInterfaceAction template) {
        return PaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoInterfaceAction(Function<PaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoInterfaceAction>";
            }
        };
    }
}
