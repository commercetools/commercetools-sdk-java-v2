
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>This update action generates the PaymentMethodNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetNameAction paymentMethodSetNameAction = PaymentMethodSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetNameActionImpl.class)
public interface PaymentMethodSetNameAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetNameAction
     */
    String SET_NAME = "setName";

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
     * @return instance of PaymentMethodSetNameAction
     */
    public static PaymentMethodSetNameAction of() {
        return new PaymentMethodSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetNameAction of(final PaymentMethodSetNameAction template) {
        PaymentMethodSetNameActionImpl instance = new PaymentMethodSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public PaymentMethodSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetNameAction deepCopy(@Nullable final PaymentMethodSetNameAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetNameActionImpl instance = new PaymentMethodSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetNameAction
     * @return builder
     */
    public static PaymentMethodSetNameActionBuilder builder() {
        return PaymentMethodSetNameActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetNameActionBuilder builder(final PaymentMethodSetNameAction template) {
        return PaymentMethodSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetNameAction(Function<PaymentMethodSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetNameAction>";
            }
        };
    }
}
