
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
 * PaymentSetStatusInterfaceTextAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceTextAction paymentSetStatusInterfaceTextAction = PaymentSetStatusInterfaceTextAction.builder()
 *             .interfaceText("{interfaceText}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStatusInterfaceText")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetStatusInterfaceTextActionImpl.class)
public interface PaymentSetStatusInterfaceTextAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetStatusInterfaceTextAction
     */
    String SET_STATUS_INTERFACE_TEXT = "setStatusInterfaceText";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return interfaceText
     */
    @NotNull
    @JsonProperty("interfaceText")
    public String getInterfaceText();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param interfaceText value to be set
     */

    public void setInterfaceText(final String interfaceText);

    /**
     * factory method
     * @return instance of PaymentSetStatusInterfaceTextAction
     */
    public static PaymentSetStatusInterfaceTextAction of() {
        return new PaymentSetStatusInterfaceTextActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetStatusInterfaceTextAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetStatusInterfaceTextAction of(final PaymentSetStatusInterfaceTextAction template) {
        PaymentSetStatusInterfaceTextActionImpl instance = new PaymentSetStatusInterfaceTextActionImpl();
        instance.setInterfaceText(template.getInterfaceText());
        return instance;
    }

    public PaymentSetStatusInterfaceTextAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetStatusInterfaceTextAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetStatusInterfaceTextAction deepCopy(
            @Nullable final PaymentSetStatusInterfaceTextAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetStatusInterfaceTextActionImpl instance = new PaymentSetStatusInterfaceTextActionImpl();
        instance.setInterfaceText(template.getInterfaceText());
        return instance;
    }

    /**
     * builder factory method for PaymentSetStatusInterfaceTextAction
     * @return builder
     */
    public static PaymentSetStatusInterfaceTextActionBuilder builder() {
        return PaymentSetStatusInterfaceTextActionBuilder.of();
    }

    /**
     * create builder for PaymentSetStatusInterfaceTextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetStatusInterfaceTextActionBuilder builder(
            final PaymentSetStatusInterfaceTextAction template) {
        return PaymentSetStatusInterfaceTextActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetStatusInterfaceTextAction(Function<PaymentSetStatusInterfaceTextAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceTextAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceTextAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetStatusInterfaceTextAction>";
            }
        };
    }
}
