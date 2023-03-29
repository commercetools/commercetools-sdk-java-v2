
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoNameAction paymentSetMethodInfoNameAction = PaymentSetMethodInfoNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoNameActionImpl.class)
public interface PaymentSetMethodInfoNameAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoNameAction
     */
    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoNameAction
     */
    public static PaymentSetMethodInfoNameAction of() {
        return new PaymentSetMethodInfoNameActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoNameAction of(final PaymentSetMethodInfoNameAction template) {
        PaymentSetMethodInfoNameActionImpl instance = new PaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoNameAction deepCopy(@Nullable final PaymentSetMethodInfoNameAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoNameActionImpl instance = new PaymentSetMethodInfoNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoNameAction
     * @return builder
     */
    public static PaymentSetMethodInfoNameActionBuilder builder() {
        return PaymentSetMethodInfoNameActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoNameActionBuilder builder(final PaymentSetMethodInfoNameAction template) {
        return PaymentSetMethodInfoNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoNameAction(Function<PaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoNameAction>";
            }
        };
    }
}
