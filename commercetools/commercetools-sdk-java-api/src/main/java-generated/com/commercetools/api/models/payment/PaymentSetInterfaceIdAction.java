
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
 *  <p>This action generates the PaymentInterfaceIdSet Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setInterfaceId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetInterfaceIdActionImpl.class)
public interface PaymentSetInterfaceIdAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetInterfaceIdAction
     */
    String SET_INTERFACE_ID = "setInterfaceId";

    /**
     *  <p>Value to set. The combination of <code>interfaceId</code> and <code>paymentInterface</code> of a PaymentMethodInfo must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @return interfaceId
     */
    @NotNull
    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Value to set. The combination of <code>interfaceId</code> and <code>paymentInterface</code> of a PaymentMethodInfo must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
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
     * factory method to create a shallow copy PaymentSetInterfaceIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetInterfaceIdAction of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionImpl instance = new PaymentSetInterfaceIdActionImpl();
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    public PaymentSetInterfaceIdAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetInterfaceIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetInterfaceIdAction deepCopy(@Nullable final PaymentSetInterfaceIdAction template) {
        if (template == null) {
            return null;
        }
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
